package handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class handson1 {
	WebDriver driver;
	@Given("user access to URL")
	public void user_access_to_URL() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		 
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		 
		driver.findElement(By.id("details-button")).click();
		 
		driver.findElement(By.id("proceed-link")).click();
}

	@When("user enters {string} and {string}")
	//public void user_enters_and(String un, String pwd) {
		public void and(String un, String pwd) {
			 
			driver.findElement(By.xpath("//a[@href=\'login.htm\']")).click();
			 
			driver.findElement(By.name("userName")).sendKeys(un);
			 
			driver.findElement(By.name("password")).sendKeys(pwd);
			 
			driver.findElement(By.name("Login")).click();

}
@Then("login successful")
public void login_successful() {
	System.out.println("login sucess");
}
}
	

