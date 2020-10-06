package com.example.demo.dto;

import com.example.demo.entity.Account;
import com.example.demo.entity.Passbook;
import com.example.demo.entity.User;
import java.util.Date;

public class AccountDto {

    private String account_type;

    private Date opening_date;

    private double balance;

    private User user_id;

    private Passbook passbook;

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Date getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(Date opening_date) {
        this.opening_date = opening_date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Passbook getPassbook() {
        return passbook;
    }

    public void setPassbook(Passbook passbook) {
        this.passbook = passbook;
    }

    public AccountDto() {

    }

    public AccountDto(String account_type, Date opening_date, double balance, User user_id, Passbook passbook) {
        this.account_type = account_type;
        this.opening_date = opening_date;
        this.balance = balance;
        this.user_id = user_id;
        this.passbook = passbook;
    }

    public static AccountDto generateFrom(Account account){

        AccountDto accountDto= new AccountDto();
        accountDto.setAccount_type(account.getAccount_type());
        accountDto.setBalance(account.getBalance());
        accountDto.setOpening_date(account.getOpening_date());
        accountDto.setPassbook(account.getPassbook());
        accountDto.setUser_id(account.getUser_id());
        return accountDto;
    }

}
