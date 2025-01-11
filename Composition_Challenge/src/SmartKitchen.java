public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen(Refrigerator iceBox, DishWasher dishWasher, CoffeeMaker brewMaster) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.brewMaster = brewMaster;
    }

    private void addWater(){
        System.out.println("Brew Master on... adding some water...");
        brewMaster.setHasWorkToDo(true);
    }

    private void pourMilk(){
        System.out.println("Loading the icebox program... pouring the milk");
        iceBox.setHasWorkToDo(true);
    }

    private void loadDishwasher(){
        System.out.println("Dishwasher on");
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean iceBoxWork, boolean brewMasterWork, boolean dishwasherWork){

       if(iceBoxWork){
           pourMilk();
        //   iceBox.orderFood();
       }

       if(brewMasterWork){
           addWater();
        //   brewMaster.brewCoffee();
       }

       if(dishwasherWork){
           loadDishwasher();
        //   dishWasher.doDishes();
       }
    }

    //correction
    public void doKitchenWork(){
        iceBox.orderFood();
        brewMaster.brewCoffee();
        dishWasher.doDishes();
    }


    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordered the food");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Doing dishes...");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing some coffee...\n" +
                    "The coffee is ready :)");
            hasWorkToDo = false;

        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
