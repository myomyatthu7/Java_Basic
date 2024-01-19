package simpleProject.test2;


import java.util.Arrays;

public class Canteen {

    JOption jp = new JOption();
    String [] codeArray = {"101","102","103","104"};

    int [] orderArray = new int[10];
    String order = "";

    int iBill = 0;
    FoodAndBeverage [] fb = {
            new FoodAndBeverage("Mohinga",1,2200),
            new FoodAndBeverage("Nan Gyi Thoke",2,2000),
            new FoodAndBeverage("Laphet Thoke",3,1500),
            new FoodAndBeverage("Shan Noodle",4,2500),
            new FoodAndBeverage("Pepsi",5,1000),
            new FoodAndBeverage("Coca Cola",6,1000),
            new FoodAndBeverage("Royal-D",7,1500),
            new FoodAndBeverage("M-150",8,900)
    };

    public static void main(String[] args) {
        Canteen canteen = new Canteen();
        //canteen.memberLogin();
        if (canteen.memberLogin()) canteen.chooseFb();
        System.out.println(Arrays.toString(canteen.orderArray));
    }

    public FoodAndBeverage getFB(int id) {
        FoodAndBeverage fB = null;
        for (int i=0; i<fb.length;i++) {
            if (fb[i].getFbId() == id) {
                fB = fb[i];
            }
        }
        return fB;
    }

    public void showBill(String bill, int total) {
        jp.showMsg(bill+"\n"+total);
    }

    public void bill() {
        String bill = "";
        int total = 0;
        for (int i = 0; i< iBill;i++) {
            bill += getFB(orderArray[i]).getFbName()+"\t    |   \t"+getFB(orderArray[i]).getFbPrice()+"\n";
            total += getFB(orderArray[i]).getFbPrice();
        }
        showBill(bill,total);
    }
    public void chooseFb() {
        boolean choosing = true;
        while (choosing) {
            String choose = chooseFB();
            switch (choose) {
                case "1" -> {
                    order(showFB(0,4));
                    choosing = false;
                }
                case  "2" -> {
                    order(showFB(5,8));
                    choosing = false;
                }
            }
        }
    }

//    public void orderMore() {
//        boolean ordering = true;
//        while (ordering) {
//            int order = jp.confirm("Would you order again?");
//            switch (order) {
//                case 1,2 -> {
//                    System.out.println("End");
//                    ordering = false;
//                }
//            }
//        }
//    }

    public void order (String orderList) {
        int orderCount = 0;
        boolean ordering = true;
        while (ordering) {
            order = jp.showInputMsg(orderList);
            orderArray[orderCount++] = Integer.parseInt(order);
            iBill++;
            int more = jp.confirm("Would you order more?");
            switch (more) {
                case 1,2 -> ordering = false;
            }
        }
        bill();
    }

    public String showFB(int start,int end) {
        String showFb = "";
       for (int i = start;i< end; i++) {
           showFb += fb[i].getFbId()+". "+fb[i].getFbName()+"\t |   \t"+fb[i].getFbPrice()+"\n";
       }
       return showFb;
    }
    public String chooseFB() {
        return jp.showInputMsg("Choose\n 1.Food\n2.Beverage");
    }

    public boolean memberLogin() {
        boolean auth = true;
        while (auth) {
            String code = jp.showInputMsg("Enter your code");
            if (Arrays.asList(codeArray).contains(code)) {
                System.out.println("Success");
                auth = false;
            }
        }
        return true;
    }
}

