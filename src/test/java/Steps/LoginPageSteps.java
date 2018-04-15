package Steps;

import Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
    LoginPage l;

    @Step
public void iAmOnLoginPage(){
l.open();
l.clickGmailButton();



}
@Step
public void iEnterValidCredentials() {

l.enterUsername("bhaveshpandey2");
    l.clickNext();

l.enterPassword("SsbW@nov22");
l.clickNext();

}


}
