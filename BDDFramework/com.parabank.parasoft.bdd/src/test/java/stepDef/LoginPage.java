package stepDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;

public class LoginPage {
	
	public WebDriver driver;
	

	@Given("^user already in login page$")
	public void user_already_in_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("testuser1");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(3000);

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(3000);

	}

	@Then("^user click on logout button$")
	public void user_click_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		Thread.sleep(3000);
		driver.close();

	}


}
