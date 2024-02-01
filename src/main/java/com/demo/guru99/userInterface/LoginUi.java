package com.demo.guru99.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {
    private static final Target BTN_LOGIN = Target.the("").located(By.xpath("//a[@href='login.php']"));

}
