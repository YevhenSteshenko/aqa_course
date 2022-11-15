package tests.ui.um.frontend;


import io.qameta.allure.*;
import mm._base.BaseTest;
import mm._base.dataprovider.Dp;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

@Epic("All tests")
@Feature("UM tests")
@Story("UM Start page")
public class UMStartPageTest extends BaseTest {
    private final Loc location;

    public UMStartPageTest(Loc location) {
        this.location = location;
    }

    @Factory
    public static Object[] factoryMethod() {
        return new Object[] { new UMStartPageTest(Loc.EU), new UMStartPageTest(Loc.US) };
    }

    private enum Loc {
        EU, US
    }

//    @Issue("BF-3014")
    @Test(dataProvider = "validData")
    public void testUMStartPageLinks(int count, String value){
        System.out.println("UM Quiz start page links");
        System.out.println("Count:  " + count + "  Value:  " + value);
        System.out.println("Location:  " + location);
    }

    @Test(dataProviderClass = Dp.class
            , dataProvider = "validData")
    public void testUMStartPageButtons(int count, String value){
        Allure.addAttachment("Text" , new ByteArrayInputStream("It's UM test".getBytes()));
        printSteps(count, value);
    }

    @DataProvider
    public Object[][] validData() {
        return new Object[][]{
                {1, "First"},
                {2, "Second"},
                {3, "Third"},
        };
    }

    @Step("Perform Actions.")
    public void printSteps(int count, String value) {
        System.out.println("UM Quiz start page buttons");
        System.out.println("Count:  " + count + "  Value:  " + value);
        System.out.println("Location:  " + location);
    }
}
