package reg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg {
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Compressed\\SQA5\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://archive.org/account/signup");
        driver.manage().window().maximize();

        // Sample array of input data
        String[][] inputData = {
                {"email1example.com", "green1", "7"},
                {"email2@example", "green1", "256489"},
                {"x6hridoy@gmail.com", "x6hridoy", "002023"},
                {"x6hridoy@gmail.com", "green1", "256489"},
        };

        for (String[] data : inputData) {
            performRegistration(driver, data);
        }

        driver.quit();
    }

    private static void performRegistration(WebDriver driver, String[] data) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[1]/input")).sendKeys(data[0]);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[2]/input")).sendKeys(data[1]);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[3]/div/input")).sendKeys(data[2]);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/button")).click();
        Thread.sleep(3000);

        // Capture the current URL after registration
        String actual = driver.getCurrentUrl();

        // Compare with the expected pattern or a stable part of the URL
        if (actual.contains("https://archive.org/account/signup?status")) {
            System.out.println("Registration Successful for email: " + data[0]);
        } else {
            System.out.println("Registration failed for email: " + data[0]);
        }

        // Clear the input fields for the next iteration
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[3]/div/input")).clear();
    }
}





   