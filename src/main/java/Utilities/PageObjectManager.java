package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;

public class PageObjectManager {

    public  WebDriver driver =new ChromeDriver();
    public HomePage homePageObj = null;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePageObj() {
        if (homePageObj==null) {
            homePageObj = new HomePage(this.driver);

        }
        return homePageObj;
    }
}
