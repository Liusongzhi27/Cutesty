package Seleniums;

import Parameters.MainScene;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Initialization,including starting the driver and use implicit wait for seleniums waiting.
 */
public abstract class ADefinition
{
//sets a large wait time，
    private static final int WAIT_TIME = 10;

    static WebDriver driver;
//can be accessed by subclasses in class, indicating that the member will be protected type.
    protected static MainScene mainScene;

    static {
        //Set WebDiver
        WebDriverManager.chromedriver().setup();
        //Various properties of the Chrome driver
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        //set implicit Wait, if throwing the Exception.
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
    }

}
