package Seleniums;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddProductToCart extends ADefinition
{
    @Given("User Select Items")
    public void SelectProducts() throws InterruptedException
    {
        //Open Shopping page
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        Thread.sleep(1000);
    }

    @When("User Click Add To Cart")
    public void userClickADD()
    {
        //Select the first item to add to cart. id is the first product
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("After adding to the cart and the cart will be opened afterwards.")
    public void AddButtondisabledandOpen() throws InterruptedException
    {
        // When "Add to Cart" disable, it becomes "Remove". Determine if "Remove" appears
        if (driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed()) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Failed");
        }
        // Open page of Shopping cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //Extended time on the last page,
        // Forced pause, called once at the end of a scene, easy to view
        Thread.sleep(2000);
    }

}
