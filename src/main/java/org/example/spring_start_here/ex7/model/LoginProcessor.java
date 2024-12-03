package org.example.spring_start_here.ex7.model;

import lombok.Getter;
import lombok.Setter;
import org.example.spring_start_here.ex7.service.LoggedUserManagementService;
import org.example.spring_start_here.ex7.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService,
                          LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login() {
        loginCountService.increment();

        String username = this.username;
        String password = this.password;

        boolean loginResult = false;
        if ("ronaldo".equals(username) && "faker".equals(password)) {
            loginResult = true;
            loggedUserManagementService.setUsername(username);
        }

        return loginResult;
    }
}
