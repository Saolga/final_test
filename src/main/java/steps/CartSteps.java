package steps;

import io.qameta.allure.Step;
import pages.CartPage;


public class CartSteps {

    @Step("проверка совпадений элементов корзины ")
    public  void checkItemsSteps(){
        //
        new CartPage().check();
    }

    @Step("удаление всего из корзины")
    public  void delal(){
        //
        new CartPage().deleteall();
    }
    @Step("проверка, что корзина пуста")
    public  void empty(){
        //
        new CartPage().empty();
    }

}
