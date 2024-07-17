package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardFactory {
WebDriver driver;

	

	@FindBy(xpath = "//a[normalize-space()='Oil']")

	WebElement Oil;

	@FindBy(xpath = "//span[@class='btn btn-danger']")

	WebElement Logout;


	public void OilPage() {

		Oil.isDisplayed();

	}
	public void ClickOilButton() {
		Oil.click();
	}
	public void ClickLogoutButton() {
		Logout.click();
	}
	

	public DashboardFactory(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}




}
