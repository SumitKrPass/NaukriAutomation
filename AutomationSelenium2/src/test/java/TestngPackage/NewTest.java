package TestngPackage;

import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = {"smoke", "sanity"})
  public void test1() {
	  System.out.println("test1");
  }
  @Test(groups = {"smoke"})
  public void test2() {
	  System.out.println("test2");
  }
  @Test(groups = {"smoke", "sanity", "functional"})
  public void test3() {
	  System.out.println("test3");
  }
  @Test(groups = {"smoke", "sanity", "system"})
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups = {"smoke", "sanity", "regression"})
  public void test5() {
	  System.out.println("test5");
  }
  
}
