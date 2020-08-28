package practico12;

import org.testng.annotations.*;

public class notaciones {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public  void init(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("Before Method");
    }

    @Test
    public void test1(){
        System.out.println("Ejecutando el test 1");
    }
    @Test
    public void test2(){
        System.out.println("Ejecutando el test 2");
    }
    @Test
    public void test3(){
        System.out.println("Ejecutando el test 3");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("After Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

}



















