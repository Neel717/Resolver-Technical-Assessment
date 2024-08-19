package com.resolver.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resolver.AbstractComponent.AbstractComponent;

public class HomePage extends AbstractComponent {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		// initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputEmail")
	WebElement emailInput;

	@FindBy(id = "inputPassword")
	WebElement passwordInput;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement loginBtn;

	@FindBy(id = "dropdownMenuButton")
	WebElement dropDownBtn;

	@FindBy(xpath = "//button[@id='dropdownMenuButton']/following-sibling::div/a[contains(text(), 'Option 3')]")
	WebElement dropDownOption;

	@FindBy(xpath = "//div[@id='test-4-div']/button[1]")
	WebElement buttonOne;

	@FindBy(xpath = "//div[@id='test-4-div']/button[2]")
	WebElement buttonTwo;

	@FindBy(xpath = "//div[@id='test5-alert']/following-sibling::button")
	WebElement testFiveBtn;

	@FindBy(xpath = "//div[@id='test5-alert']")
	WebElement successMsg;

	@FindBy(xpath = "//div[@id='test-6-div']/div/table[@class='table table-bordered table-dark']/tbody/tr")
	List<WebElement> rows;

	@FindBy(xpath = "//div[@id='test-2-div']/ul/li")
	List<WebElement> lstValues;

	@FindBy(xpath = "//h1[text()='Test 2']//following-sibling::ul//li[normalize-space()='List Item 2 6']//span")
	WebElement badgeValue;

	public boolean emailInputIsVisible() {
		return emailInput.isDisplayed() ? true : false;
	}

	public boolean passwordInputIsVisible() {
		return passwordInput.isDisplayed() ? true : false;
	}

	public boolean loginBtnIsVisible() {
		return loginBtn.isDisplayed() ? true : false;
	}

	public void enterLoginDetails() {
		emailInput.sendKeys("abc123@gmail.com");
		passwordInput.sendKeys("1a2b3c4d!");
	}

	public String defaultSelectedValue() {
		return dropDownBtn.getText();
	}

	public void selectDropDownOpt() {
		dropDownBtn.click();
		dropDownOption.click();
	}

	public boolean firstBtnIsEnabled() {
		return buttonOne.isEnabled() ? true : false;
	}

	public boolean secondBtnIsDisabled() {
		return buttonTwo.isEnabled() ? false : true;
	}

	public void clickAfterDisplay() {
		waitForWebElementToAppear(testFiveBtn);
		testFiveBtn.click();
	}

	public boolean msgIsDisplayed() {
		return successMsg.isDisplayed() ? true : false;
	}

	public boolean btnIsDisabled() {
		return testFiveBtn.isEnabled() ? false : true;
	}

	public int numberOfValues() {
		return lstValues.size();
	}

	public String getBadgeValue() {
		return badgeValue.getText();
	}

	public String getListItemValue() {
		return lstValues.get(1).getText();
	}

	// Method that allows you to find the value of any cell on the grid
	public String getCellValue(int i, int j) {

		String rowValue = rows.get(i).getText();
		String[] value = rowValue.split(" ");

		return value[j];
	}

	public void goTo() {
		driver.get(sampleFile.toUri().toString());
	}

}
