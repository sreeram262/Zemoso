package com.aop.aopdemo;

import com.aop.dao.Account;
import com.aop.dao.AccountDao;
import com.aop.dao.MembershipDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
        MembershipDao membershipDao=context.getBean("membershipDao",MembershipDao.class);

        accountDao.addAccount();
        accountDao.addSillyAccount();
        membershipDao.addAccount();
        accountDao.addMoneyToAccount(45000);

        Account account1=new Account("naruto","uzumaki");
        Account account2=new Account("itachi","uchiha");
        Account account3=new Account("ichigo","kurosaki");

        accountDao.add(account1);
        accountDao.add(account2);
        accountDao.add(account3);

        List<Account> accountList=accountDao.getAccounts();
        System.out.println(accountList);

        try {
            accountDao.exception();
        } catch (ClassNotFoundException e) {
            System.out.println("exception caught by catch");
        }

        context.close();
    }
}
