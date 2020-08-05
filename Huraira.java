package Testsss;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Huraira {

    @Test
    public void signupp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.hackerone.com/resources/wistia-webinars/securing-the-attack-surface";
        driver.get(URL);
        WebElement trigger = driver.findElement(By.xpath("//input[@data-cta-id='271920']"));
        trigger.click();
        sleep(1000);
        WebElement Name = driver.findElement(By.xpath("//input[@data-field-id='632864']"));
        Name.sendKeys("Muhammad");
        sleep(1000);
        WebElement lName = driver.findElement(By.xpath("//input[@data-field-id='632866']"));
        lName.sendKeys("Huraira");
        sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@data-field-id='632862']"));
        email.sendKeys("huraira@gmail.com");
        sleep(1000);
        WebElement company = driver.findElement(By.xpath("//input[@data-field-id='632868']"));
        company.sendKeys("HarryWelfare");
        sleep(1000);
        WebElement watch = driver.findElement(By.xpath("//input[@type='submit']"));
        watch.click();
        sleep(4000);
        String expected = "https://www.hackerone.com/resources/wistia-webinars/securing-the-attack-surface";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Failed");
        sleep(1000);
        driver.quit();
    }


    @Test
    public void signupf() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://www.hackerone.com/resources/wistia-webinars/securing-the-attack-surface";
        driver.get(URL);
        WebElement trigger = driver.findElement(By.xpath("//input[@data-cta-id='271920']"));
        trigger.click();
        sleep(1000);
        WebElement Name = driver.findElement(By.xpath("//input[@data-field-id='632864']"));
        Name.sendKeys("Muhammad");
        sleep(1000);
        WebElement lName = driver.findElement(By.xpath("//input[@data-field-id='632866']"));
        lName.sendKeys("Huraira");
        sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@data-field-id='632862']"));
        email.sendKeys("huraira@gmail.com");
        sleep(1000);
        WebElement company = driver.findElement(By.xpath("//input[@data-field-id='632868']"));
        company.sendKeys("HarryWelfare");
        sleep(1000);
        WebElement watch = driver.findElement(By.xpath("//input[@type='submit']"));
        watch.click();
        sleep(4000);
        String expected = "https://www.hackerone.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Failed");
        sleep(1000);
        driver.quit();
    }

    @Test
    public void loginp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://hackerone.com/users/sign_in";
        driver.get(URL);
        WebElement email = driver.findElement(By.id("sign_in_email"));
        email.sendKeys("huraira@gmail.com");
        sleep(1000);
        WebElement pass = driver.findElement(By.id("sign_in_password"));
        pass.sendKeys("HarryWelfare");
        sleep(1000);
        WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
        signin.click();
        sleep(4000);
        WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert--warning']"));
        alert.click();
        String expected = "Invalid email or password.";
        String actual = alert.getText();
        Assert.assertEquals(actual, expected, "Failed");
        sleep(1000);
        driver.quit();
    }




    @Test
    public void loginf() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String URL = "https://hackerone.com/users/sign_in";
        driver.get(URL);
        WebElement email = driver.findElement(By.id("sign_in_email"));
        email.sendKeys("huraira@gmail.com");
        sleep(1000);
        WebElement pass = driver.findElement(By.id("sign_in_password"));
        pass.sendKeys("HarryWelfare");
        sleep(1000);
        WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
        signin.click();
        sleep(4000);
        String expected = "https://www.hackerone.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Failed");
        sleep(1000);
        driver.quit();
    }




    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}