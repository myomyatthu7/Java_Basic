package Class;

import java.util.Objects;

public class Object_ {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.cost = 1500;
        //System.out.println(obj1.brand+" : "+obj1.cost);

        Phone obj2 = new Phone();
        obj2.brand = "Apple";
        obj2.cost = 1500;
        //System.out.println(obj2.brand+" : "+obj2.cost);


        System.out.println(obj1); // default add toString();
        System.out.println(obj2.toString());
        System.out.println(obj1.equals(obj2));
    }
}
class Phone extends Object {
    String brand;
    int cost;

//    // manual overriding
//    public String toString() {
//        return brand + " : " + cost;
//    }
//    public boolean equals(Phone that) {
//        return this.brand.equals(that.brand) && this.cost == that.cost;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;

        if (cost != phone.cost) return false;
        return brand.equals(phone.brand);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
