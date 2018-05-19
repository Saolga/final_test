package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;


import static steps.BaseSteps.getnamesize;
import static steps.BaseSteps.isname;

public class BasePage {
    WebDriver driver = BaseSteps.getDriver();

    @FindBy(xpath = "//div[contains(@class,'close-icon')]")
    public WebElement ad1;


    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public void selectCollectionItem(String name, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(name)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллекции - " + name);
    }
    public void selectCollectionItemByPartText(String name, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().contains(name)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элмент коллекции - " + name);
    }

    //Set хранит только уникальные объекты, значит
    //надо сравнить размеры контейнеров и узнать, есть
    //ли в set такое имя
    public boolean checkItems(List<WebElement> items){
        if (getnamesize()==items.size()){
            for(WebElement w: items){
                if(!isname(w.getText())){
                    System.out.println(w.getText()+"  отсутствует, размер: "+w.getText().length());
                    return false;
                }
            }
            return true;
        }
        else{
            System.out.println("dif size");
            return false;
        }
    }

    public void fillField(WebElement w, String val){
        w.clear();
        w.sendKeys(val);
    }
    public void fillField(WebElement w, Keys a){
        w.sendKeys(a);
    }
    public void waitVisibilityOf(WebElement loc, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(loc));
    }
    public void closeAd(WebElement w){
        if(ad1.isDisplayed()){
            ad1.click();}
       // waitVisibilityOf(w,15);        //Ожидает отображение нужного элемента
    }






}
