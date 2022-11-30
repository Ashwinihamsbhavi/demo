package tesng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() {
	  Reporter.log("hello",true);
  }
  public void test2()
  {
	  Reporter.log("hi",true);
  }
}
