package com.example.demo.request;

import com.example.demo.entity.Account;

public class PassbookRequest {

    private String branch;

    private String IFSC_code;

    private Account account;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIFSC_code() {
        return IFSC_code;
    }

    public void setIFSC_code(String IFSC_code) {
        this.IFSC_code = IFSC_code;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
