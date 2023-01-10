package com.packa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	public static WebDriver d;
	public POM(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[2]")
	private WebElement click;
	public WebElement getClick() {
		return click;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signin;
	public WebElement getSignin() {
		return signin;
	}
	@FindBy(xpath="//*[@id=\"sibe-box\"]/ul[2]/li[8]/a/span")
	private WebElement radio;
	public WebElement getRadio() {
		return radio;
	}
	@FindBy(xpath="//button[@id='load1']")
	private WebElement Genbill;
	public WebElement getGenbill() {
		return Genbill;
	}
	@FindBy(xpath="//*[@id=\"add\"]/span")
	private WebElement newpat;
	public WebElement getNewpat() {
		return newpat;
	}
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	@FindBy(xpath="//input[@name='guardian_name']")
	private WebElement gaurdname;
	public WebElement getGaurdname() {
		return gaurdname;
	}
	@FindBy(xpath="//select[@id='addformgender']")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}
	//date
	@FindBy(xpath="//select[@name='blood_group']")
	private WebElement bldgrp;
	public WebElement getBldgrp() {
		return bldgrp;
	}
	@FindBy(xpath="//select[@name='marital_status']")
	private WebElement Marstatus;
	public WebElement getMarstatus() {
		return Marstatus;
	}
	@FindBy(xpath="//input[@id='file']")
	private WebElement file;
	public WebElement getFile() {
		return file;
	}
	@FindBy(xpath="//input[@id='number']")
	private WebElement phone;
	public WebElement getPhone() {
		return phone;
	}
	@FindBy(xpath="//input[@id='addformemail']")
	private WebElement mail;
	public WebElement getMail() {
		return mail;
	}
	@FindBy(xpath="//input[@name='address']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(xpath="//div[@class='row row-eq']//textarea[@id='note']")
	private WebElement Remarks;
	public WebElement getRemarks() {
		return Remarks;
	}
	@FindBy(xpath="//textarea[@name='known_allergies']")
	private WebElement akwnallergy;
	public WebElement getAkwnallergy() {
		return akwnallergy;
	}
	@FindBy(xpath="//input[@name='insurance_id']")
	private WebElement ID;
	public WebElement getID() {
		return ID;
	}
	
	@FindBy(xpath="//input[@name='validity']")
	private WebElement validity;
	public WebElement getValidity() {
		return validity;
	}
	@FindBy(xpath="//td[@class='new day'][normalize-space()='7']")
	private WebElement validdate;
	public WebElement getValiddate() {
		return validdate;
	}
	@FindBy(xpath="//input[@name='identification_number']")
	private WebElement identnum;
	public WebElement getIdentnum() {
		return identnum;
	}
	@FindBy(xpath="//input[@id='custom_fields[patient][3]']")
	private WebElement altnum;
	public WebElement getAltnum() {
		return altnum;
	}
	@FindBy(xpath="//button[@id='formaddpabtn']//i[@class='fa fa-check-circle']")
	private WebElement save;
	public WebElement getSave() {
		return save;
	}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
}


