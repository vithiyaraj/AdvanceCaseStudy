package com.wipro.bank.assessment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.bank.assessment.App;
import com.wipro.bank.entity.Account;


public class AppTest{
	
	App app=null;
	
	@Before
	public void  before(){
				
		app=new App();
	}
	
	 @After
	public void after(){
		 app=null;
		
	}
	 @Test
	 public void getAccountDetailsByIDTest(){
		 
		 assertEquals(App.accounts.get(0),app.getAccountDetailsByID(1));
		 assertEquals(App.accounts.get(1),app.getAccountDetailsByID(2));
		 assertNull(app.getAccountDetailsByID(4));
		 assertNotNull(app.getAccountDetailsByID(2));
		 
		 
		 
	 }
	 @Test
	 public void getAccountDetailsByBalanceTest(){
		 List<Account> acc=new ArrayList<Account>();
		acc.add(App.accounts.get(0));
		acc.add(App.accounts.get(1));
		 assertEquals(acc,app.getAccountDetailsByBalance(100.00));
		 assertEquals(acc.size(),app.getAccountDetailsByBalance(100.00).size());
		 assertNotNull(app.getAccountDetailsByBalance(100.00));
		 
	 }
	
} 