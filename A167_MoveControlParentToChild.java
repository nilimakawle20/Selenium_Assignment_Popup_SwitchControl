/*WAP to launch amazon & search shoes then click on any shoes result & then move the control from parent to child window*/
package switchcontrol;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A167_MoveControlParentToChild {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		e1.sendKeys(Keys.ENTER);
		WebElement shoe_3=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]"));
		shoe_3.click();
		
		Set<String> ids=driver.getWindowHandles();//parenchild
		Iterator<String> id=ids.iterator();
		String parentid=id.next(); //parent id
		String childid=id.next();  //1st child id
		Thread.sleep(2000);
		driver.switchTo().window(childid); //move the control from parent to child window
		Thread.sleep(2000);
		driver.close();

	}

}
