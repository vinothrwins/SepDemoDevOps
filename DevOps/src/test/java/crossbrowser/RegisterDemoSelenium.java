package crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterDemoSelenium extends MultipleBrowser {
	
	// public WebDriver driver;- Dont include this code - Null pointer exception
	
	// Parameterized all Input Values
	//String URL = "https://nxtgenaiacademy.com/";
	String regForm = "Registration Form";
	String regFormDemo = "Register For Demo";
	String firstNameValue = "Vinoth";
	String lastNameValue = "Rathinam";
	String streetAddressInput = "Saravana Flats";
	String apartmentInput = "S2";
	String cityNameValue = "Chennai";
	String stateNameValue = "TamilNadu";
	String postalCodeValue= "600100";
	String countryDrpDnValue = "India";
	String emailInput= "vinothrwins@gmail.com";
	String dateOfDemoValue = "03/31/2021";
	String hourInput = "09";
	String minuteInput = "30";
	String ampmInput = "PM";
	String mobileNumberValue = "6383544892";
	String enterYourQueryValue = "When is Selenium Frame work ends?";
	String successfulMessageText = "Your query successfully submitted. Please check your mail box. Click on Home page to know more about latest updates.";

	// Parameterized all The WebElement Path
	String qaAutomationLocator = "//span[@class='text-wrap'][contains(text(),'QA Automation')]";
	String practiceAutomationLocator = "//span[@class='text-wrap'][contains(text(),'Practice Automation')]";
	String regTitleTextLocator = "//h3[contains(text(),'Register For Demo')]";
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String maleRdoBtnLocator = "vfb-8-1";
	String stAddressNameLocator = "vfb-13[address]";
	String apartmentLocator = "vfb-13-address-2";
	String cityLocator = "vfb-13-city";
	String stateLocator = "vfb-13-state";
	String postalCodeLocator = "vfb-13-zip";
	String countryDrpDnLocator = "vfb-13-country";
	String emailLocator = "#vfb-14";
	String dateOfDemoLocator = "#vfb-18";
	String hourLocator= "vfb-16-hour";
	String minuteLocator = "vfb-16-min";
	String amPmLocator = "vfb-16-ampm";
	String mobileNoLocator = "//input[@id='vfb-19']";
	String functionalTestingLocator = "vfb-20-4";
	String seleniumWebDriverLocator = "vfb-20-0";
	String enterYourQueryLocator = "vfb-23";
	String enterTwoDigitsLocator = "vfb-3";
	String submitBtnLocator = "vfb-4";
	String successfulMsgTextLocator = "//div[contains(text(),'Your query successfully submitted. Please check yo')]";

	  
	  @Test(priority=1)
	  public void navigateToRegisterDemo() {
		// Click on Selenium Online Training
			WebElement qaAutomation = driver.findElement(By.xpath(qaAutomationLocator));			

			// Create an Instance in Action Class by Passing WebDriver Instance
			Actions actBuilder = new Actions(driver);

			// Move the Mouse above the QA Automation
			actBuilder.moveToElement(qaAutomation).build().perform();

			// Click on Registration Form
			WebElement practiceAutomation = driver.findElement(By.xpath(practiceAutomationLocator));

			// Move the Mouse above the Practice Automation
			actBuilder.moveToElement(practiceAutomation).build().perform();

			// Click on Demo Site-Registration Form
			driver.findElement(By.partialLinkText(regForm)).click();
		  Reporter.log("Navigated to Register Demo Page");
	  }
	  
	  
	  @Test(priority=2)
	  public void registerDemo() {
			// Step:4 Validate the Title of Form is displayed as "Register for Demo".

			// Positive Scenario
			WebElement regTitleText = driver.findElement(By.xpath(regTitleTextLocator));
			// Verify Register Title is Displayed or not
			if (regTitleText.isDisplayed()) {
				Reporter.log("Register Title is Displayed");
			} else {
				Reporter.log("Register Title is not Displayed");
			}

			// Verify Register Title page is Enabled or not
			if (regTitleText.isEnabled()) {
				Reporter.log("Register Title is Enabled");
			} else {
				Reporter.log("Register Title is not Enabled");
			}

			// Validating Text
			String actRegTitleText = regTitleText.getText();
			String expRegTitleText = regFormDemo;
	   
			if (actRegTitleText.equals(expRegTitleText)) {
				Reporter.log("The Register Title Text is: " + actRegTitleText);
			} else {
				Reporter.log("Actual and expected Register Title Text are not same ");
				Reporter.log("Actual Text is " + actRegTitleText);
				Reporter.log("Expected Text is " + expRegTitleText);
			}

			// Step:5 Fill the Registration form by entering the all fields.

			// First name
			WebElement firstName = driver.findElement(By.id(firstNameLocator));
			// Verify the First Name is displayed or not
			if (firstName.isDisplayed()) {
				Reporter.log("First Name is Displayed");
			} else {
				Reporter.log("First Name is not Displayed");
			}

			// Verify the First Name is Enabled or not
			if (firstName.isEnabled()) {
				Reporter.log("First Name is Enabled" );
				// Enter First Name
				firstName.sendKeys(firstNameValue);
				Reporter.log("The Present First Name Value is: " + firstNameValue);
			} else {
				Reporter.log("First Name is not Enabled" );
			}

			// Last name
			WebElement lastName = driver.findElement(By.id(lastNameLocator));
			// Verify the Last Name is displayed or not
			if (lastName.isDisplayed()) {
				Reporter.log("Last Name is Displayed");
			} else {
				Reporter.log("Last Name is not Displayed");
			}

			// Verify the Last Name is enabled or not
			if (lastName.isEnabled()) {
				Reporter.log("Last Name is Enabled");
				// Enter Last Name
				lastName.sendKeys(lastNameValue);
				Reporter.log("The Present Last Name Value is: " + lastNameValue);
			} else {
				Reporter.log("Last Name is not Enabled");
			}

			// Gender
			// Male Radio Button
			WebElement maleRdoBtn = driver.findElement(By.id(maleRdoBtnLocator));
			// Verify Male Radio Button is Displayed or not
			if (maleRdoBtn.isDisplayed()) {
				Reporter.log("Male Radio Button is Displayed");
			} else {
				Reporter.log("Male Radio Button is not Displayed");
			}

			// Verify male Radio Button is Enabled or not
			if (maleRdoBtn.isEnabled()) {
				Reporter.log("Male Radio Button is Enabled");
			} else {
				Reporter.log("Male Radio Button is not Enabled");
			}
			
			// Verify Male Radio Button is Selected
			if (maleRdoBtn.isSelected()) {
				Reporter.log("Male Radio Button is Selected");
			} else {
				Reporter.log("Male Radio Button is not Selected");
				// Click on Male Radio Button
				maleRdoBtn.click();
				Reporter.log("Male Radio Button is Selected");
			}

			// Verify Male Radio Button is Selected
			if (maleRdoBtn.isSelected()) {
				Reporter.log("Verified Male Radio Button  is Selected");
			} else {
				Reporter.log("Verified Male Radio Button is not Selected");
			}
			
			// Address
			// Street Address
			WebElement stAddress = driver.findElement(By.name(stAddressNameLocator));
			// Verify the Street Address is displayed or not
			if (stAddress.isDisplayed()) {
				Reporter.log("Street Address is Displayed");
			} else {
				Reporter.log("Street Address is not Displayed");
			}

			// Verify the  Street Address is enabled or not
			if (stAddress.isEnabled()) {
				Reporter.log("Street Address is Enabled");
				// Enter Street Address
				stAddress.sendKeys(streetAddressInput);
				Reporter.log("Present Street Address Value is: " + streetAddressInput);
			} else {
				Reporter.log("Street Address is not Enabled");
			}
			
			// Apartment Number
			WebElement apartmentNo = driver.findElement(By.id(apartmentLocator));
			// Verify the Apartment Number is displayed or not
			if (apartmentNo.isDisplayed()) {
				Reporter.log("Apartment Number is Displayed");
			} else {
				Reporter.log("Apartment Number is not Displayed");
			}

			// Verify the Apartment Number is enabled or not
			if (apartmentNo.isEnabled()) {
				Reporter.log("Apartment Number is Enabled");
				// Enter Apartment Number
				apartmentNo.sendKeys(apartmentInput);
				Reporter.log("Present Apartment Number Value is: " + apartmentInput);	
			} else {
				Reporter.log("Apartment Number is not Enabled");
			}

			// City
			WebElement cityName = driver.findElement(By.id(cityLocator));
			// Verify the City Name is displayed or not
			if (cityName.isDisplayed()) {
				Reporter.log("City Name is Displayed");
				
			} else {
				Reporter.log("City Name is not Displayed");
			}

			// Verify the City Name is enabled or not
			if (cityName.isEnabled()) {
				Reporter.log("City Name is Enabled");
				// Enter City Name
				cityName.sendKeys(cityNameValue);
				Reporter.log("Present City Name Value is : " + cityNameValue);
			} else {
				Reporter.log("City Name is not Enabled");
			}

			// State
			WebElement stateName = driver.findElement(By.id(stateLocator));
			// Verify the State is displayed or not
			if (stateName.isDisplayed()) {
				Reporter.log("State is Displayed");
			} else {
				Reporter.log("State is not Displayed");
			}

			// Verify the State is enabled or not
			if (stateName.isEnabled()) {
				Reporter.log("State is Enabled");
				// Enter State Name
				stateName.sendKeys(stateNameValue);
				Reporter.log("Present State Value is : " + stateNameValue);
			} else {
				Reporter.log("State is not Enabled");
			}

			// Postal/Zip code
			WebElement postalCode = driver.findElement(By.id(postalCodeLocator));
			// Verify the Postal Code is displayed or not
			if (postalCode.isDisplayed()) {
				Reporter.log("Postal Code is Displayed");
			} else {
				Reporter.log("Postal Code is not Displayed");
			}
			
			// Verify the Postal Code is enabled or not
			if (postalCode.isEnabled()) {
				Reporter.log("Postal Code is Enabled");
				// Enter Postal Code
				postalCode.sendKeys(postalCodeValue);
				Reporter.log("Present Postal Code Value is : " + postalCodeValue);
			} else {
				Reporter.log("Postal Code is not Enabled");
			}
			
			// Country Drop Down
			WebElement countryDropDown = driver.findElement(By.id(countryDrpDnLocator));
			// Verify Country Drop Down is displayed or not
			if (countryDropDown.isDisplayed()) {
				Reporter.log("Verified Country Drop Down is Displayed");
			} else {
				Reporter.log("Verified Country Drop Down is not Displayed");
			}
			
			// Verify Country Drop Down is enabled or not
			if (countryDropDown.isEnabled()) {
				Reporter.log("Verified Country Drop Down is enabled");
			} else {
				Reporter.log("Verified Country Drop Down is not enabled");
			}
			
			// To Select the Item from country DropDown, Create the Select Object
			Select countryDrpDn = new Select(countryDropDown);
			// Select Using Visible Text
			countryDrpDn.selectByVisibleText(countryDrpDnValue);
			Reporter.log("Present Country Drop Down Value is: " + countryDrpDnValue);

			// Email
			WebElement email = driver.findElement(By.cssSelector(emailLocator));
			// Verify the Email is Displayed or not
			if (email.isDisplayed()) {
				Reporter.log("Email is Displayed");
			} else {
				Reporter.log("Email is not Displayed");
			}
			
			// Verify the Email is enabled or not
			if (email.isEnabled()) {
				Reporter.log("Email is Enabled");
				// Enter Email Id
				email.sendKeys(emailInput);
				Reporter.log("Present Email Id is: " + emailInput);
			} else {
				Reporter.log("Email is not Enabled");
			}
			
			// Date of Demo
			WebElement dateOfDemo = driver.findElement(By.cssSelector(dateOfDemoLocator));
			// Verify the Mobile Number is Displayed or not
			if (dateOfDemo.isDisplayed()) {
				Reporter.log("Date of Demo is Displayed");
			} else {
				Reporter.log("Date of Demo is not Displayed");
			}
			
			// Verify the Date of Demo is enabled or not
			if (dateOfDemo.isEnabled()) {
				Reporter.log("Date of Demo is Enabled");
				// Enter Date of Demo Value
				dateOfDemo.sendKeys(dateOfDemoValue);
				Reporter.log("Present Date of Demo Value is: " + dateOfDemoValue);
			} else {
				Reporter.log("Date of Demo is not Enabled");
			}
			
			// Convenient Time
	        // Hour Drop Down
			WebElement convenientTimeHrDrpDn = driver.findElement(By.id(hourLocator));
			// Verify Convenient Time Hour Drop Down is Displayed or not
			if (convenientTimeHrDrpDn.isDisplayed()) {
				Reporter.log("Verified Hour DropDown is Displayed ");
			} else {
				Reporter.log("Verified Hour DropDown is not Displayed ");
			}

			// Verify Convenient Time Hour Drop Down is Enabled or not
			if (convenientTimeHrDrpDn.isEnabled()) {
				Reporter.log("Verified Hour DropDown is Enabled ");
				
				// To Select the Item from Convenient Time Hour DropDown, Create the Select Object
				Select hourDropDown = new Select(convenientTimeHrDrpDn);
				// Select Using Visible Text
				hourDropDown.selectByVisibleText(hourInput);
				Reporter.log("Present Hour Drop Down Value is: " + hourInput);
				
			} else {
				Reporter.log("Verified Hour DropDown is not Enabled ");
			}
			
			// Minute Drop Down
			WebElement convenientTimeMinDrpDn = driver.findElement(By.id(minuteLocator));
			// Verify MM Drop Down is Displayed or not
			if (convenientTimeMinDrpDn.isDisplayed()) {
				Reporter.log("Verified Minute DropDown is Displayed");
			} else {
				Reporter.log("Verified Minute DropDown is not Displayed");
			}

			// Verify Minute Drop Down is Enabled or not
			if (convenientTimeMinDrpDn.isEnabled()) {
				Reporter.log("Verified Minute DropDown is Enabled");
				
				// To Select the Item from Minute DropDown, Create the Select Object
				Select minuteDropDown = new Select(convenientTimeMinDrpDn);
				// Select Using Visible Text
				minuteDropDown.selectByVisibleText(minuteInput);
				Reporter.log("Present Minute Drop Down Value is: " + minuteInput);
				
			} else {
				Reporter.log("Verified Minute DropDown is not Enabled");
			}

			
	        // Convenient Time AM/PM Drop Down
			WebElement convenientTimeAmpmDrpDn = driver.findElement(By.id(amPmLocator));
			// Verify Convenient Time AM/PM Drop Down is Displayed or not
			if (convenientTimeAmpmDrpDn.isDisplayed()) {
				Reporter.log("Verified AMPM DropDown is Displayed");
			} else {
				Reporter.log("Verified AMPM DropDown is not Displayed");
			}

			// Verify Convenient Time AM/PM Drop Down is Enabled or not
			if (convenientTimeAmpmDrpDn.isEnabled()) {
				Reporter.log("Verified AMPM DropDown is Enabled");
				
				// To Select the Item from AM/PM DropDown, Create the Select Object
				Select ampmDrpDown = new Select(convenientTimeAmpmDrpDn);
				// Select Using Visible Text
				ampmDrpDown.selectByVisibleText(ampmInput);
				Reporter.log("Present AMPM Drop Down Value is: " + ampmInput );
				
			} else {
				Reporter.log("Verified AMPM DropDown is not Enabled");
			}
			
			
			// Mobile Number
			WebElement mobileNumber = driver.findElement(By.xpath(mobileNoLocator));
			// Verify the Mobile Number is Displayed or not
			if (mobileNumber.isDisplayed()) {
				Reporter.log("Mobile Number is Displayed");
			} else {
				Reporter.log("Mobile Number is not Displayed");
			}

			// Verify the Mobile Number is enabled or not
			if (mobileNumber.isEnabled()) {
				Reporter.log("Mobile Number is Enabled");
				// Enter Mobile Number
				mobileNumber.sendKeys(mobileNumberValue);
				Reporter.log("Present Mobile Number Value is: " + mobileNumberValue);
			} else {
				Reporter.log("Mobile Number is not Enabled");
			}
			
			// Course Interested
			// Functional Testing Check Box
			WebElement functionalTestingChk = driver.findElement(By.id(functionalTestingLocator));
			// Verify The Functional Testing Check Box is displayed or Not
			if (functionalTestingChk.isDisplayed()) {
				Reporter.log("Verified Functional Testing Check Box is Displayed ");
			} else {
				Reporter.log("Verified Functional Testing Check Box is Not Displayed ");
			}
			
			// Verify Functional Testing Check Box Enabled or Not
			if (functionalTestingChk.isEnabled()) {
				Reporter.log("Verified Functional Testing Check Box is Enabled");
			} else {
				Reporter.log("Verified Functional Testing Check Box is Not Enabled");
			}
			
			// Verify Functional Testing Check Box Selected or Not-Initial State(not Selected)
			if (functionalTestingChk.isSelected()) {
				Reporter.log("Verified Functional Testing Check Box is Selected");
			} else {
				Reporter.log("Verified Functional Testing Check Box is Not Selected");
			    // Click on Functional Testing check Box
							functionalTestingChk.click();
				Reporter.log("Functional Testing Check Box is checked");
			}
			
	        // Verify Functional Testing Check Box Selected or Not
			if (functionalTestingChk.isSelected()) {
				Reporter.log("Verified Functional Testing Check Box is Selected");
			} else {
				Reporter.log("Verified Functional Testing Check Box is Not Selected");
			}
			
			// Selenium WebDriver Check Box
			WebElement seleniumWebDriverChk= driver.findElement(By.id(seleniumWebDriverLocator));
			// Verify The Selenium WebDriver Check Box is displayed or Not
			if (seleniumWebDriverChk.isDisplayed()) {
				Reporter.log("Verified Selenium WebDriver Check Box is Displayed ");
			} else {
				Reporter.log("Verified Selenium WebDriver Check Box is Not Displayed ");
			}

			// Verify Selenium WebDriver Check Box Enabled or Not
			if (seleniumWebDriverChk.isEnabled()) {
				Reporter.log("Verified Selenium WebDriver Check Box is Enabled");
			} else {
				Reporter.log("Verified Selenium WebDriver Check Box is Not Enabled");
			}

			// Verify Selenium WebDriver Check Box Selected or Not
			if (seleniumWebDriverChk.isSelected()) {
				Reporter.log("Verified Selenium WebDriver Check Box is Selected");
			} else {
				Reporter.log("Verified Selenium WebDriver Check Box is Not Selected");
				// Click on Selenium WebDriver check Box
			    seleniumWebDriverChk.click();
				Reporter.log("Selenium WebDriver Check Box is Checked ");
			}
			
			// Verify Selenium WebDriver Check Box Selected or Not
			if (seleniumWebDriverChk.isSelected()) {
				Reporter.log("Verified Selenium WebDriver Check Box is Selected");
			} else {
				Reporter.log("Verified Selenium WebDriver Check Box is Not Selected");
				// Click on Selenium WebDriver check Box
				Reporter.log("Selenium WebDriver Check Box is Checked ");
			}
			
			// Enter Your Query
			WebElement enterYourQuery = driver.findElement(By.id(enterYourQueryLocator));
			// Verify the Enter Your Query is Displayed or not
			if (enterYourQuery.isDisplayed()) {
				Reporter.log("Enter Your Query is Displayed");
				
			} else {
				Reporter.log("Enter Your Query is not Displayed");
			}
			// Verify the Enter Your Query is enabled or not
			if (enterYourQuery.isEnabled()) {
				Reporter.log("Enter Your Query is Enabled");
				// Enter Your Query Value
				enterYourQuery.sendKeys(enterYourQueryValue);
				Reporter.log("Present Enter Your Query is: " + enterYourQueryValue);
			} else {
				Reporter.log("Enter Your Query is not Enabled");
			}

			// Enter Any Two Digits
			WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
			// Verify the Enter Any Two Digits is Displayed or not
			if (enterTwoDigits.isDisplayed()) {
				Reporter.log("Enter Any Two Digits is Displayed");
			} else {
				Reporter.log("Enter Any Two Digits is not Displayed");
			}

			// Verify the Enter Any Two Digits is enabled or not
			if (enterTwoDigits.isEnabled()) {
				Reporter.log("Enter Any Two Digits is Enabled");
				
				// Retrieve the Verification Number during run time and enter value.
		    	String text=driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label")).getText();
		    	String num[]=text.split(":");    //Example: 50
		    	enterTwoDigits.sendKeys(num[1].trim());
				Reporter.log("Enter Any Two Digits is: " + num[1]);
			} else {
				Reporter.log("Enter Any Two Digits is not Enabled");
			}
			
			// Submit button
			WebElement submitBtn = driver.findElement(By.id(submitBtnLocator));
			// Verify The Submit Button is displayed or Not
			if (submitBtn.isDisplayed()) {
				Reporter.log("Verified Submit Button is Displayed ");
			} else {
				Reporter.log("Verified Submit Button is Not Displayed ");
			}

			// Verify The Submit Button is Enabled or Not
			if (submitBtn.isEnabled()) {
				Reporter.log("Verified Submit Button is Enabled");
				// Click on Submit Button
				   submitBtn.click();
				Reporter.log("Submit Button is Clicked");
			}
			
			
		  Reporter.log("Details are submitted");
	  }
	  
	  @Test(priority=3)
	  public void validateSuccessfulMsg() {
		  
		// Step:7 Submit the Form.
		WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextLocator));
		// Verify Successful message Text displayed or not
		if (successfulMsgText.isDisplayed()) {
			Reporter.log("Successful Message Text is Displayed");			
		} else {
			Reporter.log("Successful Message Text is not Displayed");
		}
		  
	  // Validating Successful Message Text
		String actSuccessfulMsgText = successfulMsgText.getText();
		String expSuccessfulMsgText = successfulMessageText;

		if (actSuccessfulMsgText.equals(expSuccessfulMsgText)) {
			Reporter.log("The Successful Message Text is:  " + actSuccessfulMsgText);
		} else {
			Reporter.log("Actual and expected Successful Msg Text are not same");
			Reporter.log("Actual Text is: " + actSuccessfulMsgText);
			Reporter.log("Expected Text is: " + expSuccessfulMsgText);
		} 
		  
	  }
	  
	}
	  
	  

