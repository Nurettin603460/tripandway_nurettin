package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userHomepage {
    public userHomepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // Anasayfa kullanıcı kayıt linki
    @FindBy (xpath = "//*[text()='Registration']")
    WebElement registrationLinki;

}
