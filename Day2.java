package firstpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");				
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        
        driver.get("http://jsbin.com/osebed/2");
    
        
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        // selectByVisibleText:         
        fruits.selectByVisibleText("Banana");

        //Using isMultiple() method to verify if the element is multi-select,        

        if(fruits.isMultiple())
        {
            System.out.println(true);
        }
        
                
        // selectByIndex
        fruits.selectByIndex(3);
        
        // selectByValue
        fruits.selectByValue("apple");
        
        // deselectAll()
        fruits.deselectAll();
        
        //getOptions count
        List <WebElement> elementCount = fruits.getOptions();
        System.out.println(elementCount.size());
        
        // selectByVisibleText on navigation
        driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");
        
        driver.close();


	}

}
