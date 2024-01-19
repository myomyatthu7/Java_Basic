package simpleProject.canteen;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    String [] arrayCode = {"101","102","103","104"};
    int [] orderArray = new int[10];

    private int iBill = 0;

    FoodAndDrink [] foodAndDrink = {
            new FoodAndDrink("1. Mohinga",1,2200),
            new FoodAndDrink("2. Ohnn Noe Khaut Swel",2,2000),
            new FoodAndDrink("3. Nan Gyi Thoke",3,2100),
            new FoodAndDrink("4. Laphet Thoke",4,1500),
            new FoodAndDrink("5. Shan Noodle",5,2500),
            new FoodAndDrink("6. Pepsi",6,1000),
            new FoodAndDrink("7. Coca Colar",7,1000),
            new FoodAndDrink("8. Royal-D",8,1200),
            new FoodAndDrink("9. M-150",9,900),
    };

    public static void main(String[] args) {
        Main main = new Main();
        boolean auth = main.memberLogin();
        while (auth) {
            String choose = main.chooseForD();
            switch (choose) {
                case "1" -> {
                    main.order(main.showForD(0,4));
                    auth = false;
                }
                case "2" -> {
                    main.order(main.showForD(5,9));
                    auth = false;
                }
                }
        }
    }
    private FoodAndDrink getFoodAndDrink(int id) {
        FoodAndDrink strFoodAndDrink = null;
        for (int i =0; i< foodAndDrink.length; i++) {
            if (foodAndDrink[i].getFdId() == id) {
                strFoodAndDrink = foodAndDrink[i];
            }
        }
        return strFoodAndDrink;
    }
    private void showBillBox(String bill,int total) {
        showMessage(bill+"\nTotal => "+total+"\n* Thanks for your purchase. *");
    }
    private void showMessage(String Msg) {
        JOptionPane.showMessageDialog(null,Msg);
    }
    private void showBill() {
        String bill = "";
        int total = 0;
        for (int i =0; i < iBill; i++) {
            bill += getFoodAndDrink(orderArray[i]).getFdName()+"\t   |   \t"+getFoodAndDrink(orderArray[i]).getFdPrice()+"\n";
            total += getFoodAndDrink(orderArray[i]).getFdPrice();
        }
        showBillBox(bill,total);
    }
    private int moreOrder() {
        return JOptionPane.showConfirmDialog(null, "Would you order again?");
    }
    private void order(String orderList) {
        int iOrder = 0;
        boolean bolOrder = true;
        int more;
        while (bolOrder) {
            String order = inputDialog(orderList);
            orderArray[iOrder++] = Integer.parseInt(order);
            iBill++;
            more = moreOrder();
            switch (more){
                case 1,2 -> bolOrder = false;
            }
        }
        showBill();
    }
    private @NotNull String showForD(int start, int end) {
        StringBuilder show = new StringBuilder();
        for (int i=start;i < end;i++) {
            //show += foodAndDrink[i].getFdName()+"\t  |   \t"+foodAndDrink[i].getFdPrice()+"\n";
            show.append(foodAndDrink[i].getFdName()).append("\t  |   \t").append(foodAndDrink[i].getFdPrice()).append("\n");
        }
        return show.toString();
    }
    private String chooseForD() {
        return inputDialog("Choose\n1.Food\n2.Drink");
    }
    private boolean memberLogin() {
        boolean auth = true;
        while (auth) {
            String code = inputDialog("Enter your code!");
            boolean check = Arrays.asList(arrayCode).contains(code);
            if (check) {
                auth = false;
            }
        }
        return true;
    }
    private String  inputDialog(String Msg) {
        return JOptionPane.showInputDialog(Msg);
    }
}
