
package framework;


import static framework.Configuration.chromeDriverPath;
import java.awt.Desktop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    
    private static WebDriver driver = null;
    private static WebDriverWait wait = null;
    
    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","/Users/apple/Desktop/workspace/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;           
        }
            
        return driver;
        
    }
    
    protected WebDriverWait getWait(WebDriver driver) {
        if (wait == null) {
            wait = new WebDriverWait(driver, 10);
        }
        return wait;
    }
    
    public void quitDriver() {
        getDriver().quit();
    }
    
}
