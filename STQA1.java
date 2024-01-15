package stqa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class STQA1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Compressed\\SQA5\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://archive.org/create/");

        // Click on the element with ID
        WebElement goButton = driver.findElement(By.xpath("//a[normalize-space()='Upload Files']"));
        goButton.click();

        // Wait for the search page to load (you might need to adjust the wait time)
        Thread.sleep(5000);

        // Get the current URL after clicking the button
        String actual = driver.getCurrentUrl();

        // Compare with the expected pattern or a stable part of the URL
        if (actual.contains("https://archive.org/upload/")) {
            System.out.println("Option Checking Successful");
        } else {
            System.out.println("Option Checking Failed");
        }

        // Display a message after clicking the elements
        System.out.println("Elements clicked successfully.");

        // Close the browser
        driver.quit();
    }
}
