package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver react;
	By Email_address = By.id("email");
	By txt_password = By.id("password");
	By btn_signin = By.xpath("//button[normalize-space()='Sign In']");
	By lbl_logo = By.xpath("//h1[normalize-space()='Dashboard']");
	By btn_crud = By.xpath("//a[normalize-space()='CRUD']");
	By btn_back = By.xpath("//a[@href='/Maindashboard']");
	By btn_manage_users = By.xpath("//a[normalize-space()='Manage Users']");
	By btn_delete = By.xpath("//tbody/tr[1]/td[5]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M6 19c0 1.')]");
	By btn_products = By.xpath("//a[normalize-space()='Products']");
	By btn_addtocart = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-8 MuiGrid-grid-lg-12 css-1kklp4y-MuiGrid-root']//div//div[1]//div[3]//button[1]");
	
		public SignIn(WebDriver react){
			this.react=react;
	}
	public void EmailAddress(String EmailAddress) {
		react.findElement(Email_address).sendKeys(EmailAddress);
	}
	public void enterPassword(String password) {
		react.findElement(txt_password).sendKeys(password);
	}
	public void hitSigninButton() {
		react.findElement(btn_signin).click();
	}
	public void UserSignin(String EmailAddress,String password) {
		react.findElement(Email_address).sendKeys(EmailAddress);
		react.findElement(txt_password).sendKeys(password);
		react.findElement(btn_signin).click();
	}
	public void isDashBoardDisplayed() {
		react.findElement(lbl_logo).isDisplayed();
	}
	public void hitCRUD() {
		react.findElement(btn_crud).click();
	}
	public void CRUDdelete() {
		react.findElement(btn_delete).click();
	}
	public void CRUDback() {
		react.findElement(btn_back).click();
	}
	public void hitManageUsers() {
		react.findElement(btn_manage_users).click();
	}
	public void Managedelete() {
		react.findElement(btn_delete).click();
	}
	public void Manageback() {
		react.findElement(btn_back).click();
	}
	public void hitProducts() {
		react.findElement(btn_products).click();
	}
	public void ProductsCart() {
		react.findElement(btn_addtocart).click();
	}
	public void productsback() {
		react.findElement(btn_back).click();
	}
}
