package com.example.stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static com.example.utils.Utils.*;

import com.example.pageObjects.LoginPage;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

  LoginPage loginPage = new LoginPage();

  @Quando("eu informar o usuario {string}")
  public void euInformarOUsuario(String usuario) {
      loginPage.informarCampoUsuario(usuario);
  }

  @Quando("informar a senha {string}")
  public void informarASenha(String senha) {
      loginPage.informarCampoSenha(senha);
  }

  @Quando("clicar no botao login")
  public void clicarNoBotaoLogin() {
      loginPage.acionarBotaoLogin();
  }

  @Entao("o sistema exibe a mensagem de usuario invalido")
  public void oSistemaExibeAMensagemDeUsuarioInvalido() {
      assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
  }

  @Entao("o sistema exibe o usuario logado")
  public void oSistemaExibeOUsuarioLogado() {
      assertEquals("Welcome Admin", driver.findElement(By.id("welcome")).getText());
  }
}