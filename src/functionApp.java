public class functionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(5);
        System.out.println("Ten percent off price is " + getTenPercentDiscountPrice(2000));
        System.out.println("30% discount " + getDiscount(400, 30));
        System.out.println("40% discount " + getDiscount(400.0, 40));
        System.out.println( energyEfficiency('e'));
    }

    static void sayHello(){
        System.out.println("Hello!!!");
    }

    static void blackboardPunishment(int repeatNumber){
        for (int i = 1; i < repeatNumber; i++){
            System.out.println("being right sucks");
        }

    }
    static double getTenPercentDiscountPrice(int originalPrice){
        return originalPrice * 0.9;
    }

    static double getDiscount(int price, int discount){
        return price * discount/ 100.0;
    }

    static double getDiscount(double price, int discount){
        return price * discount/ 100;
    }

    static String energyEfficiency(char energyEfficienyCategory){
        if(energyEfficienyCategory == 'A' || energyEfficienyCategory == 'a'){
            return "very low energy consumption";
        }else if(energyEfficienyCategory == 'B' || energyEfficienyCategory == 'b'){
            return "low energy consumption";
        }else if(energyEfficienyCategory == 'C' || energyEfficienyCategory == 'c'){
            return "normal energy consumption";
        }else if(energyEfficienyCategory == 'D' || energyEfficienyCategory == 'd'){
            return "Above normal energy consumption";
        }else if(energyEfficienyCategory == 'E' || energyEfficienyCategory == 'e'){
            return "High energy consumption";
        }else{
            return "category not defined";
        }
    }
}
