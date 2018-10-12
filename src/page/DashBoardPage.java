package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebGeneric;

public class DashBoardPage {
	@FindBy(id="welcome")
	private WebElement welcome;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logout;
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickWelcome() {
		welcome.click();
	}
	
	public void clickLogout(WebDriver driver,long time) {
		WebGeneric.waitForVisibiltyAndClick(driver, time, logout);
	}

}
