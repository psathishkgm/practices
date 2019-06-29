package Testng_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
	
@BeforeGroups(groups= {"boding","sathish"})

public void beforegroups() {
	System.out.println("Before Group");
}

@AfterGroups 

public void aftergroups() {
	System.out.println("After Group");
}

@BeforeClass

public void before_class() {
	System.out.println("Before class");
}

@BeforeClass

public void before_class1() {
	System.out.println("Before class1");
	
}


@BeforeSuite

public void beforesuite() {
	System.out.println("Before suite");
}

@BeforeSuite

public void beforesuite1() {
	System.out.println("Before suite1");
}

@BeforeMethod

public void setup() {
	System.out.println("Before method");
}

@Test(priority=-1,groups= {"boding","sathish"})

public void test1() {
	System.out.println("Test1");
}

@Test(dependsOnMethods= {"test3"}, priority=2)

public void test2() {
	System.out.println("Test2");
}

@Test (priority=1)

public void test3() {
	System.out.println("Test3");
}

@Test(priority=0)

public void test4() {
	System.out.println("Test4");
}
@Test(priority=-2)

public void test5() {
	System.out.println("Test5");
}

@AfterClass

public void after_class() {
	System.out.println("After class");
}

@AfterMethod

public void teardown() {
	System.out.println("After method");
}

@AfterSuite

public void aftersuite() {
	System.out.println("After suite");
}
}
