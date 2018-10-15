package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class Scriptless {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		for (int i=1;i<=3 ;i++) {
			String k1= Utility.getXLData("./input/Data.xlsx", "keys",i, 0);
			String k2= Utility.getXLData("./input/Data.xlsx", "keys",i, 1);
			String k3= Utility.getXLData("./input/Data.xlsx", "keys",i, 2);
			
			System.out.println("K1:"+k1);
			System.out.println("K2:"+k2);
			System.out.println("K3:"+k3);
			
			String xpath = Utility.getPropertyValue("./input/elements.properties", k2);
			if(k1.equals("enter")) {
				driver.findElement(By.xpath(xpath)).sendKeys(k3);
			}
			else if(k1.equals("click")){
				driver.findElement(By.xpath(xpath)).click();
			}
			else{
				System.out.println("Invalid K1");
			}
		}
		
		driver.close();

	}

}
