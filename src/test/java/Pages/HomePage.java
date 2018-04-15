package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import javax.validation.constraints.AssertTrue;

public class HomePage extends PageObject{


    @FindBy(xpath = "//span[@class='gb_7a gbii']")
    WebElement b;

    @FindBy(xpath = "//*[text()=bhaveshpandey2@gmail.com]")
    WebElement text;


    public void clickOnB(){
        b.click();


    }

    public  void  verifyId(String username){
        String s=text.getText();

        if(s.contains(username))
System.out.print("login successful");
    }
}
