package mm._base;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
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
