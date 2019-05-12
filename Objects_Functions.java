package Ben;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;







//import Framework.Objects_Functions;
import Ben.Gui_Functions;
import Ben.Business_Functions;






//import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/*import Framework.Gui_Functions;
import Framework.Utils;
import Framework.Business_Functions;*/

public class Objects_Functions 
{
	
	WebDriver driver;
	
	public Objects_Functions(WebDriver drive)
	{
		driver=drive;	
	}
	
	//MultiBrowser MB ;
	Objects_Functions OF;
	Gui_Functions GF;
	//Utils UT;
	Business_Functions BF;
	
	
	public  WebElement OF_getQueryFromField()
	{
		WebElement QueryFrom = driver.findElement(By.id("queryFrom"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (QueryFrom.isDisplayed())//Login_Button.isDisplayed()
		    {
			    Reporter.log("PASS MetricConversion_Launch: QueryFrom object failed to be loaded");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL MetricConversion_Launch: QueryFrom object success to be loaded");
		    }
		
		return QueryFrom;	    

	}
	
	
	public  WebElement OF_getFirstSearchField()
	{

		 List<WebElement> list = driver.findElements(By.cssSelector(".argument"));
	
	    if (list.isEmpty())  // Username.isDisplayed()
	    {
	    	Reporter.log("FAIL MetricConversion_ConversionsFields: ConversionsFields object failed to be loaded");	

	    }
	    else
	    {
	    	Reporter.log("PASS MetricConversion_ConversionsFields: ConversionsFields object success to be loaded");	
	    	
	    }

	    WebElement Field = list.get(0);
	    return Field;   

	}
	
	public  WebElement OF_getFirstconvertGreenButton()
	{
		 List<WebElement> list = driver.findElements(By.cssSelector("a.convert.greenButton"));
			
		    if (list.isEmpty())  // Username.isDisplayed()
		    {
		    	Reporter.log("FAIL MetricConversion_ConvertButton: ConvertButton object failed to be loaded");	

		    }
		    else
		    {
		    	Reporter.log("PASS MetricConversion_ConvertButton: ConvertButton object success to be loaded");	
		    	
		    }

		    WebElement Button = list.get(0);
		    return Button;   

	}
	
	public  WebElement OF_getConversionResponse()
	{
		WebElement Answer = driver.findElement(By.id("answer"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Answer.isDisplayed())//Login_Button.isDisplayed()
		    {
			    Reporter.log("PASS MetricConversion_Answer: Answer object success to be loaded");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL MetricConversion_Answer: Answer object failed to be loaded");
		    }
		
		return Answer;	    

	}
	
	
	public Select  OF_Select_Format() 
	{
		
		

		Select Format = new Select(driver.findElement(By.id("format")));//offerNames_input
		System.out.println("Coucou Ben ");
		
		if (Format != null)
	    {
			Reporter.log("PASS TO FIND CONVERSION FORMAT");
			
	    }
	    else
	    {
	    	Reporter.log("FAIL TO FIND CONVERSION FORMAT"); 
	    }
		
		return Format;
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	public  WebElement OF_getLogin_Username()
	{
	    List<WebElement> list = driver.findElements(By.cssSelector(".ui-inputfield"));
	    
	   
	    if (list.isEmpty())  // Username.isDisplayed()
	    {
	    	Reporter.log("FAIL BO_LOGIN: Username object failed launched");	

	    }
	    else
	    {
	    	//Reporter.log("PASS BO_LOGIN: Username object successfully launched");	
	    	
	    }

	    WebElement Username = list.get(0);
	    return Username;	    

	}
	
	public  WebElement OF_getLogin_Password()
	{
	    List<WebElement> list = driver.findElements(By.cssSelector(".ui-inputfield"));
	   
	    
	    if (list.isEmpty())//Password.isDisplayed()
	    {
	    	Reporter.log("FAIL BO_LOGIN: Password object failed launched");
	    }
	    else
	    {
	    	//Reporter.log("PASS BO_LOGIN: Password object successfully launched");
	    }
	    
	    WebElement Password = list.get(1);
	    return Password;	    
	}
	
	public  WebElement OF_getLogin_Go()
	{
	    List<WebElement> list = driver.findElements(By.cssSelector(".ui-button-text"));
	    
	    if (list.isEmpty())//Login_Button.isDisplayed()
	    {
	    	Reporter.log("FAIL BO_LOGIN: Go object failed launched");
	    }
	    else
	    {
	    	//Reporter.log("PASS BO_LOGIN: Go object successfully launched");
	    }
	    WebElement Login_Button = list.get(1);
	    return Login_Button;	    
	}
	
	
	
	
	public   WebElement OF_Sign_Out ()
	{
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		String Sign;
		WebElement Sign_;
		//System.out.println(links.size());
 
		for (int i = 0; i<=(links.size()); i=i+1)
       
		{
 
			//System.out.println(links.get(i).getText());
 
		}
		Sign = links.get(links.size()-8).getText();
		//System.out.println("Logout step is : "+ Sign);
		Sign_=links.get(links.size() - 8);
		//System.out.println("Size is : "+ links.size());
		//System.out.println("Logout step is : "+ Sign_);
		//System.out.println("Logout step is : "+ Sign_.getText());*/
		WebElement Sign = driver.findElement(By.linkText("Sign out"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			    //Reporter.log("PASS BO_LOGOUT: Sign_In Object successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL BO_LOGOUT: Sign_In Object failed launched");
		    }
		
		return Sign;


	}
	
	
	public   WebElement OF_Sign_Out_ES ()
	{
		
	
		WebElement Sign = driver.findElement(By.linkText("Salir"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			   // Reporter.log("PASS BO_LOGOUT: Sign_In Object successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL BO_LOGOUT: Sign_In Object failed launched");
		    }
		
		return Sign;


	}
	
	public   WebElement OF_Sign_Out_BR ()
	{
		
	
		WebElement Sign = driver.findElement(By.linkText("Encerrar sessão"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			   // Reporter.log("PASS BO_LOGOUT: Sign_In Object successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL BO_LOGOUT: Sign_In Object failed launched");
		    }
		
		return Sign;


	}
	
	public List OF_GetMenuItems ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-menuitem-text"));
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_LOGIN: Fail to launch the BO menu");
		
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_LOGIN: Pass to launch the BO menu");
	    	
	    }
		return list;
	}
	

	
	public List OF_GetButtonText ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-button-text"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Buttons");
		  
	    }
	    else
	    {
	    	 //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		
		return list;
	}
	
	public List OF_GetDetailButton ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-button-icon-left"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Detail Button");
		  
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_BUTTONS: Pass to launch BO Detail Button");
	    }
		
		return list;
	}
	

