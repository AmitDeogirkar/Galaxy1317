package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Registrationpage {
	
	// Declaration====>WwbElement;
	
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']")private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']")private WebElement signuplink;
	@FindBy(name="firstname")private WebElement firstname;
	@FindBy(name="lastname")private WebElement surname;
	@FindBy(name="reg_email__")private WebElement mob_email;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(name="birthday_day")private WebElement birthdate;
	@FindBy(name="birthday_month")private WebElement birthmonth;
	@FindBy(name="birthday_year")private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']")private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']")private WebElement gender_female;
	@FindBy(name="websubmit")private WebElement submitbtn;
	
	
	// Initialization
	
	public Registrationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	// usage 
	
	public void ClickFacebookSignupLink()
	{
		signuplink.click();
	}	
	
	public void VerifyFacebookRegistrationPageLogo()
	{
		Assert.assertTrue(reg_fblogo.isDisplayed(),"The facebook logo on registrationpage not displayed");
	}
	
	public void VerifyFacebookRegistrationPageAlreadyAccount() 
	{
		Assert.assertTrue(already_acc.isDisplayed(), "The Already Have an account option on Registration page is not displayed");
	    Assert.assertEquals(already_acc.getText(), "Already have an account?");
	}
	
	public void SetFacebookRegistrationPageFirstname() {
		firstname.sendKeys("AMIT");
	}
	public void SetFacebookRegistrationPageLastname() {
		surname.sendKeys("DEOGIRKAR");
	}
	public void SetFacebookRegistrationPageMobileEmail() {
		mob_email.sendKeys("AMIT1212@gmail.com");
	}
	public void SetFacebookRegistrationPagePassword() {
		password.sendKeys("Amit@11317");
	}
	
	public void SetFacebookRegistrationPageBirthDay() {
		Select bday=new Select(birthdate);
		Assert.assertTrue(birthdate.isDisplayed(), "BirthDay drop down is not available in page");
		Assert.assertFalse(birthdate.isSelected(),"The birthdate is selected initially");
		bday.selectByVisibleText("17");
	}
	public void SetFacebookRegistrationPageBirthMonth() {
		Select bmonth=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(), "Birthmonth drop down is not available in page");
		Assert.assertFalse(birthdate.isSelected(),"The birthdate is selected initially");
		bmonth.selectByVisibleText("Jan");
		
	}
	public void SetFacebookRegistrationPageBirthYear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "BirthYear drop down is not available in page");
		Assert.assertFalse(birthyear.isSelected(),"The birthdate is selected initially");
		byear.selectByVisibleText("1998");
	}
	public void SetFacebookRegistrationPageGender(String gender) {
		
		if(gender.equalsIgnoreCase("male"))
		{
		gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("Please select valid input");
		}
		
	}
	public void ClickFacebookRegistrationPageSubmitBtn() {
		submitbtn.click();
	}

	
	
	
	
	
}
