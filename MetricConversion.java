package Ben;

/*import java.util.List;
import java.util.concurrent.TimeUnit;*/

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.Page;
import com.thoughtworks.selenium.webdriven.commands.SeleniumSelect;

import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
/*import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
/*import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;*/
import org.testng.annotations.Parameters;
/*import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;*/
import org.testng.annotations.DataProvider;

import Ben.Objects_Functions;
import Ben.Gui_Functions;
//import Ben.Utils;
import Ben.Business_Functions;

import java.security.Provider;
import java.security.Security;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import pageObjects.*;


import Utility.Constant;

// Import Package utility.*

import Utility.ExcelUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.mail.search.SubjectTerm;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MetricConversion 
{
	public WebDriver driver;
	MetricConversion MB ;
	Objects_Functions OF;
	Gui_Functions GF;
	//Utils UT;
	Business_Functions BF;

	
	

	  @Test
	  @Parameters({"browser","env","flow","SourceToConvert","datavalue"})
  public void main( String browser, String env,String flow,String SourceToConvert,String datavalue) throws Exception {
	  
	   Business_Functions BF = new Business_Functions (driver);
	   Gui_Functions GF  = new Gui_Functions(driver);



		  if(flow.equalsIgnoreCase("CelsiusToFarenheit"))
		  {
			  	String answer;
			  	BF.BF_Convert(SourceToConvert,datavalue, driver);
			    Thread.sleep(5000); 
			    
				
				answer=GF.GF_Answer(driver);
				
				String [] parts =answer.split("°");
				String part2 = parts[1];
				String [] b =part2.split("C= ");
				String b2 = b[1];
				//System.out.println("The data input is "+ b2);
				
				String [] c =b2.split("\\.");
				String c1 = c[0];
				//System.out.println("The faranheit temperature result is "+ c1);
				
				int result = Integer.parseInt(c1);
				//System.out.println("The data result is "+ result);
				int input = Integer.parseInt(datavalue);
				//System.out.println("The data input is "+ input);
				int checkresult= (int) ( (input*1.8) + 32);
				//System.out.println("The data input is "+ checkresult);

				
				if (result==checkresult)
			    {
				    Reporter.log("PASS MetricConversion_CheckResults: Result is equal to the formule from Celsius to Faranheit");
				  
			    }
			    else
			    {
			    	Reporter.log("FAIL MetricConversion_CheckResults: Result is not equal to the formule from Celsius to Faranheit");
			    }
				
				
				Thread.sleep(5000);

		  }
		  
		  else if (flow.equalsIgnoreCase("MetersTofeet"))
		  {
			  
			  	String answer;
			  	BF.BF_Convert(SourceToConvert,datavalue, driver);
			    Thread.sleep(5000); 

			    
				answer=GF.GF_Answer(driver);
				
				String [] parts =answer.split("= ");
				String part2 = parts[1];
				
				String [] c =part2.split("\\.");
				String c1 = c[0];
				//System.out.println("The faranheit temperature result is "+ c1);
				
				int result = Integer.parseInt(c1);
				//System.out.println("The data result is "+ result);
				int input = Integer.parseInt(datavalue);
				//System.out.println("The data input is "+ input);
				int checkresult= (int) ( (input/0.3048));
				//System.out.println("The data input is "+ checkresult);

				
				if (result==checkresult)
			    {
				    Reporter.log("PASS MetricConversion_CheckResults: Result is equal to the formule from Meters to Feets");
				  
			    }
			    else
			    {
			    	Reporter.log("FAIL MetricConversion_CheckResults: Result is not equal to the formule from Meters to Feets");
			    }
				
				
				Thread.sleep(5000);
		  }
		  
		  else if (flow.equalsIgnoreCase("OuncesToGrams"))
		  {
			  
			  	String answer;
			  	BF.BF_Convert(SourceToConvert,datavalue, driver);
			    Thread.sleep(5000); 

			    
				answer=GF.GF_Answer(driver);
				
				String [] parts =answer.split("= ");
				String part2 = parts[1];
				
				String [] c =part2.split("\\.");
				String c1 = c[0];
				//System.out.println("The faranheit temperature result is "+ c1);
				
				int result = Integer.parseInt(c1);
				//System.out.println("The data result is "+ result);
				int input = Integer.parseInt(datavalue);
				//System.out.println("The data input is "+ input);
				int checkresult= (int) ( (input/0.035274));
				//System.out.println("The data input is "+ checkresult);

				
				if (result==checkresult)
			    {
				    Reporter.log("PASS MetricConversion_CheckResults: Result is equal to the formule from Grams to Onces");
				  
			    }
			    else
			    {
			    	Reporter.log("FAIL MetricConversion_CheckResults: Result is not equal to the formule from Grams to Onces");
			    }
				
				
				Thread.sleep(5000);
		  }


		  


	}  
 
  
  @BeforeMethod

  @Parameters({"browser","env"})
  public void beforeMethod(String browser,String env)  throws Exception
  {
	 

	  if(browser.equalsIgnoreCase("firefox")) 
	  {
		  driver = new FirefoxDriver();	
		  driver.manage().window().maximize();

	  }
	  
	  else if (browser.equalsIgnoreCase("explorer"))
	  { 
		  System.setProperty("webdriver.ie.driver", "./src/DRIVERS/MicrosoftWebDriver.exe");//IEDriverServer.exe
		  DesiredCapabilities returnCapabilities = DesiredCapabilities.internetExplorer();
		  returnCapabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		  driver = new InternetExplorerDriver(returnCapabilities);


	  }

	  else if (browser.equalsIgnoreCase("chrome"))
	  { 



		System.setProperty("webdriver.chrome.driver", "./src/DRIVERS/chromedriver.exe");
	    
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--start-maximized");
	    driver = new ChromeDriver(options);
	    
	    

	   
	  }

	  driver.get(env); 
	  

       
  }
  


  @AfterMethod public void AfterMethod() throws Exception {

	  driver.close();
      driver.quit();
 
	}
  

    
} 

 
