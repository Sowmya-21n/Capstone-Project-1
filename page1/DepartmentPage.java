package page1;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DepartmentPage {
    WebDriver driver;

    public DepartmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Getter
    @FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
    List<WebElement> KitchenAllMenu;

    @Getter
    @FindBy(xpath = "//button[text()='Appliances']")
    List<WebElement> Appliances;

    @FindBy(xpath = "//button[@data-id='node-113']")
    WebElement KitchenAppliances;

    @FindBy(xpath = "//a[text()='Small Kitchen Appliance Deals']")
    WebElement SmallKitchenAppliances;

    @FindBy(xpath = "//button[@data-sku-id='6553385']")
    List<WebElement> KitchenAppliancesCart;

    @FindBy(xpath = "//a[text()='Go to Cart']")
    WebElement KitchenGoToCart;

    public void setKitchenAppliances(){
        KitchenAppliances.click();
    }

    public void setSmallKitchenAppliances(){
        SmallKitchenAppliances.click();
    }

    public List<WebElement> setKitchenAppliancesCart(){
        return KitchenAppliancesCart;
    }

    public void setKitchenGoToCart(){
        KitchenGoToCart.click();
    }
}
