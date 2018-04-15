package Steps;

import Pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageSteps {



HomePage h;

    @Step
    public void iEnterHomePage(){

        h.clickOnB();
        h.verifyId("bhaveshpandey2");

   }




}
