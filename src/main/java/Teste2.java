import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Teste2 {

    //private Enum google;
    private ChromeDriver driver;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://google.com/");

        System.out.println(Enum.COD2.getValue());
    }

    @Test
    public void musicParanoid() {
        WebElement box = driver.findElement(By.xpath("//input[@name='q']"));
        box.sendKeys("Music Paranoid Nintendo Game");
        box.submit();

        int size = driver.findElements(By.xpath("//*[contains(text(), \"Rock N' Roll Racing\")] | //*[contains(text(), \"rock n' roll racing\")] | //*[contains(text(), \"rock n roll racing\")] | //*[contains(text(), \"Rock N Roll Racing\")]")).size();

        System.out.println(size);
        boolean bool = (size >= 10)?true:false;
        System.out.println(bool);
        Assert.assertTrue(bool == true);

        driver.quit();

    }
}
