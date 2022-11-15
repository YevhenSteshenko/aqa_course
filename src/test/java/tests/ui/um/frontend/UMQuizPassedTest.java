package tests.ui.um.frontend;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import mm._base.BaseTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.open;

@Epic("All tests")
@Feature("UM tests")
@Story("Quiz passed")
public class UMQuizPassedTest extends BaseTest {
    @Test
    public void testUMQuizPassed(){
        System.out.println("MM Quiz Passed test method");
        openUMStartPage();
        Allure.addAttachment("Text" , new ByteArrayInputStream("It's UM start page".getBytes()));
        Selenide.$x("//dip").click();
    }

    @Step("Open MM start page")
    public void openUMStartPage() {
        open("https://stage-front.bodyfitplan.xyz/");
    }
}
