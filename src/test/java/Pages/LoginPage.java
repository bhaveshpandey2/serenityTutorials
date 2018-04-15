package Pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
//import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.co.in")
public class LoginPage extends PageObject {

    @FindBy(id="gb_70")
    WebElement gmailButton;

    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement next;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passWord;

    public void clickGmailButton(){
        gmailButton.click();


    }


    public void enterUsername(String username){
        userName.sendKeys(username);


    }

    public void enterPassword(String password){


        passWord.sendKeys(password);
    }
    public void clickNext(){

        next.click();

    }



}
