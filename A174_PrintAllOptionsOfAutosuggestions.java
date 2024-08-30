/*WAP to Print all options of auto suggestion*/
package popup.screenshot.autosugg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A174_PrintAllOptionsOfAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		
		Thread.sleep(2000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(2000);
		
		for(int i=0;i<e2.size();i++)
		{
		WebElement e3=e2.get(i);
		System.out.println(e3.getText());
		}

	}

}
