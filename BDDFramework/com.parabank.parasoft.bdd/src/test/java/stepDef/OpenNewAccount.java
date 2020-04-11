package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenNewAccount {
	
	public WebDriver driver;
	
	@Given("^user already in Account Overview page$")
	public void user_already_in_Account_Overview_page() throws InterruptedException
	{
		
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

	@When("^user click on Open New Account$")
	public void user_click_on_Open_New_Account() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		Thread.sleep(3000);
	}

	@Then("^user click on type of Account drop down and select account type$")
	public void user_click_on_type_of_Account_drop_down_and_select_account_type() throws InterruptedException
	{
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='type']")));
		sel.selectByVisibleText("SAVINGS");
		Thread.sleep(3000);
		
	}

	@Then("^click on OPEN NEW ACCOUNT button$")
	public void click_on_OPEN_NEW_ACCOUNT_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(3000);
		
	}

	@Then("^user click on logout page$")
	public void user_click_on_logout_page() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
