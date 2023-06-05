package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    private String logo="";

    public void clickLogo() {
        driver.findElement(By.xpath(logo)).click();
    }



}
