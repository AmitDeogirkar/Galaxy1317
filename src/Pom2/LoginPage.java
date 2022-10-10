package Pom2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fblogo;
	@FindBy(xpath="//h2[starts-with(text(),'Facebook helps you')]")private WebElement login_fbtagline;
	@FindBy(xpath="//input[@name='email']")private WebElement username;
	@FindBy(xpath="//input[@name='pass']")private WebElement password;
	@FindBy(xpath="//button[@value='1']")private WebElement login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot_password;
	@FindBy(xpath="//a[text()='Create New Account']")private WebElement createnew_account;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']//li")})private List<WebElement>footerlinks;
	
	
	// initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	// usage
	
	public void VerifyLoginPageLogo() 
	{
	Assert.assertTrue(login_fblogo.isDisplayed(),"The fblogo on loginpage is not displayed");
    Reporter.log("VerifyLoginPageLogo", true);	
	}
	
	public void VerifyLoginPageTagline()
	{	
	Assert.assertTrue(login_fbtagline.isDisplayed(),"The fbtagline on loginpage is not displayed");
	Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
	Reporter.log("VerifyLoginPageTagline", true);	
	}
	
    public void VerifyLoginPageForgotPasswordLink() 
    {	
	Assert.assertTrue(forgot_password.isDisplayed(),"The fbtagline on loginpage is not displayed");
	Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
    Reporter.log("VerifyLoginPageForgotPasswordLink", true);	
	}
    
    public void VerifyFacebookLoginPageCreateNewAccountBtn() {
    Assert.assertTrue(createnew_account.isDisplayed(), "create newaccount button is not display");
    Assert.assertTrue(createnew_account.isEnabled(), "create newaccount button is disabled");
    Assert.assertEquals(createnew_account.getText(),"Create New Account");
    Reporter.log("VerifyFacebookLoginPageCreateNewBtn",true);
    }
    
    public void SetFacebookLoginPageUsername() {
    Assert.assertTrue(username.isDisplayed(),"Username Field is not displayed");
    username.sendKeys("test@gmail.com");
    Reporter.log("SetFacebookLoginPageUsername",true);
    }

    public void SetFacebookLoginPagePassword() {
    Assert.assertTrue(password.isDisplayed(),"password Field is not displayed");
    password.sendKeys("amit@1317");
    Reporter.log("SetFacebookLoginPagePassword",true);
    }
    
    public void ClickFacebookLoginPageBtn() {
    Assert.assertTrue(login_btn.isDisplayed(),"Login button is not display");
   	Assert.assertTrue(login_btn.isEnabled(),"Login Button is not enabled");
   	login_btn.click();
   	Reporter.log("ClickFacebookLoginPageBtn",true);
    }
    
    public void VerifyFacebookLoginPageFooterlinksSize() {
    Assert.assertEquals(footerlinks.size(),31);
    Reporter.log("VerifyFacebookLoginPageFooterlinksSize",true);
    }
}
