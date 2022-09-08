package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsertesting {
    public static void main(String[] args) {

//  webdriver location path
        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");

//  object create for browser

        WebDriver driverch = new ChromeDriver();
        WebDriver driveredg = new EdgeDriver();
        WebDriver driverfire = new FirefoxDriver();

//  navigate location to the website
        driverch.get("https://demo.nopcommerce.com/");
        driveredg.get("https://demo.nopcommerce.com/");
        driverfire.get("https://demo.nopcommerce.com/");

//

        String Title = driverch.getTitle();
        String Title_edg = driveredg.getTitle();
        String Title_fox = driverfire.getTitle();

        System.out.println("Page Title (Chrome):" +Title);
        System.out.println("Page Title (Edge):" +Title_edg);
        System.out.println("Page Title (Firefox):" +Title_fox);


    }

}
