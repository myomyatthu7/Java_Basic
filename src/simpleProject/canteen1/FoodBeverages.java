package simpleProject.canteen1;

public class FoodBeverages {
    private final String FoodBeverage;
    private int id;
    private int price;

    public FoodBeverages(String foodBeverage, int id, int price) {
        FoodBeverage = foodBeverage;
        this.id = id;
        this.price = price;
    }

    public String getFoodBeverage() {
        return FoodBeverage;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

//    public String showFood() {
//        String foodData = "";
//        String [] foodArray = {getFoodBeverage()};
//        for (int i =0; i < getFoodBeverage().length(); i++) {
//            foodData += foodArray[i] +"\n";
//        }
//        return foodData;
//    }
}
