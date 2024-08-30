/*WAP to launch flipkart & search shoe & click on 1st option*/
package switchcontrol;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A166_Click1stOption {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		WebElement shoe_1=	driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[1]"));
		shoe_1.click();
	}

}
