package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static runner.RunCucumberTest.driver;

public class Utils {
    public void    esperarElementoEstarPresente(By elemente, int tempo){
        WebDriverWait wait = new WebDriverWait(driver,tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemente));

    }
}
