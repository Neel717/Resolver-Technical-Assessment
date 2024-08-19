package com.resolver.tests;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.resolver.commonBase.BaseTest;
import com.resolver.commonBase.Retry;

public class SampleTests extends BaseTest {

	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void TestOne() {

		softAssert = new SoftAssert(); 
		
		// Assert that email address input is present
		softAssert.assertEquals(homePage.emailInputIsVisible(), true, "Email input not present.");

		// Assert that password input is present
		softAssert.assertEquals(homePage.passwordInputIsVisible(), true, "Password input not present.");

		// Assert that Sign in button is present
		softAssert.assertEquals(homePage.loginBtnIsVisible(), true, "Sign in Button not present.");
		
		//Enter in an email address and password combination into the respective fields
		homePage.enterLoginDetails();
		
		// Assert all soft assertions
		softAssert.assertAll();
	}

	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void TestTwo() {

		softAssert = new SoftAssert();

		// To assert that there are three values in the listgroup
		softAssert.assertEquals(homePage.numberOfValues(), 3, "Number of values in the listgroup does not match to 3!");

		// Assert that the second list item's value is set to "List Item 2"
		softAssert.assertEquals(homePage.getListItemValue().contains("List Item 2"), true,
				"Second list item's value does not match with \"List Item 2\"");

		// To assert that the second list item's badge value is 6
		softAssert.assertEquals(homePage.getBadgeValue(), "6", "Badge values do not match!");

		// Assert all soft assertions
		softAssert.assertAll();
	}

	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void TestThree() {
		softAssert = new SoftAssert();

		// Assert that "Option 1" is the default selected value
		softAssert.assertEquals(homePage.defaultSelectedValue(), "Option 1", "Default selected value does not match with \"Option 1\".");

		// Select "Option 3" from the select list
		homePage.selectDropDownOpt();

		// Assert all soft assertions
		softAssert.assertAll();
	}

	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void TestFour() {
		softAssert = new SoftAssert();

		// Assert that the first button is enabled
		softAssert.assertEquals(homePage.firstBtnIsEnabled(), true, "First Button is not enabled.");

		// Assert that the second button is disabled
		softAssert.assertEquals(homePage.secondBtnIsDisabled(), true, "Second Button is not disabled.");

		// Assert all soft assertions
		softAssert.assertAll();
	}

	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void TestFive() {
		softAssert = new SoftAssert();

		// Wait for a button to be displayed and then click it
		homePage.clickAfterDisplay();

		// Assert that a success message is displayed
		softAssert.assertEquals(homePage.msgIsDisplayed(), true, "Success message is not displayed.");

		// Assert that the button is now disabled
		softAssert.assertEquals(homePage.btnIsDisabled(), true, "The button is not disabled");

		// Assert all soft assertions
		softAssert.assertAll();
	}

	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void TestSix() {
		softAssert = new SoftAssert();

		// Find the value of the cell at coordinates 2, 2
		System.out.println(homePage.getCellValue(2, 2));

		// Assert that the value of the cell is "Ventosanzap"
		softAssert.assertEquals(homePage.getCellValue(2, 2), "Ventosanzap", "The values do not match!");

		// Assert all soft assertions
		softAssert.assertAll();
	}

}
