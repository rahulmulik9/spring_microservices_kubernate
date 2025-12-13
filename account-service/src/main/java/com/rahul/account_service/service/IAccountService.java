package com.rahul.account_service.service;

import com.rahul.account_service.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);
}
