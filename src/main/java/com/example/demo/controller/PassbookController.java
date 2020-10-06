package com.example.demo.controller;

import com.example.demo.dto.PassbookDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Passbook;
import com.example.demo.entity.User;
import com.example.demo.request.PassbookRequest;
import com.example.demo.request.UserRequest;
import com.example.demo.service.PassbookService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/passbook")
public class PassbookController {

    @Autowired
    private PassbookService passbookService;

    @PostMapping()
    public void createPassbook (@Valid @RequestBody PassbookRequest passbookRequest){
        passbookService.savePassbook(passbookRequest);
    }

    @GetMapping()
    public void getAllPassbook(){
        passbookService.getAllPassbook();
    }

    @GetMapping("/{passbook_id}")
    public PassbookDto getPassbookById(@PathVariable String passbook_id){
        return passbookService.getPassbookById(passbook_id);
    }

    @PutMapping("/{passbook_id}")
    public void updatePassbookById(@PathVariable String passbook_id, @RequestBody PassbookRequest passbookRequest){
        passbookService.updatePassbook(passbook_id,passbookRequest);
    }

    @DeleteMapping("/{passbook_id}")
    public void deletePassbook(@PathVariable String passbook_id){
        passbookService.deletePassbook(passbook_id);
    }

//    @GetMapping("/branch")
//    public List<Long> getAccountBranch(String branch){
//        return  passbookService.getAccountByBranch(branch);
//    }

    @GetMapping("/branch/{branch}")
    public List<Long> getAccountBranch(@PathVariable String branch){
        return  passbookService.getAccountByBranch(branch);
    }

}


