package com.rahul.account_service.repository;

import com.rahul.account_service.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {
    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying //this method is going to modify the data so run query in transactional . in fail case changes data can be rollback
    void deleteByCustomerId(Long customerId);
}
