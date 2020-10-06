package com.example.demo.controller;

import com.example.demo.dto.BankDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Bank;
import com.example.demo.entity.User;
import com.example.demo.request.BankRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.service.BankService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping()
    public void createBank (@Valid @RequestBody BankRequest bankRequest){
        bankService.addBank(bankRequest);
    }

    @GetMapping()
    public void getAllBank(){
        bankService.getBank();
    }

    @GetMapping("/{bank_id}")
    public BankDto getBankById(@PathVariable String bank_id){
        return bankService.getBankById(bank_id);
    }

    @PutMapping("/{bank_id}")
    public void updateBankById(@PathVariable String bank_id, @RequestBody BankRequest bankRequest){
        bankService.updateBank(bank_id,bankRequest);
    }

    @DeleteMapping("/{bank_id}")
    public void deleteBank(@PathVariable String bank_id){
        bankService.deleteBank(bank_id);
    }
}
