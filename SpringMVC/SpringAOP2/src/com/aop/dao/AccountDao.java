package com.aop.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {

    private List<Account> accounts=new ArrayList<>();

    public void addAccount()
    {
        System.out.println(getClass()+" Doing my work : "+"adding account");
    }

    public void addSillyAccount()
    {
        System.out.println(getClass()+" Doing my work : "+"adding silly account");
    }

    public void addMoneyToAccount(int money)
    {
        System.out.println("Rs."+money);
    }

    public void add(Account account)
    {
        accounts.add(account);
    }
    public List<Account> getAccounts()
    {
        return accounts;
    }
    public void exception() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
