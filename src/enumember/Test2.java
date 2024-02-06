package enumember;

public class Test2 {
    public static void main(String[] args) {
        for (Phone p : Phone.values()) {
            System.out.println(p + " : "+p.getPrice());
        }
    }
}
enum Phone{
    Apple(2000),Samsung,Xiaomi(1750),OnePlus(1700),Huawei(1900);

    private int price;
    Phone(int price) {
        this.price = price;
    }

    Phone() {
        price = 1950;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
