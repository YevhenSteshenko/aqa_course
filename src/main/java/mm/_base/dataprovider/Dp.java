package mm._base.dataprovider;

import org.testng.annotations.DataProvider;

public class Dp {

    @DataProvider(name = "validData")
    public static Object[][] validData() {
        return new Object[][]{
                {4, "Fourth"},
                {5, "Fifth"},
                {6, "Sixth"},
        };
    }
}
