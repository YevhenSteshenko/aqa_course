package tests.ui.mm;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import mm._base.BaseTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.open;

@Epic("All tests")
@Feature("MM tests")
@Story("MM Quiz")
public class MMQuizPassedTest extends BaseTest {
    @Test
    @Flaky
    @Description("Some add info")
    public void testMMQuizPassed(){
        System.out.println("MM Quiz Passed test method");
        openMMStartPage("test");
        Allure.addAttachment("Text" , new ByteArrayInputStream("Here some text".getBytes()));
        Selenide.$x("//dip").click();
    }

    @Step("Open MM start page:  {str}")
    public void openMMStartPage(String str) {
        open("https://stage-front.musclemate.xyz/");
    }
}
