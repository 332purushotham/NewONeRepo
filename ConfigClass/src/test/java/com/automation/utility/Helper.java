package com.automation.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
//public static void CaptureScreen(WebDriver driver) throws IOException
//{
//File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//File dest=new File("./Screenshots/imgg.jpg");
//FileHandler.copy(file, dest);
//}

public static void CaptureScreen(WebDriver driver) throws IOException {
	// TODO Auto-generated method stub
	File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/imgg.jpg");
	FileUtils.copyFile(file, dest);
}
}
