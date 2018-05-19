package pages;

import gherkin.lexer.Ca;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static steps.BaseSteps.setname;

public class SelectedModelsPage  extends BasePage{
    @FindBy(xpath = "//div[contains(@class,'eOneTile_title')]")
    List<WebElement> models;

    @FindBy(xpath = "//div[@id='price_filter']//input[contains(@class,'mFrom')]")
    WebElement minprice;
    @FindBy(xpath = "//div[@id='price_filter']//div[@class='bFilterApply']")
    WebElement okBut;

    @FindBy(xpath = "//h1[@class='bItemName']")
    WebElement itemName;
    @FindBy(xpath = "//div[text()='Добавить в корзину']")
    WebElement addCart;

    @FindBy(xpath = "//div[text()='Корзина']")
    WebElement Cart;


    public void fillprice(String value){
        fillField(minprice,value);
        fillField(minprice, Keys.ENTER);
        waitVisibilityOf(okBut,15);
        okBut.click();
        waitVisibilityOf(models.get(0),15);
    }

    public void addtocart(){
        for(int i =0; i<models.size();i+=2){
            if(i>7)         //если в корзине больше 4 товаров, их нельзя удалить кнопкой "удалить все"
                return;
            waitVisibilityOf(models.get(i),15);
            models.get(i).click();
            waitVisibilityOf(itemName,15);
            if(addCart.isDisplayed()) {     //товар может отсутсвовать, и тогда добавить в корзину нельзя
                setname(itemName.getText());
                addCart.click();
            }
            driver.navigate().back();
        }
    }

    public void gotocart(){
        Cart.click();
    }





}
