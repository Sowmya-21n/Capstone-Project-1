package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class SignUpPageTest extends baseTest {

        @Test
        public void validatePositiveSignUp() throws InterruptedException {

            //Clicking Account button
            homePage.setAccount();

            Thread.sleep(2000);
            homePage.setCreateAccount();
            //Sending keys to create new account
            signUpPage.setFirstName("Sowmya");
            signUpPage.setLastName("R");
            signUpPage.setEmail("sowmya123@gmail.com");
            signUpPage.setPassword("Sowmya12345");
            signUpPage.setReEnterPassword("Sowmya12345");
            signUpPage.setPhoneNumber("8056176349");
            signUpPage.setRecoverPhoneNum();
            signUpPage.setSubmit();
            signUpPage.setSkipNow();

            //Assertions to validate successful sign-up
            WebElement str = driver.findElement(By.xpath("//div[@class='welcome-wrapper--not-emphasized']"));
            str.getText();
            Assert.assertEquals(str, "Hi, Sowmya. Welcome back.");
        }
    }