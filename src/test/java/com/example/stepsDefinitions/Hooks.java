package com.example.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.example.utils.Utils.*;

import com.example.pageObjects.LoginPage;

public class Hooks {

  @Before("@CadastrarUsuario or @TestarActions")
  public void setup() {
    acessarSistema();
    Na(LoginPage.class).realizarLogin("admin", "admin123");
  }

  @Before(value = "@login")
  public void funcionalidadeLogin() {
    acessarSistema();
  }

  @After
  public void tearDown() {
    //driver.quit();
  }
}