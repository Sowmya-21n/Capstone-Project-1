package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

    public class DepartmentPageTest extends baseTest {

        @Test(priority = 2)
        public void departmentTest() throws InterruptedException {

            List<WebElement> btn = departmentPage.getKitchenAllMenu();
            for (WebElement btnLink : btn){
                btnLink.click();
                Thread.sleep(2000);
            }

            List<WebElement> btn1 = departmentPage.getAppliances();
            for (WebElement btnLink1 : btn1){
                btnLink1.click();
                Thread.sleep(2000);
            }

            departmentPage.setKitchenAppliances();
            departmentPage.setSmallKitchenAppliances();

            Thread.sleep(2000);
            //Scrolling to the item
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);");
            List<WebElement> btn3 = departmentPage.setKitchenAppliancesCart();
            for (WebElement btnLink3 :btn3) {
                btnLink3.click();
                Thread.sleep(2000);
            }
            departmentPage.setKitchenGoToCart();

            //Using Assertion
            WebElement we = driver.findElement(By.xpath("//a[@id='cart-4i97ebofufxm7-4mwumh2h1vmrl']"));
            we.getText();
            System.out.println("Recently added item is: "+ we);
            Assert.assertEquals(we,"Bella Pro Series - 12-Cup Programmable Coffee Maker - Stainless Steel");
        }
    }