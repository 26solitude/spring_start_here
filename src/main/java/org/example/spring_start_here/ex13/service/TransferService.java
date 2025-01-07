package org.example.spring_start_here.ex13.service;

import org.example.spring_start_here.ex13.model.Account;
import org.example.spring_start_here.ex13.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.example.spring_start_here.ex13.exception.AccountNotFoundException;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount) throws AccountNotFoundException {

        Account sender = accountRepository.findById(idSender)
                .orElseThrow(AccountNotFoundException::new);
        Account receiver = accountRepository.findById(idReceiver)
                .orElseThrow(AccountNotFoundException::new);

        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);

        accountRepository.changeAmount(idSender, senderNewAmount);
        accountRepository.changeAmount(idReceiver, receiverNewAmount);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name){
        return accountRepository.findAccountByName(name);
    }

}
