package com.example.demo.request;

import com.example.demo.entity.Account;
import com.example.demo.entity.Bank;

import java.util.List;
import java.util.Set;

public class UserRequest {

    private String user_name;

    private String user_f_name;

    private String address;

    private Set<Bank> banks;

    private List<Account> accounts;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_f_name() {
        return user_f_name;
    }

    public void setUser_f_name(String user_f_name) {
        this.user_f_name = user_f_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Bank> getBanks() {
        return banks;
    }

    public void setBanks(Set<Bank> banks) {
        this.banks = banks;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
