package com.example.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.example.utils.Utils.*;

public class Hooks {

  @Before()
  public void setup() {
    acessarSistema();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}