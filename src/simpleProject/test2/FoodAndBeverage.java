package simpleProject.test2;

public class FoodAndBeverage {
    private final String fbName;
    private final int fbId;
    private final int fbPrice;

    public FoodAndBeverage(String fbName, int fbId, int fbPrice) {
        this.fbName = fbName;
        this.fbId = fbId;
        this.fbPrice = fbPrice;
    }

    public String getFbName() {
        return fbName;
    }

    public int getFbId() {
        return fbId;
    }

    public int getFbPrice() {
        return fbPrice;
    }
}
