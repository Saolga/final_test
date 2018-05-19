package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubMenuPage extends BasePage{

    @FindBy(xpath = "//a[contains(@class,'eLeftMainMenu_Title')]")
    List<WebElement> subMenu;

    public void selectsubmenu(String name){ //Телефоны
        selectCollectionItem(name,subMenu);
    }

    public void selecthz(String name){
        WebElement w=driver.findElement(By.xpath("//div[@class='eLeftMainMenu_ElementsBlock']/a[contains(text(),'"+name+"')]"));
        w.click();
    }

}
