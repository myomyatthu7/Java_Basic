package simpleProject.canteen1;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    private String enterMsg = "Enter your code!";
    private String welMsg = "Welcome Sir";
    String [] memberCodes = {"101","102","103","104"};
    private boolean auth = true;
    int iOrder = 0;

    int iBill = 0;
    int [] orderArray = new int[10];
    FoodBeverages []foodBeverages = {
            new FoodBeverages("1. Mohinga",1,2200),
            new FoodBeverages("2. Ohnn Noe Khaut Swel",2,1800),
            new FoodBeverages("3. Nan Gyi Thoke",3,2000),
            new FoodBeverages("4. Laphet Thoke", 4,1500),
            new FoodBeverages("5. Shan Noodle",5,2500),
            new FoodBeverages("6. M-150",6,2500),
            new FoodBeverages("7. Coca Cola",7,2500),
            new FoodBeverages("8. Royal-D",8,2500),
            new FoodBeverages("9. Pepsi",9,2500),
    };


    public static void main(String[] args) {
        Main main = new Main();
        if (main.memberLogin()) {
            boolean selecting = true;
            String selectMsg = "Select Food or Beverage!"+"\n"+"1.Food"+"  \t"+"2.Beverage";
            while (selecting) {
                String selectFoodAndBeverage = main.inputMsg(selectMsg);
                //main.selectFoodAndBeverage(selectFoodAndBeverage,selecting);
                switch (selectFoodAndBeverage) {
                    case "1" ->
                    {
                        main.order(main.showFoodBeverage(0,4));
                        selecting = false;
                    }
                    case "2" ->
                    {
                        main.order(main.showFoodBeverage(5,9));
                        selecting =false;
                    }
                }
            }
        }
    }
    private void showBillBox(String bill,int total) {
        JOptionPane.showMessageDialog(null,bill+" \nTotal is => "+total);
    }

    private FoodBeverages getCurrentFoodBeverage(int id) {
        FoodBeverages strFoodBeverage = null;
        for (int i=0; i < foodBeverages.length;i++) {
            if (foodBeverages[i].getId() == id) {
                strFoodBeverage = foodBeverages[i];
                break;
            }
        }
        return strFoodBeverage;
    }

    private void showBill() {
        String bill = "";
        int total = 0;
        for (int i = 0; i < iBill ;i++) {
            bill += getCurrentFoodBeverage(orderArray[i]).getFoodBeverage()+"   \t  "+getCurrentFoodBeverage(orderArray[i]).getPrice()+"\n";
            total += getCurrentFoodBeverage(orderArray[i]).getPrice();
        }
        showBillBox(bill,total);
    }

    private void order(String orderList){
        boolean ordering = true;
        while (ordering) {
            String order = inputMsg(orderList);
            orderArray[iOrder++] = Integer.parseInt(order);
            iBill++;
            //System.out.println(Arrays.toString(orderArray));
            int orderMoreInt = orderMore("More?");
            switch (orderMoreInt) {
                case 1, 2 -> ordering = false;
            }
        }
        showBill();
    }
    private int orderMore(String orderMore) {
        return JOptionPane.showConfirmDialog(null,orderMore);
    }
    private boolean memberLogin() { // စစ်ဆေးရေး
        while (auth) {
            String code = inputMsg(enterMsg);
            boolean member = Arrays.asList(memberCodes).contains(code);
            auth = !member;
        }
        return true;
    }
    private String inputMsg(String Msg) {
        return JOptionPane.showInputDialog(Msg);
    }
    private String showFoodBeverage(int staFood,int endFood) {
        String foodBeverageData = "";
        for (int i=staFood; i< endFood; i++) {
            foodBeverageData += foodBeverages[i].getFoodBeverage()+"\t  |   \t"+foodBeverages[i].getPrice()+"\n";
        }
        return  foodBeverageData;
    }
}
