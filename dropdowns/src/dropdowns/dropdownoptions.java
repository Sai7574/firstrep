package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdownoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercurytravels.co.in/");
       // Select select=new Select(driver;)
        WebElement e = driver.findElement(By.id("themes"));
       WebElement e1=driver.findElement(By.id("duration_d"));
        Select select=new Select(e);
        List<WebElement> options = select.getOptions();
        for(WebElement option:options) {
        	System.out.println(option.getText());
        }
       driver.quit();
       
        

	}

}
