package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CartPage;


public class ScenarioSteps {
    MainSteps mainsteps=new MainSteps();
    SubMenuSteps submenusteps = new SubMenuSteps();
    ItemMenuSteps itemmenusteps = new ItemMenuSteps();
    SelectedModelsSteps smsteps  =new SelectedModelsSteps();
    CartSteps cartsteps = new CartSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public  void selectMenu(String name){
        mainsteps.selectMenu(name);
    }
    @When("^выбран подпункт меню \"(.+)\"$")
    public  void selectSubMenu(String name){
        submenusteps.selectSubMenu(name);
    }
    @When("^выбран подпункт подпункта меню \"(.+)\"$")
    public  void selectSubMenuHZ(String name){
        submenusteps.selectSubMenuHZ(name);
    }
    @When("^выбран производитель фото \"(.+)\"$")
    public  void selectModelF(String name){
        itemmenusteps.selectModelF(name);
    }


    @When("^выбран производитель \"(.+)\"$")
    public  void selectModel(String name){
        itemmenusteps.selectModel(name);
    }
    @When("^задание минимальной стоимости \"(.+)\"$")
    public  void fillPrice(String value){
        smsteps.fillPrice(value);
    }

    @Then("^добавление в корзину нечетных элементов")
    public  void addToCart(){ smsteps.addToCart(); }

    @When("^переход в корзину")
    public  void goToCart(){
        smsteps.GoToCart();
    }
    @Then("^проверка совпадений элементов корзины")
    public  void checkItems(){ cartsteps.checkItemsSteps(); }

    @When("^удаление всего из корзины")
    public  void delAll(){
        cartsteps.delal();
    }
    @Then("^проверка, что корзина пуста")
    public  void emptyIs(){ cartsteps.empty(); }

   /* @Then("^итого \"(.+)\"$")
    public void rightResult(String menuName){
        calcsteps.rightResult(menuName);
    }*/



}
