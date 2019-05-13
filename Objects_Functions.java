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
	
	

	
	
	
}
