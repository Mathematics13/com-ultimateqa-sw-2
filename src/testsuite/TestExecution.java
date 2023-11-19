package testsuite;

import org.junit.*;

public class TestExecution
{
    @BeforeClass
    public static void bc()
    {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void ac()
    {
        System.out.println("AfterClass");
    }
    @Before
    public  void beforeTest()
    {
        System.out.println("Before Test");
    }
    @After
    public  void afterTest()
    {
        System.out.println("After Test");
    }
    @Test
    public void test1()
    {
        System.out.println("Test 1");
    }
    @Test
    public void test2()
    {
        System.out.println("Test 2");
    }
    @Test
    public void test3()
    {
        System.out.println("Test 3");
    }
}
