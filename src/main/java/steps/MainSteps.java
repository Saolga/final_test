package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps {

    @Step("выбор {0} в меню")
    public  void selectMenu(String name){
        //
        new MainPage().selectmenu(name);
    }
}
