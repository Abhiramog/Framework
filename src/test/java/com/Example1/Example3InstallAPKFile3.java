package com.Example1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Example3InstallAPKFile3 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability("appPackage","com.android.Calulator2");
		dc.setCapability("appActivity","com.android.Calulator2.Calulator");

		URL url=new URL("http://127.0.0.1:4723/");
		
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);
		Thread.sleep(2000);
		
		WebElement seven=driver.findElementById("com.android.calulator2:id/digit_7");
		seven.click();
		WebElement add=driver.findElementById("com.android.calulator2:id/digit_add");
		add.click();
		WebElement three=driver.findElementById("com.android.calulator2:id/digit_3");
		three.click();
		WebElement equal=driver.findElementById("com.android.calulator2:id/digit_equ");
		equal.click();
		WebElement result=driver.findElementById("com.android.calulator2:id/digit_formula");
		result.click();
		
		if(result.equals("10"))
		{
			System.out.println("Test Case Pass..");
		}
		else
		{
			System.out.println("Test Case fail..");

		}
		
		
		
		driver.quit();


	}

}
