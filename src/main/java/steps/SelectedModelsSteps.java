package steps;

import io.qameta.allure.Step;
import pages.MainPage;
import pages.SelectedModelsPage;

public class SelectedModelsSteps {

    @Step("задание минимальной стоимости {0}")
    public  void fillPrice(String value){
        //
        new SelectedModelsPage().fillprice(value);
    }

    @Step("добавление в корзину нечетных элементов")
    public  void addToCart(){
        //
        new SelectedModelsPage().addtocart();
    }

    @Step("переход в корзину")
    public  void GoToCart(){
        //
        new SelectedModelsPage().gotocart();
    }
}
