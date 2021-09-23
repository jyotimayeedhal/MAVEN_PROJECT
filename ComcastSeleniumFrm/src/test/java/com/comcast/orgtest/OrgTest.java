package com.comcast.orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "smoke")
	public void createContactTest() {
		System.out.println("exicte ctreateOrgTest");
		
	}
	@Test(groups = "regression")
	public void createContactWithOrgTest() {
		System.out.println("execte createOrgWithContactTest");
	}
	@Test(groups = "regression")
	public void deleteContactTest() {
		System.out.println("execute deleteOrgTest");
	}
}
