package com.rahul.account_service.controller;

import com.rahul.account_service.constant.AccountsConstants;
import com.rahul.account_service.dto.CustomerDto;
import com.rahul.account_service.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api",produces = MediaType.APPLICATION_JSON_VALUE)  //this will support json response (produces)
public class AccountController {

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
        ResponseDto responseDto ;
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.MESSAGE_201));
    }

}
