package Seleniums;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Login extends ADefinition
{
    @Given("user login to saucedemo")
    public void getPage() {
        //jump to log page
        driver.get("https://www.saucedemo.com/");

    }

    @When("I enter Username as {string} and Password as {string}")
    public void IEnterUsernameAndPassword(String arg1, String arg2) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(arg1);
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys(arg2);
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();

    }

    @Then("log in unsuccessful")
    public void loginunsuccessful() throws InterruptedException {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/inventory.html")){
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Test Failed");
        }
        //Forced pause, called once at the end of a scene, easy to view
        Thread.sleep(2000);
    }
}
