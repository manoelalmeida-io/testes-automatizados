package com.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {

  @FindBy(name = "btnAdd")
  private WebElement botaoAdd;

  public void acionarBotaoAdd() {
    botaoAdd.click();
  }
}