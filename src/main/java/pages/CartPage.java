package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static steps.BaseSteps.*;


public class CartPage extends BasePage {
    @FindBy(xpath = "//span[@class='eCartItem_nameValue']")
    List<WebElement> items;

    @FindBy(xpath = "//div[text()='Удалить всё']/parent::div")
    WebElement deleteAll;
    @FindBy(xpath = "//span[contains(text(),'пуста')]")
    WebElement cartEmpty;

    @FindBy(xpath = "//div[@class='eCartControls_infoDate']")
    WebElement minih;


    public void check(){
        System.out.println("items begin--------------------------------------------------------------");
        for(WebElement w: items)
            System.out.println(w.getText()+"  "+w.getText().length());
        System.out.println("items end--------------------------------------------------------------");
        System.out.println("set begin--------------------------------------------------------------");
        pr();
        System.out.println("set end--------------------------------------------------------------");
        waitVisibilityOf(minih,30);
        if(!checkItems(items))
              Assert.fail("несовпадение элементов в корзине и добавленных в неё!");
    }

    public void deleteall(){
        waitVisibilityOf(deleteAll,15);
        deleteAll.click();
    }

    public void empty(){
        waitVisibilityOf(cartEmpty,30);
        clearName();

    }



}
