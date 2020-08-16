package br.com.steps;

import static org.junit.Assert.assertTrue;
import java.net.MalformedURLException;


import org.apache.tools.ant.taskdefs.WaitFor;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.screens.Cadastro_Screen;
import io.appium.java_client.*;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;




public class Cadastro_Steps {

@Dado("^que eu esteja no aplicativo$") 
public void telaprincipalAberta() throws MalformedURLException{
	 
	Cadastro_Screen Cadastro = new Cadastro_Screen();
	Cadastro.telaPrincipalAberta();
	
	
}

@Quando("^preencho os campos$") 
public void preenchoCampos() throws MalformedURLException{
	
	
	Cadastro_Screen Cadastro = new Cadastro_Screen();
	Cadastro.preenchercampos();
	
}

@Entao("^o cadastro e realizado com sucesso$")
public void validoLogin() throws MalformedURLException{
	
	
	
	
}
    



}
