
public class Loader{
    public static void main(String[] args){
        Integer milkAmount = 9999; // ml
        Integer powderAmount = 999; // g
        Integer eggsCount = 0; // items
        Integer sugarAmount = 999; // g
        Integer oilAmount = 999; // ml
        Integer appleCount = 999;

        Integer numberOfFood = 0;
        System.out.println("What can be cooked?");

        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30 ) {
            //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println(" - Pancakes");
            numberOfFood = numberOfFood + 1;
        }

        if (milkAmount >= 300 && powderAmount >= 4 && eggsCount >= 5) {
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println(" - Omelette");
            numberOfFood = numberOfFood + 1;
        }

        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println(" - Apple pie");
            numberOfFood = numberOfFood + 1;
        }

        if (numberOfFood == 0){
            System.out.println(" - There are not enough products for the saved recipes");
        }else if(numberOfFood > 1) {
            System.out.println(" - You can prepare " + numberOfFood + " dishes");
        }else {
            System.out.println(" - You can prepare 1 dish");
        }

    }
}