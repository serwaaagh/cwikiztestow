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
    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
            nameInput.sendKeys("Tester");
        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
            emailInput.sendKeys("tester@test.com");
            Thread.sleep(2000);
        WebElement emailMeButton = driver.findElementByName("et_builder_submit_button");
        emailMeButton.click();
            Thread.sleep(2000);
        WebElement thanksText = driver.findElementByXPath("//div[@class='et-pb-contact-message']/p");
            Assertions.assertEquals("Thanks for contacting us", thanksText.getText());
    }
}
