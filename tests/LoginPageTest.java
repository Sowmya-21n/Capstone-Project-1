package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page1.LoginPage;

public class LoginPageTest extends baseTest {

    @Test
    public void testLoginPage() throws InterruptedException {

        homePage.setAccount();
        Thread.sleep(2000);
        homePage.setSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailAdd("sowmya123@gmail.com");
        loginPage.setPassword("Sowmya12345");
        loginPage.setClickSignIn();
        loginPage.setLoginSkipNow();

        //Validating Assertion
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str, "Best Buy | Official Online Store | Shop Now & Save ");
    }
}
