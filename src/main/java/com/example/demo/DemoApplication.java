package com.example.demo;

import com.example.demo.entity.account.Account;
import com.example.demo.entity.account.AccountDto;
import com.example.demo.utils.AssignUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Account account = new Account();
        account.setId(1);
        account.setUsername("ha11");
        AccountDto accountDto = new AccountDto();
        try {
            AssignUtils.assign(accountDto, account);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
