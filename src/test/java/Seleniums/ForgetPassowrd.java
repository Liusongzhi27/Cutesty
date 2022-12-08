package Seleniums;

import Parameters.LoginScene;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ForgetPassowrd extends ADefinition
{

    @Given("user login to phptravels")
    public void usersLoginToSaucedemo() {
        //Jump to login page php
        driver.get("https://phptravels.net/api/admin");
    }

    @When("F Enter Username as {string} and Password as {string}")
    public void usersEnterUsernameAndPassword(String arg0, String arg1) throws InterruptedException
    {
        //input string parameters to text box
        driver.findElement(By.xpath(LoginScene.getUSERNAME())).sendKeys(arg0);
        driver.findElement(By.xpath(LoginScene.getPASSWORD())).sendKeys(arg1);
        driver.findElement(By.xpath(LoginScene.getRemberContent())).click();
        Thread.sleep(1500);

    }

    @Then("log in successful")
    public void loginBeSuccessful()
    {
        //Click to jump
        driver.findElement(By.xpath(LoginScene.getLOGIN())).click();
        //Test for the wrong password,so if wrong password then stay initial page,then tell test pass.
        if(driver.getCurrentUrl().equalsIgnoreCase("https://phptravels.net/api/admin"))
        {
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Test Failed");
        }
    }

    @Given("user forget password when login")
    public void userForgetPasswordWhenLogin()
    {
        // to login page
        driver.get("https://phptravels.net/api/admin");
    }

    @When("user click Forget Password and Email Address is {string}")
    public void userClickForgetPasswordAndEmailAddressIs(String arg0)
    {
        //Click Forget Password
        driver.findElement(By.id("link-forgot")).click();

        //Input email
        driver.findElement(By.id("resetemail")).sendKeys(arg0);

        //Click Submit
        driver.findElement(By.xpath("//*[@id=\"btn-forgot\"]/span[1]")).click();

    }

  @Then("Recover the password should be unsuccessful")
    public void recoverThePasswordShouldBeUnsuccessful()
    {
        //After Reset password, Input Email address,pop up the message.
        if(driver.findElement(By.xpath("//*[@id=\"passresetfrm\"]/div[1]/div")).getText().
                equals("New Password sent to admin@phptravels.com, Kindly check email.")){
            System.out.println("pass");
        }else {
            System.out.println("Fail");
        }
    }
}
