package com.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

  @FindBy(name = "txtUsername")
  private WebElement campoUsuario;

  @FindBy(name = "txtPassword")
  private WebElement campoSenha;

  @FindBy(name = "Submit")
  private WebElement botaoLogin;

  /* 
  Exemplos de mapeamento de elementos

  @FindBy(linkText = "Forgot your password?")
  private WebElement link;

  @FindBy(css = "#txtUsername")
  private WebElement campoUsuario2;

  @FindBy(xpath = "//span[@style]")
  private WebElement span; */

  public void informarCampoUsuario(String usuario) {
    campoUsuario.sendKeys(usuario);
  }

  public void informarCampoSenha(String senha) {
    campoSenha.sendKeys(senha);
  }

  public void acionarBotaoLogin() {
    botaoLogin.click();
  }
}