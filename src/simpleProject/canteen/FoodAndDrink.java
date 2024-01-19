package simpleProject.canteen;

public class FoodAndDrink {
    private String fdName;
    private int fdId;
    private int fdPrice;

    public FoodAndDrink(String fdName, int fdId, int fdPrice) {
        this.fdName = fdName;
        this.fdId = fdId;
        this.fdPrice = fdPrice;
    }

    public String getFdName() {
        return fdName;
    }

    public int getFdId() {
        return fdId;
    }

    public int getFdPrice() {
        return fdPrice;
    }
}
