package com.example.stepsDefinitions;

import static com.example.utils.Utils.*;
import static org.junit.Assert.assertEquals;

import com.example.pageObjects.TelaInicialPage;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestandoActionSteps {
  
  @Quando("acionar o submenu customField")
  public void acionarOSubmenuCustomField() {
    Na(TelaInicialPage.class).acessarMenuCustomField();
  }
  
  @Entao("o sistema apresenta a tela customField")
  public void oSistemaApresentaATelaCustomField() {
    assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
  }
}