package Seleniums;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SearchTitle extends ADefinition
{
    //get login page
    @Given("user Search")
    public void userSearch() {
        driver.get("https://ultimateqa.com/");
    }

    @When("user Search title is {string}")
    public void userSearchTitleIs(String arg0) throws InterruptedException {
        //Locate the search box relative to the id,then input case string value.
        driver.findElement(By.xpath("//*[@id=\"post-217173\"]" +
                "/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[1]")).sendKeys(arg0);
        Thread.sleep(1000);

    }

    @Then("Search be successful")
    public void searchShouldBeSuccessful() throws InterruptedException
    {
        //Find id to Click,then click to search input title
        driver.findElement(By.xpath("//*[@id=\"post-217173\"]" +
                "/div/div[1]/div/div[1]/div/div/div[2]/form/div/input[5]")).click();
        //Forced pause, called once at the end of a scene, easy to view
        Thread.sleep(3000);
    }
}
