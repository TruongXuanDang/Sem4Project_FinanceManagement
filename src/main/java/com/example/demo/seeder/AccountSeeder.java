package com.example.demo.seeder;

import com.example.demo.entity.account.Account;
import com.example.demo.model.RegisterModel;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class AccountSeeder implements CommandLineRunner {
    final
    AccountRepository accountRepo;
    final
    AccountService accountService;

    public AccountSeeder(AccountRepository accountRepo, AccountService accountService) {
        this.accountRepo = accountRepo;
        this.accountService = accountService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(accountRepo.count() != 0L) return;
        RegisterModel model = new RegisterModel();
        //accountService.create(model)
    }
}
