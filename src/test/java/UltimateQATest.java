import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup{
    @Test
    public void testone(){
        driver.findElementById( "idExample").click();
        WebElement ButtonSuccess = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", ButtonSuccess.getText());
    }
}
