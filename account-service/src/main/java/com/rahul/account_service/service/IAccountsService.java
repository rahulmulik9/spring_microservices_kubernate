package com.rahul.account_service.service;

import com.rahul.account_service.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
