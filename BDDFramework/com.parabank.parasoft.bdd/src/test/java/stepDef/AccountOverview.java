package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountOverview {

	public WebDriver driver;

	@Given("^user already login in Account Overview page$")
	public void user_already_login_in_Account_Overview_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("testuser1");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button']")).click();

		Thread.sleep(3000);
	}

	@When("^user click on Account Overview link$")
	public void user_click_on_Account_Overview_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
	}

	@Then("^user should click on logout page$")
	public void user_should_click_on_logout_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(3000);

		driver.close();
	}

}
