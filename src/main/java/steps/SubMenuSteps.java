package steps;

import io.qameta.allure.Step;
import pages.SubMenuPage;

public class SubMenuSteps {

    @Step("выбор {0} в подменю")
    public  void selectSubMenu(String name){
        //
        new SubMenuPage().selectsubmenu(name);
    }

    @Step("выбор {0} в подменю")
    public  void selectSubMenuHZ(String name){
        //
        new SubMenuPage().selecthz(name);
    }
}
