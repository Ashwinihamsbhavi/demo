package tesng;

import org.testng.annotations.Test;

public class Fb extends Bm
{
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
	}
	

}
