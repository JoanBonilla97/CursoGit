package com.demo.guru99.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.demo.guru99.stepDefinitions",
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class Runner {
}
