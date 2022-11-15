package mm._base;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        SelenideLogger.addListener("AllureSelenide"
                , new AllureSelenide().screenshots(true)
                        .savePageSource(false));
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }
}
