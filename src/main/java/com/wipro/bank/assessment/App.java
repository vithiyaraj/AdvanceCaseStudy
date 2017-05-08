package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.List;
import com.wipro.bank.entity.Account;


/**
 * Hello world!
 *
 */
public class App{
	
	static List<Account> accounts;
	App(){
		accounts=new ArrayList<Account>();
		Account a1=new Account(1,"test1",100.00);
		Account a2=new Account(2,"test2",100.00);
		Account a3=new Account(3,"test3",200.00);
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		
	}
	
	 
	
	public Account getAccountDetailsByID(int id){
		Account acc=null;
		for(Account a:accounts){
			if(a.getAccountID()==id){
				acc=a;
			}
		}
		return acc;
		
		
	}
	
	static List<Account> accounts2=null;
	public List<Account> getAccountDetailsByBalance(double amount){
	
		accounts2=new ArrayList<Account>();
				
		for(Account a:accounts){
			if(a.getBalance()==amount){
				
				accounts2.add(a);
			
			}
		}
		return accounts2;
		
	}

	
   
} 