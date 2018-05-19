package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemMenuPage extends BasePage{
    @FindBy(xpath = "//span[contains(@class,'eFilterList_OptionLink')]")
    List<WebElement> modelNameMenu;

    @FindBy(xpath = "//a[contains(@class,'eFilterList_OptionLink')]")
    List<WebElement> modelNameFoto;


    public void selectmodel(String name){            //Apple
        selectCollectionItemByPartText(name,modelNameMenu);
    }


    public void selectmodelf(String name){            //canon
        selectCollectionItemByPartText(name,modelNameFoto);
        waitVisibilityOf(modelNameFoto.get(0),15);
    }

}
