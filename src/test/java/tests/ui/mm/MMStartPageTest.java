package tests.ui.mm;

import io.qameta.allure.*;
import mm._base.BaseTest;
import mm._base.dataprovider.Dp;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@Epic("All tests")
@Feature("MM tests")
@Story("MM Start page")
public class MMStartPageTest extends BaseTest {
    private final Loc location;

    public MMStartPageTest(Loc location) {
        this.location = location;
    }

    @Factory
    public static Object[] factoryMethod() {
        return new Object[] { new MMStartPageTest(Loc.EU), new MMStartPageTest(Loc.US) };
    }

    private enum Loc {
        EU, US
    }

    @Test(dataProvider = "validData")
    public void testMMStartPageLinks(int count, String value){
        System.out.println("MM Quiz start page links");
        System.out.println("Count:  " + count + "  Value:  " + value);
        System.out.println("Location:  " + location);
    }

    @Test(dataProviderClass = Dp.class
            , dataProvider = "validData")
    public void testMMStartPageButtons(int count, String value){
        System.out.println("MM Quiz start page buttons");
        System.out.println("Count:  " + count + "  Value:  " + value);
        System.out.println("Location:  " + location);
//        Assert.fail();
    }

    @DataProvider
    public Object[][] validData() {
        return new Object[][]{
                {1, "First"},
                {2, "Second"},
                {3, "Third"},
        };
    }
//
//    @Step("Perform Actions.")
//    public void printSteps(int count, String value) {
//        System.out.println("MM Quiz start page buttons");
//        System.out.println("Count:  " + count + "  Value:  " + value);
//        System.out.println("Location:  " + location);
//    }
}
