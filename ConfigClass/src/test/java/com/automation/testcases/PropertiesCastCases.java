package com.automation.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.PagesClass;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.Helper;

public class PropertiesCastCases {
	BrowserFactory bf;
	WebDriver driver;
	ConfigDataProvider cc;
	@Test
public void runTest() throws IOException
{
	cc=	new ConfigDataProvider();
		 bf=new BrowserFactory();
		// hh=new Helper();
		 bf.startBrowser(driver, cc.getBrowser(),cc.getStageURL());
		 PagesClass ppagesClass=	 PageFactory.initElements(driver, PagesClass.class);
		// ppagesClass.getClass("purushothamvirtusa3322@gmail.com", "888@Hello");
		 ppagesClass.LoginToCRM("purushothamvirtusa3322@gmail.com","888@Hello");
}
}
