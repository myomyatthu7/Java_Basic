package simpleProject.restaurant;

public class FoodAndDrink {

    private String nameFAndD;
    private int id;
    private int price;

    public FoodAndDrink(String nameFAndD,int id,int price) {
        this.nameFAndD = nameFAndD;
        this.id = id;
        this.price = price;
    }
    public String getNameFAndD() {
        return nameFAndD;
    }
    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
}
