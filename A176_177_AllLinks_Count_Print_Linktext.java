/*WAP to count the links & print all the links*/
/*WAP to print all the links's linktext*/
package popup.screenshot.autosugg;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class A176_177_AllLinks_Count_Print_Linktext {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));//all links with tagname <a>
		int count=links.size();
		System.out.println(count); //links count
	    
		for(int i=0;i<count;i++)
		{
		WebElement e4=links.get(i);  //get index of links
		System.out.println(e4.getText()); //links linktext
		System.out.println(e4.getAttribute("href")); //printing all links 
		}
	}

}
