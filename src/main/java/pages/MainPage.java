package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath = "//a[contains(@class,'eHeaderCategoryLinks')]")
    List<WebElement> mainMenu;


    public void selectmenu(String name){            //Электроника
        closeAd(mainMenu.get(0));
        selectCollectionItem(name,mainMenu);
    }
}
