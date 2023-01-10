package com.base;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {

	public static WebDriver d; 
    public static void browserlaunch(String name) {
	
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			d = new ChromeDriver();
			d.get("https://demo.smart-hospital.in/site/login");
		}
		if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\gecko driver\\geckodriver.exe");
			d = new FirefoxDriver();
			d.get("vhttps://demo.smart-hospital.in/site/login");
		}
		if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\edge driver\\msedgedriver.exe");
			d = new EdgeDriver();
			d.get("https://demo.smart-hospital.in/site/login");
		}
	}
    
     public static WebDriver setproperty() {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		 d = new ChromeDriver();
		 
		 return d;
	}
    public static WebDriver getdriver() {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		d = new ChromeDriver();
		
		 return d;
    }
    public static WebDriver cls() {
    	d.close();
    	return d;
    }
    //dropdown
    public static void DropDown(WebElement element, String options, String value) {
		Select s=new Select(element);
		if(options.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));//string into Integer
		}else if(options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}else if(options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}	
		}
		

    public static void geturl(String url) {
    	d.get(url);	
    }
    public static void get() {
    	d.get("https://demo.smart-hospital.in/site/login");	
    }
    public static void clk(WebElement element) {
    	element.click();
    }
    public static void send(WebElement element, CharSequence value) {
    	element.sendKeys(value);
    }
    public static void alrt(String method) {
    if(method.equalsIgnoreCase("accept")) {
    	d.switchTo().alert().accept();
    }
    else if(method.equalsIgnoreCase("dismiss")) {
    	d.switchTo().alert().dismiss();
    }
    }
    	//window handle
    	public static  String windowhandle(){
    		String parentwindow1 = d.getWindowHandle();
    		return(parentwindow1);
    	}
    	//window handles
    	public static Set<String> windowhandles(){
    		Set<String> childwindow1 = d.getWindowHandles();
    		return(childwindow1);
    		
    	}
    	
	public static void clr(WebElement element) {
    	element.click();
    }
	
    public static void wait(int w) throws InterruptedException {
    	Thread.sleep(w);
    }
    public static void login(WebElement element) {
    	element.click();
    }
    public static void cusclick(WebElement element) {
    	element.click();
    }
    public static void cusname(WebElement element) {
    	element.click();
    }
    public static void signin(WebElement element) {
    	element.click();
    }

    public static void logout(WebElement element) {
    	element.click();
    }
    public static void quit() {
    	d.quit();
    }
    
}







