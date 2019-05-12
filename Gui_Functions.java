package Ben;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Ben.Objects_Functions;
import Ben.Business_Functions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.apache.poi.ss.usermodel.Cell;
import org.ini4j.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class Gui_Functions 
{
	WebDriver driver;
	
	//MultiBrowser MB ;
	Objects_Functions OF;
	Gui_Functions GF;
	//Utils UT;
	Business_Functions BF;
	
	
	public Gui_Functions(WebDriver drive)
	{
		drive=driver;
		
	}
	
	
	
	
	public   void GF_QueryField (String SourceToConvert, WebDriver drive)
	{
		driver=drive;
		OF  = new Objects_Functions(driver);
		OF.OF_getQueryFromField().sendKeys(SourceToConvert);
	}
	
	
	public   void GF_DataField (String datavalue, WebDriver drive)
	{
		driver=drive;
		OF  = new Objects_Functions(driver);
		OF.OF_getFirstSearchField().sendKeys(datavalue);
	}
	
	
	public   void GF_Convert_Click ( WebDriver drive)
	{
		driver=drive;
		OF  = new Objects_Functions(driver);
		OF.OF_getFirstconvertGreenButton().click();
	}
	
	public   String GF_Answer ( WebDriver drive)
	{
		driver=drive;
		String answer;
		OF  = new Objects_Functions(driver);
		answer=OF.OF_getConversionResponse().getText();
		return answer;
	}
	

	

		
		
}	



