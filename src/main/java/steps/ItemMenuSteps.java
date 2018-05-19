package steps;

import io.qameta.allure.Step;
import pages.ItemMenuPage;


public class ItemMenuSteps {

    @Step("выбор {0} в подменю")
    public  void selectModel(String name){
        //apple
        new ItemMenuPage().selectmodel(name);
    }

    @Step("выбор {0} в подменю")
    public  void selectModelF(String name){
        //apple
        new ItemMenuPage().selectmodelf(name);
    }
}
