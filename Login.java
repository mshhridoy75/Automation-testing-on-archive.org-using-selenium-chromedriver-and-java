
package login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Compressed\\SQA5\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://archive.org/account/login");
        driver.manage().window().maximize();

        // Sample array of login data
        String[][] loginData = {
            {"mshhridoy10@gmail.com", "251002"},
            {"i.j.susmita@gmail.com", "12345"},
            {"mshhridoy10@gmail.com", "201002"},
            {"mshhridoy10@gmail.com", "201002"}// Add more sets of data as needed                                         
        };

        for (String[] data : loginData) {
            performLogin(driver, data);
        }

        driver.quit();
    }

    private static void performLogin(WebDriver driver, String[] data) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[1]/input")).sendKeys(data[0]);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[2]/div/input")).sendKeys(data[1]);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/input[3]")).click();
        Thread.sleep(3000);

        // Capture the current URL after login
        String actual = driver.getCurrentUrl();

        // Compare with the expected pattern or a stable part of the URL
        if (actual.equals("https://archive.org/")) {
            System.out.println("Login Successful for user: " + data[0]);
        } else {
            System.out.println("Login failed for user: " + data[0]);
        }

        // Clear the input fields for the next iteration
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[3]/form/label[2]/div/input")).clear();
    }
}

