package Step_Defenaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.DashboardFactory;
import PageFactory.DiaryPageFactory;
import PageFactory.FruitsPageFactory;
import PageFactory.LoginPageFactory;
import PageFactory.PulsesPageFactory;
import PageFactory.VegetablesPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStep {

static WebDriver driver;
LoginPageFactory login;
DiaryPageFactory diary;
FruitsPageFactory fruits;
PulsesPageFactory pulses;
 VegetablesPageFactory veg;
DashboardFactory home;

@Given("User is on Home page")
public void user_is_on_dashboard_page() {
   // Write code here that turns the phrase above into concrete actions
 driver=new FirefoxDriver();
   driver.get("http://localhost:3000/");
   driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
}

@When("User enters valid {string} and {string}")
public void user_enters_valid_and(String username, String password) {
   // Write code here that turns the phrase above into concrete actions
 login = new LoginPageFactory(driver);
 login.enterUsername(username);
 login.enterPassword(password);  
}
@When("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
Thread.sleep(1000);
   login.clickLoginButton();
}
@And("clicks on Oil button")
public void clicks_on_oil_button() {
   // Write code here that turns the phrase above into concrete actions
home.ClickOilButton();
}
@Then("user is navigated to the OIl page")
public void user_is_navigated_to_the_o_il_page() throws InterruptedException {
Thread.sleep(1000);
home = new DashboardFactory(driver);

home.OilPage();
}

@And("clicks on VEgetable button")
public void clicks_on_veg_buttonss() {
    // Write code here that turns the phrase above into concrete actions
veg.ClickVegButton();
}

@Then("user is navigated to the Vegetables page")
public void user_is_navigated_to_the_vegetables_page() {
   // Write code here that turns the phrase above into concrete actions
  veg=new VegetablesPageFactory(driver);
  veg.VEgtablePage();
}
@And("clicks on Pulses button")
public void clicks_on_pulses_button() {
   // Write code here that turns the phrase above into concrete actions
pulses.ClickPulsesButton();
}
@Then("user is navigated to the Pulses page")
public void user_is_navigated_to_the_pulses_page() {
   // Write code here that turns the phrase above into concrete actions
pulses=new PulsesPageFactory(driver);
pulses.PulsesPage();
}
@And("clicks on Fruits button")
public void clicks_on_Fruit_button() {
   // Write code here that turns the phrase above into concrete actions
fruits.ClickFruitsButton();
}
@Then("user is navigated to the Fruits page")
public void user_is_navigated_to_the_fruits_page() {
   // Write code here that turns the phrase above into concrete actions
fruits=new FruitsPageFactory(driver) ;
fruits.FruitsPage();
}
@And("clicks on Diary button")
public void clicks_on_diary_button() {
   // Write code here that turns the phrase above into concrete actions
diary.ClickDiaryButton();
}

@Then("user is navigated to the Diary  page")
public void user_is_navigated_to_the_diary_page() {
   // Write code here that turns the phrase above into concrete actions
diary=new DiaryPageFactory(driver);
diary.DairyPage();
}

@And("clicks on Logout button")
public void clicks_on_logout_button() {
   // Write code here that turns the phrase above into concrete actions
home.ClickLogoutButton();
driver.switchTo().alert().accept();
}

@Then("Close the browser")

public void close_the_browser() {
System.out.println("And2");
driver.close();

}

}
