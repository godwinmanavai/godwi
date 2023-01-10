package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 {
	WebDriver d;
	@When("click on md and work on it")
	public void click_on_md_and_work_on_it() throws InterruptedException {
		d.findElement(By.xpath("//a[@href='https://demo.smart-hospital.in/admin/pathology/gettestreportbatch']")).click();
		Thread.sleep(2000);
		String parentwindow = d.getWindowHandle();
		System.out.println(parentwindow);
		d.findElement(By.xpath("//button[@id='load1']")).click();
		java.util.Set<String> childwindow = d.getWindowHandles();
		for(String handles1 : childwindow) {
	    d.switchTo().window(parentwindow);
	    Thread.sleep(2000);
		String parentwindow1 = d.getWindowHandle();
		System.out.println(parentwindow1);
		}
        d.findElement(By.xpath("//span[normalize-space()='New Patient']")).click();
        java.util.Set<String> childwindow1 = d.getWindowHandles();
		for(String handles11 : childwindow) {
	    d.switchTo().window(parentwindow);
	    Thread.sleep(2000);
	    d.findElement(By.id("name")).sendKeys("mojson");
	    Thread.sleep(2000);
	}
		}
	@Then("mod sucess")
	public void mod_sucess() {
		d.close();
	    
	    
	}

}



