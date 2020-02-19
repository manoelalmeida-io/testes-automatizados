package com.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

  @FindBy(name = "systemUser[employeeName][empName]")
  private WebElement campoEmployer;

  @FindBy(name = "systemUser[userName]")
  private WebElement campoUsername;

  @FindBy(name = "systemUser[password]")
  private WebElement campoPassword;

  @FindBy(name = "systemUser[confirmPassword]")
  private WebElement campoConfirmarPassword;

  @FindBy(name = "btnSave")
  private WebElement botaoSalvar;

  public void informarCampoEmployerName(String employerName) {
    campoEmployer.sendKeys(employerName);
  }

  public void informarCampoUsername(String username) {
    campoUsername.sendKeys(username);
  }

  public void informarCampoPassword(String senha) {
    campoPassword.sendKeys(senha);
  }

  public void informarCampoConfirmarPassword(String senha) {
    campoConfirmarPassword.sendKeys(senha);
  }

  public void acionarBotaoSalvar() {
    botaoSalvar.click();
  }
}