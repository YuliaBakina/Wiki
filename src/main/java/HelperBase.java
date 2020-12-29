import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HelperBase {
    AppiumDriver driver;

    public HelperBase(AppiumDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text){

        if(text != null) {
            if(!text.equals(driver.findElement(locator).getText())) {
                driver.findElement(locator).click();
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
            }
        }

    }
}
