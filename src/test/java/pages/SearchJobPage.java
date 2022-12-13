package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchJobPage {

    public SearchJobPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='session_key']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='session_password']")
    public WebElement passwordBox;

    @FindBy(className = "sign-in-form__submit-button")
    public WebElement signInButton;

    @FindBy(linkText = "https://www.linkedin.com/jobs/?")
    public WebElement jobSearchButton;

    @FindBy(id = "jobs-search-box-keyword-id-ember231")
    public WebElement jobSearchBox;

    @FindBy(className = "jobs-search-box__text-input jobs-search-box__ghost-text-input")
    public WebElement jobSearchLocation;


}
