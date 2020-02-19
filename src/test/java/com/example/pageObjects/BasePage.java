package com.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

  @FindBy(xpath = "//a[b[text()='Admin']]")
  private WebElement abaAdmin;

  public void acionarAbaAdmin() {
    abaAdmin.click();
  }
}