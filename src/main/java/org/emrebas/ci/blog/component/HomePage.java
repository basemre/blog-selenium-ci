package org.emrebas.ci.blog.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(css = ".card.mt-4.top-card:nth-child(1)")
    WebElement elements;

    @FindBy(css = "#close-fixedban > img")
    WebElement closeBannerButton;

    public void clickElements() {
        elements.click();
    }

    public void closeBanner() {
        closeBannerButton.click();
    }
}

