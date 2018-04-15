package Functionality;
import org.openqa.selenium.WebDriver;
//import net.thucydides.core.webdriver.WebdriverManager;
import Steps.HomePageSteps;
import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(SerenityRunner.class)

public class GmailFunctionality{

    @Managed
    //(driver="chrome", uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginPageSteps login;
    
    HomePageSteps homePage;


@Test
        public void gmailLoginFunctionality() {
    //Given
    login.iAmOnLoginPage();

    //when
    login.iEnterValidCredentials();

    //then
    homePage.iEnterHomePage();
}
}
