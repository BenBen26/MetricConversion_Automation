package Ben;
import Ben.Objects_Functions;
import Ben.Gui_Functions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
/*import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;*/
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.search.SubjectTerm;


public class Business_Functions {
	
	WebDriver driver;
	
	public Business_Functions(WebDriver drive)
	{
		driver=drive;	
	}
	
	//MultiBrowser MB ;
	Objects_Functions OF;
	Gui_Functions GF;
	//Utils UT;
	Business_Functions BF;
	
	
	
	public   void BF_Convert(String SourceToConvert,String datavalue, WebDriver drive) throws InterruptedException
	{
		driver=drive;

		GF  = new Gui_Functions(driver);
		GF.GF_QueryField (SourceToConvert,driver);
		Thread.sleep(5000);
		GF.GF_DataField (datavalue,driver);
		Thread.sleep(5000);
		GF.GF_Convert_Click(driver);
		Thread.sleep(5000);

	}
	

}