	public List OF_GetFields ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-inputfield"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_FIELDS: Failed to launch BO Fields");
		  
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_FIELDS: Pass to launch BO Fields");
	    }
		
		return list;
	}
	
	public List OF_SearchGatewayButton ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-icon-search"));//
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_SEARCH: Fail to find this gateway or customer");
		  
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_SEARCH: Pass to find this gateway or customer");
	    }
		
		return list;
	}
	

	
	public List OF_UploadGateway_UI_Buttons ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-button"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Buttons");
		  
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		
		return list;
	}
	
	
	public List  OF_Offer_Country() 
	{
		
		
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-selectonemenu-trigger"));//.ui-selectonemenu
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Buttons");
		  
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		
		return list;
	}
	
	public List  OF_Offer_Country_List() 
	{
		
		
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-selectonemenu-item"));//ui-selectonemenu-item
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Buttons");
		  
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		
		return list;
	}
	

	public Select  OF_Select_Offer_Name() 
	{
		
		
		//List<WebElement> Offer = driver.findElements(By.id("offerNames"));
		//new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");
	
		
		Select Offer = new Select(driver.findElement(By.id("offerNames_input")));//offerNames_input
		System.out.println("Coucou Ben ");
		
		if (Offer != null)
	    {
			//Reporter.log("PASS BO_CREATE_CUSTOMER: The OfferNames list is present on the environnement");
			
	    }
	    else
	    {
	    	Reporter.log("FAIL BO_CREATE_CUSTOMER: The OfferNames list is not present on the environnement"); 
	    }
		
		return Offer;
	}
	
	public Select  OF_Select_Country_Name() 
	{
		
		
		/*List<WebElement> Offer = driver.findElements(By.id("offerNames"));
		new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");*/
		
	
		Select Offer = new Select(driver.findElement(By.id("country_input")));//country_input
		System.out.println("Coucou Ben ");
		
		if (Offer != null)
	    {
			
			//Reporter.log("PASS BO_CREATE_CUSTOMER: The Country list is present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL BO_CREATE_CUSTOMER: The Country list is not present on the environnement"); 
	    }
		
		return Offer;
	}
	
	
	public List OF_User_RegistrationInputs()
	{
		

		List<WebElement> list = driver.findElements(By.className("inputText"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_REGISTRATION: The User Registrations fields list is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS BO_REGISTRATION: The User Registrations fields list is present on the environnement");
	    }
		
		return list;
	}
	
	public List OF_User_Registration_NextButton()
	{
		

		List<WebElement> list = driver.findElements(By.className("go"));
		

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-The Registration_NextButton list is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-The Registration_NextButton list is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	
	public List OF_User_Registration_newPassword()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("newPassword"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-The Registration_NewPassword list is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-The Registration_NewPassword list is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	
	public List OF_User_Registration_confirmNewPassword()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("confirmNewPassword"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-The Registration_confirmNewPassword list is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-The Registration_confirmNewPassword list is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public Select OF_User_Registration_SelectQuestion1()
	{
		
		//List<WebElement> list = driver.findElements(By.name("offerNames"));
		//List<WebElement> list = driver.findElements(By.id("offerNames"));
		
		//new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");
		Select Question = new Select(driver.findElement(By.name("securityQuestionsComponent:securityQuestionsRepeat:0:question")));
		
		
		if (Question != null)
	    {
			//Reporter.log("PASS- User_Registration Security Question1 is present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL- User_Registration Security Question1 is not present on the environnement"); 
	    }
		
		return Question;
	}
	
	public Select OF_User_Registration_SelectQuestion2()
	{
		
		//List<WebElement> list = driver.findElements(By.name("offerNames"));
		//List<WebElement> list = driver.findElements(By.id("offerNames"));
		
		//new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");
		Select Question = new Select(driver.findElement(By.name("securityQuestionsComponent:securityQuestionsRepeat:1:question")));

		
		if (Question != null)
	    {
			//Reporter.log("PASS- User_Registration Security Question2 is present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL- User_Registration Security Question2 is not present on the environnement"); 
	    }
		
		return Question;
	}
	
	public Select OF_User_Registration_SelectQuestion3()
	{
		
		//List<WebElement> list = driver.findElements(By.name("offerNames"));
		//List<WebElement> list = driver.findElements(By.id("offerNames"));
		
		//new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");
		Select Question = new Select(driver.findElement(By.name("securityQuestionsComponent:securityQuestionsRepeat:2:question")));

		
		if (Question != null)
	    {
			//Reporter.log("PASS- User_Registration Security Question3 is present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL- User_Registration Security Question3 is not present on the environnement"); 
	    }
		
		return Question;
	}
	
	public Select OF_User_Registration_SelectQuestion4()
	{
		
		//List<WebElement> list = driver.findElements(By.name("offerNames"));
		//List<WebElement> list = driver.findElements(By.id("offerNames"));
		
		//new Select(driver.findElement(By.id("offerNames"))).selectByVisibleText("Germany");
		Select Question = new Select(driver.findElement(By.name("securityQuestionsComponent:securityQuestionsRepeat:3:question")));

		
		if (Question != null)
	    {
			//Reporter.log("PASS- User_Registration Security Question4 is present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL- User_Registration Security Question4 is not present on the environnement"); 
	    }
		
		return Question;
	}
	
	public List OF_User_Registration_SecurityResponse1()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("securityQuestionsComponent:securityQuestionsRepeat:0:answer"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-User_Registration Security Response1 is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-User_Registration Security Response1 is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_User_Registration_SecurityResponse2()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("securityQuestionsComponent:securityQuestionsRepeat:1:answer"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-User_Registration Security Response2 is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-User_Registration Security Response2 is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_User_Registration_SecurityResponse3()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("securityQuestionsComponent:securityQuestionsRepeat:2:answer"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-User_Registration Security Response3 is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-User_Registration Security Response3 is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_User_Registration_SecurityResponse4()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.name("securityQuestionsComponent:securityQuestionsRepeat:3:answer"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-User_Registration Security Response4 is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-User_Registration Security Response4 is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	
	public List OF_User_Registration_SecuritySave()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.className("submitQuestionsButton"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL-SecuritySave button is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS-SecuritySave button is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_Selfcare_Loginfiedls()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.className("inputText"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care/Installer Login fields are not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care/Installer Login fields are present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_Selfcare_Login_Go()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.className("go"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care/Installer Login Go button is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care/Installer Login Go button is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_Selfcare_StartMaintenance()
	{
		

		List<WebElement> list = driver.findElements(By.className("triggerTopDrop"));
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"j_idt73:toptoolbarForm\"]/div/div[4]/div[2]/a/small"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care Drop List Menu  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care Drop List Menu is present on the environnement");
	    	
	    }
		
		return list;

		
		
	}
	
	public List OF_Selfcare_StartMaintenance_BR()
	{
		

		List<WebElement> list = driver.findElements(By.className("topMenuDropdown"));
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"j_idt73:toptoolbarForm\"]/div/div[4]/div[2]/a/small"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care Drop List Menu  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care Drop List Menu is present on the environnement");
	    	
	    }
		
		return list;

		
		
	}
	
	
	
	public List OF_Selfcare_StartMaintenance_Item()
	{
		

		
		List<WebElement> list = driver.findElements(By.className("startMaintenanceMode"));
		//List<WebElement> list = driver.findElements(By.className("ui-commandlink"));
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"j_idt73:startMaintenanceMode\"]"));
		//List<WebElement> list = driver.findElements(By.className("innerTopDrop"));
		//List<WebElement> list =driver.findElements(By.id("a[id*='startMaintenanceMode']"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care Start Maintenance Item  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care Start Maintenance Item  is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_Selfcare_InviteInstaller_Item()
	{
		

		
		List<WebElement> list = driver.findElements(By.className("requestInstaller"));
		//List<WebElement> list = driver.findElements(By.className("ui-commandlink"));
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"j_idt73:startMaintenanceMode\"]"));
		//List<WebElement> list = driver.findElements(By.className("innerTopDrop"));
		//List<WebElement> list =driver.findElements(By.id("a[id*='startMaintenanceMode']"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care Invite Installer Item  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care Invite Installer Item  is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_Selfcare_Logout()
	{
		

		//List<WebElement> list = driver.findElements(By.className("inputTextContainer"));
		List<WebElement> list = driver.findElements(By.className("log"));
		//List<WebElement> list = driver.findElements(By.className("innerTopDrop"));
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL -Self Care Logout Item  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS -Self Care Logout Item  is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public void OF_SearchItemsButton ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-icon-search"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			// Reporter.log("PASS BO_DELETE_CUSTOMERS: The customer was successfully deleted from the environnement");

	    }
	    else
	    {
	    	 Reporter.log("FAIL BO_DELETE_CUSTOMERS: The customer was not deleted from the environnement");
	    }
		
		//return list;
	}
	
	public WebElement OF_Maintenance_Link ()
	{
		WebElement Link = driver.findElement(By.xpath("//*[@id=\"ecomForm\"]/div[2]/div/h1"));
		return Link;
	}
	
	
	public List OF_ActivatehomeBox_Hyperlink ()
	{
		List HyperLink = null;
		HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul[2]/li[1]/a"));
		//HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul/li/a"));
		//List HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul[2]/li[1]/a"));
		//List HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul/li[1]/a"));

		
		
		//*[@id="activationForm"]/div/ul[1]/li/a
		//*[@id="activationForm"]/div/ul[2]/li[1]/a
		//*[@id="activationForm"]/div/ul[2]/li[2]/a
		
		
		if (HyperLink.isEmpty())
		{
			
			HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul/li/a"));
			                                           
			if (HyperLink.isEmpty())
			{
				HyperLink =  driver.findElements(By.xpath("//*[@id=\"activationForm\"]/div/ul/li[1]/a"));
			}
			
			if (HyperLink.isEmpty())
			{
				Reporter.log("FAIL SC_Activate_Hyperlink not present after activating the homebox");
			}
			

		}
		
		else
		{
			//Reporter.log("PASS SC_Activate_Hyperlink successfully present after activating the homebox");

		}
		
		
		return HyperLink;
	}
	
	public void OF_ActivatehomeBox_CheckSuccess ()
	{
		  WebElement Success1 =  driver.findElement(By.xpath("//*[@id=\"ecomForm\"]/div[2]/div/h1"));
		//WebElement Success1 =  driver.findElement(By.xpath("//*[@id=\"ecomForm\"]/div[2]/div/h1"));

		//WebElement Success2 =  driver.findElement(By.xpath("//*[@id=\"activationForm\"]/div/ul[2]/li[1]/a"));
		//WebElement Success2 =  driver.findElement(By.xpath("//*[@id=\"activationForm\"]/div/ul/li[1]/a"));
		WebElement Success2 =  driver.findElement(By.xpath("//*[@id=\"activationForm\"]/div/p[1]/b"));
		String Success1_Text= Success1.getText();
		String Success2_Text= Success2.getText();
		if ((Success1_Text.equalsIgnoreCase("Home Box activation") || Success1_Text.equalsIgnoreCase("Ativação do Home Box") || Success1_Text.equalsIgnoreCase("Activación de la Home Box")) && (Success2_Text.equalsIgnoreCase("Your Home Box DUMMYPM360UK is activated") || Success2_Text.equalsIgnoreCase("Your Home Box DUMMYPM360DX is activated") || Success2_Text.equalsIgnoreCase("Your Home Box DUMMYPM360SA1 is activated") || Success2_Text.equalsIgnoreCase("Seu Home Box DUMMYPM360BR está ativo") || Success2_Text.equalsIgnoreCase("Su Home Box DUMMYPM360ES1 ya se ha activado") || Success2_Text.equalsIgnoreCase("Su Home Box DUMMYPM360AR ya se ha activado") || Success2_Text.equalsIgnoreCase("Su Home Box DUMMYPM360CL ya se ha activado") || Success2_Text.equalsIgnoreCase("Su Home Box DUMMYPM360MX ya se ha activado") || Success2_Text.equalsIgnoreCase("Su Home Box DUMMYPM360UY ya se ha activado") ))
		{
			//Reporter.log("PASS HomeBox succesfully activated");

		}
		
		else
		{
			Reporter.log("FAIL HomeBox was not activated");
			
		}
	
	}
	
	public void OF_Selfcare_NoInternet_CheckSuccess ()
	{
		WebElement Success =  driver.findElement(By.xpath("//*[@id=\"newAccessoryPanel\"]/div/div"));

		String Success_Text= Success.getText();
		if (Success_Text.equalsIgnoreCase("No Internet connection") || Success_Text.equalsIgnoreCase("Sem conexão com Internet") || Success_Text.equalsIgnoreCase("No hay conexión a internet"))
		{
			//Reporter.log("PASS SC_NoInternetConnection is ok after HomeBoxActivation");

		}
		
		else
		{
			Reporter.log("FAIL SC_NoInternetConnection is not ok after HomeBoxActivation");

		}
	
	}
	
	
	public List OF_ChangeTenant_ChooseTenant()
	{
		
		//List<WebElement> listOfLiTags = driver.findElement(By.Id("yourUlId")).findElements(By.TagName("li"));
		List<WebElement> list = driver.findElements(By.className("ui-selectonemenu-trigger"));
		
		//List<WebElement> list = driver.findElements(By.className("log"));
		
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL - Change Tenant Item  is not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS - Change Tenant Item  is present on the environnement");
	    	
	    }
		
		return list;
	}
	
	public List OF_ChangeTenant_Tenant()
	{
		
		//List<WebElement> listOfLiTags = driver.findElement(By.Id("yourUlId")).findElements(By.TagName("li"));
		List<WebElement> list = driver.findElements(By.className("ui-selectonemenu-item"));
		
		//List<WebElement> list = driver.findElements(By.className("log"));
		
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL - Tenant Items  are not present on the environnement"); 
	    }
	    else
	    {
	    	//Reporter.log("PASS - Tenant Items  are present on the environnement");
	    	
	    }
		
		return list;
	}
	
	
	public  WebElement OF_GetAgreement()
	{
	    List<WebElement> list = driver.findElements(By.cssSelector(".go"));
	    
	    if (list.isEmpty())
	    {
	    	Reporter.log("FAIL BO_I Agree: (I Agree) object failed launched");
	    }
	    else
	    {
	    	//Reporter.log("PASS BO_I Agree: (I Agree) object successfully launched");
	    }
	    WebElement IAgree_Button = list.get(0);
	    return IAgree_Button;	    
	}
	
	public  WebElement OF_GetEndMode()
	{
	    List<WebElement> list = driver.findElements(By.cssSelector(".installerMenuGo"));
	    
	    if (list.isEmpty())
	    {
	    	Reporter.log("FAIL BO_EndMode: (End Mode) object failed launched");
	    }
	    else
	    {
	    	//Reporter.log("PASS BO_I Agree: (End Mode) object successfully launched");
	    }
	    WebElement End_Mode_Button = list.get(0);
	    return End_Mode_Button;	    
	}
	
/*---------------------------------------------------------Events------------------------------------------------------------------------*/
	
	public WebElement OF_Selfcare_Events_HistoryTab ()
	{
		WebElement History = driver.findElement(By.className("menuItem-historyList"));

		  if (History.isDisplayed())
		    {
			    //Reporter.log("PASS SC_Events_History: History Tab successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL SC_Events_History: History Tab failed to launch");
		    }
		
		return History;
	
	}
	
	
	public List OF_Selfcare_Events_HistoryEvents ()
	{
		List<WebElement> list = driver.findElements(By.className("col3"));
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL History Events: Fail to launch History events");
		
	    }
	    else
	    {
	    	  //Reporter.log("PASS History Events: Pass to launch History events");
	    	
	    }
		return list;
	}
	
	public List OF_Selfcare_Events_NextEvents ()
	{
		List<WebElement> list = driver.findElements(By.className("play"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL Next Events: Fail to launch Next Events buttons");
		
	    }
	    else
	    {
	    	  //Reporter.log("PASS Next Events: Pass to launch Next Events buttons");
	    	
	    }
		return list;
	}
	
	public List OF_Selfcare_Events_BackEvents ()
	{
		List<WebElement> list = driver.findElements(By.className("play"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL Back Events: Fail to launch Back Events buttons");
		
	    }
	    else
	    {
	    	  //Reporter.log("PASS Back Events: Pass to launch Back Events buttons");
	    	
	    }
		return list;
	}
	
	public Select OF_Select_Period()//List
	{
		
		//List<WebElement> Period = driver.findElements(By.name("period"));
		Select Period = new Select(driver.findElement(By.name("period")));

		
		if (Period != null)
		//if (Period.isEmpty())
	    {
			//Reporter.log("PASS Back Events Gui: The Period list is present on the environnement");
			//Reporter.log("FAIL Back Events Gui: The Period list is not present on the environnement");
	    }
	    else
	    {
	    	Reporter.log("FAIL Back Events Gui: The Period list is not present on the environnement"); 
	    	//Reporter.log("PASS Back Events Gui: The Period list is present on the environnement");
	    }
		
		return Period;
	}
	
	//---------------------------------------------------BO_Offers_Excel_Comparison--------------------------------------------------------------
	
	public List OF_BO_Offers_Detail ()
	{
		List<WebElement> list = driver.findElements(By.className("ui-icon-search"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO Offers: Fail to launch Offer details");
		
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO Offers: Pass to launch Offer details");
	    	
	    }
		return list;
	}
	
	public List OF_BO_Offers_Detail_BotomItems ()
	{
		List<WebElement> list = driver.findElements(By.className("ui-corner-top"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO Offers Detail: Fail to launch Bottom Items");
		
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO Offers Detail: Pass to launch Bottom Items");
	    	
	    }
		return list;
	}
	
	
	public  WebElement OF_getSubscription_Type()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"subscriptionType\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDetail: Offer Type object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDetail: Offer Type object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public  WebElement OF_getOffer_Type()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"offerType\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDetail: Offer Type object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDetail: Offer Type object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public  WebElement OF_getOffer_Price()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"offerPrice\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDetail: Offer Price object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDetail: Offer Price object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public  WebElement OF_getPricingPlan()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"pricingPlan_label\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDetail: Pricing Plan object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDetail: Pricing Plan object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public  WebElement OF_getOfferDescription()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"offerTabs:description\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDescription: Offer Description object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDescription: Offer Description object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public  WebElement OF_InitialAmount()
	{
	    //List<WebElement> list = driver.findElements(By.id(".offerType"));
		WebElement Ben = driver.findElement(By.xpath("//*[@id=\"offerTabs:description\"]"));
	    
	   
	    if (Ben.isDisplayed())  // Username.isDisplayed() list.isEmpty()
	    {
	    	//Reporter.log("PASS BO_OffersDescription: Offer Description object successfully launched");	

	    }
	    else
	    {
	    	Reporter.log("FAIL BO_OffersDescription: Offer Description object failed launched");	
	    	
	    }

	    
	    return Ben;	    

	}
	
	public List OF_BO_Offers_ComPProd_Services_Verticals_Table ()  
	{
		//List<WebElement> list = driver.findElements(By.className("ui-dt-c"));
		List<WebElement> list = driver.findElements(By.className("ui-tabs-panels"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO_Offers_ComPProd_Services_Vertical: Fail to launch the table");
		
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO Offers Detail: Pass to launch Bottom Items");
	    	
	    }
		//Reporter.log("Number of cells : " + list.size() );
		return list;
	}
	
	
	public List OF_BO_Offers_ServicesVerticals_BoxCheck()  
	{
		List<WebElement> list = driver.findElements(By.className("ui-button"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO_Offers_ServicesVerticals: Fail to find checkbox icons"  );
		
	    }
	    else
	    {
	    	  //Reporter.log("Nbre de check box :" + list.size());
	    	
	    }
		//Reporter.log("Number of cells : " + list.size() );
		return list;
	}
	
	public List OF_BO_Offers_ServicesVerticals_CheckedBox()  
	{
		List<WebElement> list = driver.findElements(By.className("checkBoxSelected"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO_Offers_ServicesVerticals: Fail to find checkbox icons checked"  );
		
	    }
	    else
	    {
	    	  //Reporter.log("Nbre de check box :" + list.size());
	    	
	    }
		//Reporter.log("Number of cells : " + list.size() );
		return list;
	}
	

	public List OF_BO_Offers_ComPProd_BoxCheck()  
	{
		List<WebElement> list = driver.findElements(By.className("ui-chkbox-icon"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO_Offers_ComPProd: Fail to find checkbox icons"  );
		
	    }
	    else
	    {
	    	  //Reporter.log("Nbre de check box :" + list.size());
	    	
	    }
		//Reporter.log("Number of cells : " + list.size() );
		return list;
	}
	
	public List OF_BO_Offers_ComPProd_CheckedBox()  
	{
		List<WebElement> list = driver.findElements(By.className("ui-icon-check"));
		if (list.isEmpty())
	    {
			Reporter.log("FAIL BO_Offers_ComPProd: Fail to find checkbox icons checked"  );
		
	    }
	    else
	    {
	    	  //Reporter.log("Nbre de check box :" + list.size());
	    	
	    }
		//Reporter.log("Number of cells : " + list.size() );
		return list;
	}
	
	//***********************************************Mails Users Creation*************************************************************************
	
	
	public   List OF_TempMail_MailField ()
	{

		List <WebElement> MailField = driver.findElements(By.className("form-control"));


		  if (MailField.isEmpty())
		    {
			  Reporter.log("FAIL MailField: Fail to launch Mail Field");
		    }
		    else
		    {
		    	
		    }
		
		return MailField;
		


	}
	
	
	public   WebElement OF_TempMail_Domain ()
	{
		
		WebElement DomainField = driver.findElement(By.xpath("//*[@id=\"domain\"]"));

		  if (DomainField.isDisplayed())//Login_Button.isDisplayed()
		    {

		    }
		    else
		    {
		    	Reporter.log("FAIL DomainField: Fail to launch Domain Field");
		    }
		
		return DomainField;


	}
	
	public   WebElement OF_TempMail_Retour ()
	{
		

		WebElement RetourField = driver.findElement(By.xpath("//*[@id=\"click-to-change\"]/span"));
		  if (RetourField.isDisplayed())		    {

		    }
		    else
		    {
		    	Reporter.log("FAIL RetourField: Fail to launch Retour Field");
		    }
		
		return RetourField;

	}
	
	public   WebElement OF_TempMail_Enregistrer ()
	{
		

		//WebElement EnregistrerField = driver.findElement(By.xpath("//*[@id=\"postbut\"]"));
		WebElement EnregistrerField =driver.findElement(By.className("btn-success"));
		  if (EnregistrerField.isDisplayed())
		    {
			 
		    }
		    else
		    {
		    	Reporter.log("FAIL EnregistrerField: Fail to launch Enregistrer Field");
		    }
		
		return EnregistrerField;

	}
	
	
	public   WebElement OF_TempMail_Refresh ()
	{
		

		WebElement RefreshField = driver.findElement(By.xpath("//*[@id=\"click-to-refresh\"]/span"));

		  if (RefreshField.isDisplayed())
		    {
			 
		    }
		    else
		    {
		    	Reporter.log("FAIL RefreshField: Fail to launch Refresh Field");
		    }
		
		return RefreshField;

	}
	
	public   WebElement OF_TempMail_Delete ()
	{
		

		WebElement DeleteField = driver.findElement(By.xpath("//*[@id=\"click-to-delete\"]/span"));

		  if (DeleteField.isDisplayed())
		    {
			 
		    }
		    else
		    {
		    	Reporter.log("FAIL DeleteField: Fail to launch Delete Field");
		    }
		
		return DeleteField;

	}
	
	//Added by Eliran
	public List  OF_Offers_DropDown_List() 
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-corner-all"));//.ui-selectonemenu,.ui-selectonemenu-list-item,.ui-selectonemenu-item
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO Buttons");
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		return list;
	}

	//Added by Eliran
	public List  OF_Lang_DropDown_List() 
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-selectonemenu-list-item"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch Lang DDL");
	    }
	    else
	    {
	    	  //Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		return list;
	}

	
	//Added by Eliran - Gets the ID field from customer search result
	public List OF_CustomerSearchResult_GetCustomerID ()
	{
		List<WebElement> List = driver.findElements(By.cssSelector(".idColumn"));
		if (List.isEmpty())//Login_Button.isDisplayed()
	    {
			 //Reporter.log("FAIL BO_CustomerSearch: The customer was not found by the search");
			 System.out.println("FAIL BO_CustomerSearch: The customer was not found by the search");

	    }
	    else
	    {
	    	 
	    }
		
		return List;
	}
	
	
	//Added by Eliran - checks if the result list is not empty - DOUBLE
	public void OF_SearchItemsButton_ResultisNotEmpty (String SearchFor)
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-icon-search"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			 Reporter.log("FAIL to get results for: "+SearchFor);
			 System.out.println("FAIL to get results for: "+SearchFor);

	    }
	    else
	    {
	    	 //Reporter.log("PASS BO_CustomerSearch: The customer was not deleted from the environnement");
	    }
		
	}
	
	//Added by Eliran - checks if the Invoice result list is not empty
	public void OF_SearchDownloadLink_ResultisNotEmpty (String SearchFor)
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".download"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			 Reporter.log("FAIL to get results for: "+SearchFor);
			 System.out.println("FAIL to get results for: "+SearchFor);

	    }
	    else
	    {
	    	 //Reporter.log("PASS BO_CustomerSearch: The customer was not deleted from the environnement");
	    }
		
	}
	
	//Eliran start
	public List OF_GetCustomerDetailsTABText ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-state-default.ui-corner-top"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_BUTTONS: Fail to launch BO TABs");
		  
	    }
	    else
	    {
	    	Reporter.log("The CustomerDetails TAB list is:"+list); 
	    	//Reporter.log("PASS BO_BUTTONS: Pass to launch BO Buttons");
	    }
		
		return list;
	}
	//Eliran end
	


	
	public WebElement OF_GetLable_webelement  ()
	{
		WebElement list = driver.findElement(By.xpath("//*[@id='customerDetailsPanel_content']/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]"));
		
		
		//*[@id="customerDetailsPanel_content"]/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]

		//List<WebElement> list = driver.findElements(By.);
		
				
		return list;
	}
	
	public List OF_GetLable  ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-widget-content"));
		

		//List<WebElement> list = driver.findElements(By.);
		
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_FIELDS: Failed to launch BO Lables");
		  
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_FIELDS: Pass to launch BO Fields");
	    }
		
		return list;
	}
	
	
	
	public List OF_GetMessage ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-messages-info-detail"));
		
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_FIELDS: Failed to find message");
		  
	    }
	    else
	    {
	    	 // Reporter.log("PASS BO_FIELDS: Pass to launch BO Fields");
	    }
		
		return list;
	}
	

	
	public List OF_SearchDownloadLink ()
	{
		List<WebElement> list = driver.findElements(By.cssSelector(".download"));
		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_SEARCH: Fail to find invoice resoults");
		  
	    }
	    else
	    {
	    	  Reporter.log("PASS BO_SEARCH: Pass to find invoice resoults");
	    }
		
		return list;
	}
	
	
	public List OF_SearchCustomerNameLink_Click ()
	{
		
		//List<WebElement> list = driver.findElements(By.cssSelector("a[href*='customer-details']"));
		List<WebElement> list = driver.findElements(By.cssSelector("a[href*='/bo/customer/site-details.xhtml?id=']"));

		if (list.isEmpty())//Login_Button.isDisplayed()
	    {
			Reporter.log("FAIL BO_SEARCH: Fail to find invoice resoults");
		  
	    }
	    else
	    {
	    	  Reporter.log("PASS BO_SEARCH: Pass to find invoice resoults");
	    }
		
		return list;
	}
	

	//New Registration
	public   WebElement OF_GetPrefixNumber ()
	{
		
	
		WebElement Sign = driver.findElement(By.className("cc-picker"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			   // Reporter.log("PASS BO_LOGOUT: Sign_In Object successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL GetPrefixNumber: GetPrefixNumber Object failed launched");
		    }
		
		return Sign;


	}
	
	public   WebElement OF_GetSearchPrefixNumber ()
	{
		
	
		WebElement Sign = driver.findElement(By.className("cc-picker-code-filter"));

		//WebElement Sign = driver.findElement(By.xpath("//*[@id=\"j_idt21\"]/div[1]/a"));
	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			   // Reporter.log("PASS BO_LOGOUT: Sign_In Object successfully launched");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL GetSearchPrefixNumber: GetSearchPrefixNumber Object failed launched");
		    }
		
		return Sign;


	}
	
	public   WebElement OF_GetSearchPrefixNumber_Found ()
	{
		
	
		//WebElement Sign = driver.findElement(By.cssSelector("span[class='cc-picker-code']"));
		WebElement Sign = driver.findElement(By.cssSelector("div[class='cc-picker-flag il']"));


	
		  if (Sign.isDisplayed())//Login_Button.isDisplayed()
		    {
			    Reporter.log("PASS GetSearchPrefixNumber_Found");
			  
		    }
		    else
		    {
		    	Reporter.log("FAIL GetSearchPrefixNumber_Found: GetSearchPrefixNumber_Found Object failed launched");
		    }
		
		return Sign;


	}
	
	
}
