/*
package org.sid.appbackser.Services;

import org.sid.appbackser.Repositories.AccountRepository;
import org.sid.appbackser.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImp implements ProjectServices{
    @Autowired
    AccountRepository accountRepository;
    @Override
    public List<String> getRolesFromAccount(Account account) {
        return accountRepository.findFirstByMail();
    }
}
*/