package org.emrebas.ci.blog.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public void beforeTests() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setHeadless(true);
        options.addArguments("window-size=1920,1080");
        driver=new ChromeDriver(options);

        wait = new WebDriverWait(driver, 2);
        driver.manage().window().maximize();
    }

    public void afterTests() {
        driver.quit();
    }

}
