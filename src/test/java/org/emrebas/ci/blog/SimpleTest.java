package org.emrebas.ci.blog;

import org.emrebas.ci.blog.base.Base;
import org.emrebas.ci.blog.component.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest extends Base {

    @BeforeTest
    public void beforeTests(){
        super.beforeTests();
        driver.get("https://demoqa.com/");

    }

    @Test
    public void shouldOpenElementsPage(){
        HomePage home = new HomePage(driver);
        home.closeBanner();
        home.clickElements();
    }

    @AfterTest
    public void tearDown(){
        afterTests();
    }
}
