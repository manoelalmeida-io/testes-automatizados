package com.example.pageObjects;

import static com.example.utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BasePage {

  @FindBy(xpath = "//a[b[text()='Admin']]")
  private WebElement abaAdmin;

  @FindBy(xpath = "//a[b[text()='PIM']]")
  private WebElement abaPIM;

  @FindBy(id = "menu_pim_Configuration")
  private WebElement menuConfiguation;

  @FindBy(id = "menu_pim_listCustomFields")
  private WebElement menuCustomField;

  public void acionarAbaAdmin() {
    abaAdmin.click();
  }
  
  public void acessarMenuCustomField() {
    Actions acao = new Actions(driver);
    acao.moveToElement(abaPIM).build().perform();
    acao.moveToElement(menuConfiguation).build().perform();
    acao.moveToElement(menuCustomField).click().build().perform();
  }
}