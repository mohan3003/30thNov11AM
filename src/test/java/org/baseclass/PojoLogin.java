package org.baseclass;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class PojoLogin extends BaseClass {
	
	public PojoLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement pswrd;
	
	@FindBy(name="login")
	private WebElement btn;
	@CacheLookup
	@FindAll({
	@FindBy(id="email"),
	@FindBy(xpath="//input[@class='inputtext _55r1 _6luy']"),
	@FindBy(name="email"),
	})private WebElement allusername;

	@FindAll({
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@placeholder='Password']"),
	})private WebElement allpswrd;

	@FindAll({
		@FindBy(name="login"),
		@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"),
		@FindBy(xpath="//button[@type='submit']"),
	})private WebElement btnclick ;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPswrd() {
		return pswrd;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getAllusername() {
		return allusername;
	}

	public WebElement getAllpswrd() {
		return allpswrd;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}


	







}
