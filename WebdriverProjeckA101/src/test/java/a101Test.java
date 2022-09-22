import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.Thread;


public class a101Test {
    static WebDriver driver;

    @BeforeClass
    public static void openUrl() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriverpath\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
    }

    @Test
    public void a101Test() throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement element;
        String text;
        click("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");

        actions.moveToElement(driver.findElement(By.xpath("//*[@title='GİYİM & AKSESUAR']")));

        click("//*[@title='Dizaltı Çorap']");
        checkBox("SİYAH");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='selected-filters-item']")));
        text = element.getText();
        Assert.assertEquals("SİYAH", text);

        sepeteEkle(1, 1);

        click("(//*[@title='Sepeti Görüntüle'])[2]");
        click("(//*[@title='Sepeti Onayla'])[2]");
        click("//*[@title='ÜYE OLMADAN DEVAM ET']");
        click("(//*[@type='submit'])[4]");


    }


    public void sepeteEkle(int urun, int adet) {

        click("(//*[@class='icon-traingle'])[" + urun + "]");
        click("(//*[@data-quantity='" + adet + "'])[1]");
        click("//*[text()='Sepete Ekle\n" +
                "                  ']");
    }

    @AfterClass
    public static void closeUrl() {

        driver.close();
    }


    public void click(String path) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
        element.click();

    }

    public void checkBox(String text) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='checkbox']//*[text()='" + text + "']")));
        element.click();

    }
}
