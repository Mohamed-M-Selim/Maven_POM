package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    //driver
    private WebDriver driver;

    //Constructor
    public LoginPage (WebDriver driver){this.driver =driver ;}


    //Elements
    /*WebElement loginPageButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    WebElement loginEmailTextField = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
    WebElement loginPasswordTextField = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
    WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));*/
    private By loginPageButton = By.xpath("//a[@href=\"/login\"]");
    private By loginEmailTextField = By.xpath("//input[@data-qa=\"login-email\"]");
    private By loginPasswordTextField = By.xpath("//input[@data-qa=\"login-password\"]");
    private By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");


    //Methods
    public void navigateToURL(String URL){
        driver.get(URL);
    }

    public void clickOnLoginPageButton (){
        driver.findElement(loginPageButton).click();
    }

    public void fillEmail (String email){
        driver.findElement(loginEmailTextField).sendKeys(email);
    }

    public void fillPassword (String password){
        driver.findElement(loginPasswordTextField).sendKeys(password);
    }

    public void fillLoginData (String email,String password){
        fillEmail(email);
        fillPassword(password);
    }

    public void clickLoginButton (){
        driver.findElement(loginButton).click();
    }


}
