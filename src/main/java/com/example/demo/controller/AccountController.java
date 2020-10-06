package com.example.demo.controller;


import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.Passbook;
import com.example.demo.request.AccountRequest;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping()
    public void createAccount (@Valid @RequestBody AccountRequest accountRequest){
        accountService.saveAccount(accountRequest);
    }

    @GetMapping()
    public List<Account> getAllAccount(){
      return  accountService.getAccount();
    }

    @GetMapping("/{account_no}")
    public AccountDto getAccountById(@PathVariable String account_no){
        return accountService.getAccountById(account_no);
    }

    @PutMapping("/{account_no}")
    public void updateAcountById(@PathVariable String account_no, @RequestBody AccountRequest accountRequest){
        accountService.updateAccount(account_no,accountRequest);
    }

    @DeleteMapping("/{account_no}")
    public void deleteAccount(@PathVariable String account_no){
        accountService.deleteAccount(account_no);
    }

    @GetMapping("/avg/{account_type}")
    public List<Double> getAvgBalance(@PathVariable String account_type){
      return  accountService.getAvgBalance(account_type);
    }

    @GetMapping("/date/{first_date}/{second_date}")
    public List<String> getAccountDate(@PathVariable String first_date, @PathVariable String second_date){
       return accountService.getAccountDate(first_date,second_date);
    }

    @GetMapping("/passbook/{passbook_id}")
    public List<Account> getBalancePassbook(@PathVariable String passbook_id){
        return accountService.getBalanceByPassbook(passbook_id);
    }

    @GetMapping("/accounttype")
    public List<Account> getAccountByType(){
        return accountService.getAccuntByType();
    }
}
