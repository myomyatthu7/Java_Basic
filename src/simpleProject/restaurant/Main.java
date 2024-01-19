package simpleProject.restaurant;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    FoodAndDrink [] foodAndDrink = {
            new FoodAndDrink("Mohinga",1,2200),
            new FoodAndDrink("Nan Gyi Thoke",2,2000),
            new FoodAndDrink("Laphet Thoke",3,1500),
            new FoodAndDrink("Shan Noodle",4,2500),
            new FoodAndDrink("Pepsi",5,1000),
            new FoodAndDrink("Coca Cola",6,1000),
            new FoodAndDrink("Royal-D",7,1500),
            new FoodAndDrink("M-150",8,900)
    };
    int [] codeArray = {101,102,103,104};

    int iBill = 0;

    int [] orderArray = new int[10];

    String memberName = "";

    public static void main(String []args ) {
        Main main = new Main();
        boolean check = main.memberLogin();
        while (check) {
            String choose = main.inputMsg("Choose\n1.Food\n2.Drink");
            switch (choose) {
                case "1" -> {
                  main.orderFAndD(main.showFAndD(0,4));
                    check = false;
                }
                case "2" -> {
                    main.orderFAndD(main.showFAndD(4,8));
                    check = false;
                }
            }
        }

    }
    private FoodAndDrink getFAndD(int id) {
        FoodAndDrink foodAndDrinks = null;
        for (FoodAndDrink fAndD : foodAndDrink) {
            if (fAndD.getId() == id) {
                foodAndDrinks = fAndD;
            }
        }
//            for (int i = 0; i< foodAndDrink.length;i++) {
//                if (foodAndDrink[i].getId() == id) {
//                    foodAndDrinks = foodAndDrink[i];
//                }
        return foodAndDrinks;
    }

    private void showBillBox(String bill,int total) {
        showMessage(bill+"\nTotal is => "+total+"\n"+"Dear "+memberName+", Thanks for your orders ❤");
    }
    private void showBill() {
        String bills = "";
        int total = 0;
        for (int i= 0; i< iBill;i++) {
            bills += getFAndD(orderArray[i]).getNameFAndD()+"|   "+getFAndD(orderArray[i]).getPrice();
            total += getFAndD(orderArray[i]).getPrice();
        }
        showBillBox(bills,total);
    }

    private int orderMore() {
        return JOptionPane.showConfirmDialog(null, "Would you order again?");
    }
    private void orderFAndD(String order) {
        boolean ordering = true;
        int orderCount = 0;
        while (ordering) {
            int orders = Integer.parseInt(inputMsg(order));
            orderArray[orderCount++] = orders;
            iBill++;
            System.out.println(Arrays.toString(orderArray));
            int more = orderMore();
            switch (more) {
                case 1,2 -> ordering = false;
            }
        }
        showBill();
    }
    private String showFAndD(int start,int end) {
        //String fAndD = "";
        StringBuilder fAndD = new StringBuilder();
        for (int i = start;i<end;i++) {
            fAndD.append(foodAndDrink[i].getId()).append("-").append(foodAndDrink[i].getNameFAndD()).append("\t             |   \t").append(foodAndDrink[i].getPrice()).append("\n");
            //fAndD += foodAndDrink[i].getId()+"-"+foodAndDrink[i].getNameFAndD()+"\t             |   \t"+foodAndDrink[i].getPrice()+"\n";
        }
        return fAndD.toString();
        //return fAndD;
    }
    private void showMessage(String Msg) {
        JOptionPane.showMessageDialog(null,Msg);
    }
    private boolean memberLogin() {
        boolean auth = true;
        while (auth) {
            int code = Integer.parseInt(JOptionPane.showInputDialog("Enter your code!"));
            if (Arrays.toString(codeArray).contains(Integer.toString(code))) {
                switch (code) {
                    case 101 -> {
                        memberName = "Mg Mg";
                        showMessage("Mingalarpar "+memberName);
                        auth = false;
                    }
                    case 102 -> {
                        memberName = "Kyaw Kyaw";
                        showMessage("Mingalarpar "+memberName);
                        auth = false;
                    }
                    case 103 -> {
                        memberName = "Su Su";
                        showMessage("Mingalarpar "+memberName);
                        auth = false;
                    }
                    case 104 -> {
                        memberName = "Nu Nu";
                        showMessage("Mingalarpar "+memberName);
                        auth = false;
                    }
                }
            }
        }
        return true;
    }
    private String inputMsg(String Msg) {
        return JOptionPane.showInputDialog(Msg);
    }
}
