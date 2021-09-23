package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "smoke")
	public void createContactTest() {
		System.out.println("exicte ctreateContactTest");
		
	}
	@Test(groups = "regression")
	public void createContactWithOrgTest() {
		System.out.println("execte createContactWithOrgTest");
	}
	@Test(groups = "regression")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	
	}
	@Test(groups = "regression")
	public void editContactTest() {
		System.out.println("execute deleteContactTest");
	
	}
	@Test(groups = "regression")
	public void searchContactTest() {
		System.out.println("execute deleteContactTest");
	
	}
}
