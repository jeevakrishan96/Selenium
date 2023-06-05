package Utilities;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;

public class Automation {
    public  EnvironmentSettings environmentSettings;
    public HomePage homePage;
    WebDriver driver ;
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        this.initialize();
        this.driver= DriverConfig.getDriver(environmentSettings.getProperty("browser"));
        driver.get(environmentSettings.getProperty("url"));

    }

 public void initialize(){
        environmentSettings = new EnvironmentSettings();

 }

}
