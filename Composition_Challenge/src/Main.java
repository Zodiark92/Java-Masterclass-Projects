public class Main {

    public static void main(String[] args) {

        Refrigerator iceBoxS = new Refrigerator();
        CoffeeMaker brewMasterGold = new CoffeeMaker();
        DishWasher dishWasherSuper = new DishWasher();

        SmartKitchen superSmartKitchen = new SmartKitchen(iceBoxS, dishWasherSuper, brewMasterGold);

//        superSmartKitchen.pourMilk();
//        superSmartKitchen.addWater();
//        superSmartKitchen.loadDishwasher();
//
//        superSmartKitchen.getBrewMaster().brewCoffee();
//        superSmartKitchen.getDishWasher().doDishes();
//        superSmartKitchen.getIceBox().orderFood();

        superSmartKitchen.setKitchenState(false, false, true);
        superSmartKitchen.doKitchenWork();

    }
}
