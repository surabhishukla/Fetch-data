package com.example.demo.request;

import com.example.demo.entity.Passbook;
import com.example.demo.entity.User;
import java.util.Date;

public class AccountRequest {

    private String account_no;

    private String account_type;

    private Date opening_date;

    private double balance;

    private User user_id;

    private Passbook passbook;

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

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
}
