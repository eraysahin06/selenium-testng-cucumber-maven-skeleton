package com.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseClass{
    public static void navigateToLoginPage(){
        driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");
    }

}