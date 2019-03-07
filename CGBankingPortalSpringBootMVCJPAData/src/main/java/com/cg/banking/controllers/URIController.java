package com.cg.banking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.banking.beans.Account;

@Controller
public class URIController {
	
	private Account account;
	@RequestMapping("/")
    public String getIndexPage()
    {
        return "indexPage";
    }
	
	@RequestMapping("/registration")
    public String getRegistrationPage()
    {
        return "registrationPage";
    }
	
	@RequestMapping("/findAccountDetails")
    public String getAccountDetails()
    {
        return "findAccountDetailsPage";
    }
    
    @ModelAttribute
    public Account getAccount()
    {
        account=new Account();
        return account;
    }
}
