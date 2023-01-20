import java.util.Scanner;

public class P5_AcharBhargav_Vismay_App {
    public static void main(String[] args){
        System.out.println("The default weight for cats is " + P5_AcharBhargav_Vismay_Cat.defaultCatWeight);
        P5_AcharBhargav_Vismay_Cat.defaultCatWeight = 0.16;
        System.out.println("The default weight for cats has changed to " + P5_AcharBhargav_Vismay_Cat.defaultCatWeight);
        P5_AcharBhargav_Vismay_Cat tinyTom = new P5_AcharBhargav_Vismay_Cat();
        tinyTom.printDescription();
        P5_AcharBhargav_Vismay_Cat.defaultCatWeight = 0.24;
        System.out.println("The default weight for cats has changed to " + P5_AcharBhargav_Vismay_Cat.defaultCatWeight);
        P5_AcharBhargav_Vismay_Cat garfield = new P5_AcharBhargav_Vismay_Cat("Garfield", 4, 21, true);
        garfield.printDescription();
        P5_AcharBhargav_Vismay_Cat randCat = new P5_AcharBhargav_Vismay_Cat();
        randCat.printDescription();
        randCat.setCatName("Tazfire");
        System.out.println("Changed name to " + randCat.getCatName());
        System.out.println("The cat is a " + randCat.ageDescription());
        double hunger = randCat.getCatHunger();
        System.out.println("Hunger is " + hunger);
        randCat.play();
        randCat.feed(0.2);
        randCat.printDescription();
        randCat.feed(0.35);
        System.out.println("Hunger is " + randCat.getCatHunger());
        randCat.printDescription();
        randCat.growOlder();
        randCat.growOlder();
        System.out.println("The cat is now a " + randCat.ageDescription() + " cat");
        randCat.printDescription();
        for(int i = 0; i < 4; i++){
            randCat.play();
        }
        randCat.growOlder();
        if(randCat.ageDescription().equals("adult")){
            System.out.print("The cat is now an ");    
        } else {
            System.out.print("The cat is now a ");
        }
        System.out.println(randCat.ageDescription() + " cat");
        randCat.printDescription();
        
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do with the cat(feed, play, grow)?");
        String userInput = input.next();
        
        if(userInput.equals("feed")){
            Scanner input2 = new Scanner(System.in);
            System.out.println("How much will you feed the cat?");
            randCat.feed(input2.nextDouble());
            System.out.println("Hunger is " + randCat.getCatHunger());
        } else if(userInput.equals("play")){
            randCat.play();
        } else if(userInput.equals("grow")){
            randCat.growOlder();
            randCat.printDescription();
        } else {
            System.out.println("Invalid command");
        }
    }
}