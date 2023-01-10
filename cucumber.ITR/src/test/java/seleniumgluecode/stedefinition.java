package seleniumgluecode;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.baseclass;

import com.packa.POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stedefinition extends baseclass{
	// WebDriver d;
	//POM  r = new POM(d);
	 POM r;
	
	@Given("login the page")
	public void login_the_page() throws InterruptedException {
		  setproperty();
		  r = new POM(d);
		  get();
		  wait(2000);
		  clk(r.getClick());
		  wait(2000);
		  clk(r.getSignin());
		  wait(2000);
	}
	

	@When("click on module and work on it")
	public void click_on_module_and_work_on_it() throws InterruptedException {
		clk(r.getRadio());
		  wait(2000);
		  clk(r.getGenbill());
		  wait(2000);
		  windowhandle();
		  wait(2000);
		  clk(r.getNewpat());
		  wait(2000);
		  windowhandles();
		  wait(2000);
		  send(r.getName(),"gotrom");
		  wait(2000);
		 /* send(r.getGaurdname(),"suman");
		  wait(2000);
		  DropDown(r.getGender(),"Index","1");
		  wait(2000);
		  // date
		  DropDown(r.getBldgrp(),"Index","3");
		  wait(2000);
		  DropDown(r.getMarstatus(),"Index","1");
		  wait(2000);
		  send(r.getFile(),"C:\\Users\\GODWIN\\Documents\\godwin_photo.jpg");
		  wait(2000);
		  send(r.getPhone(),"8839489768");
		  wait(2000);
		  send(r.getMail(),"kirko@gmail.com");
		  wait(2000);
		  send(r.getAddress(),"5/112,Andarvilai");
		  wait(2000);
		 send(r.getRemarks(),"no");
		 wait(2000);
		 send(r.getAkwnallergy(),"yes");
		 wait(2000);
		 send(r.getID(),"456");
		 wait(2000);
		 send(r.getValidity(),"25");
		 //clk(r.getValidity());
		 //clk(r.getValiddate()); 
		 wait(2000);
		 send(r.getIdentnum(),"7865");
		 wait(2000);
		 send(r.getAltnum(),"7686975436");
		 wait(2000);
		 clk(r.getSave());
		 wait(2000);*/
		 
	}

	@Then("module succesfully working")
	public void module_succesfully_working() {
		  String sp = "https://demo.smart-hospital.in/admin/admin/dashboard";
			d.navigate().to(sp);
		    
	}
}
	