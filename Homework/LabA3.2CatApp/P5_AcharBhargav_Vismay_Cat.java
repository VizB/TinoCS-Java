public class P5_AcharBhargav_Vismay_Cat{
    private String catName;
    private int catAge;
    private double catWeight;
    private boolean isDomesticated;
    private double catHunger;
    public static double defaultCatWeight = 0.24;
    private static final double DEFAULT_HUNGER = 0.25;
    
    public P5_AcharBhargav_Vismay_Cat(){
        catName = "Tom";
        catAge = 0;
        catWeight = defaultCatWeight;
        isDomesticated = false;
        catHunger = DEFAULT_HUNGER;
    }
    
    public P5_AcharBhargav_Vismay_Cat(String name, int age, double weight, boolean domesticate){
        catName = name;
        catAge = age;
        catWeight = weight;
        isDomesticated = domesticate;
        catHunger = DEFAULT_HUNGER;
    }
    
    public String getCatName(){
        return catName;
    }
    
    public void setCatName(String name){
        catName = name;
    }
    
    public int getCatAge(){
        return catAge;
    }
    
    public double getCatWeight(){
        return catWeight;
    }
    
    public boolean getCatDomestication(){
        return isDomesticated;
    }
    
    public double getCatHunger(){
        return catHunger;
    }
    
    public String domesticatedStatus(){
        if(isDomesticated){
            return "domesticated";
        } else {
            return "wild";
        }
    }
    
    public String ageDescription(){
        if(catAge < 2){
            return "kitten";
        } else if(catAge == 2){
            return "juvenile";
        } else if(catAge > 2){
            return "adult";
        }
        return "";
    }
    
    public void printDescription(){
        System.out.print(catName + " is a " + catAge + " year old " + domesticatedStatus() + " " + ageDescription());
        if(ageDescription().equals("adult") || ageDescription().equals("juvenile")){
            System.out.print(" cat");
        }
        System.out.println(" weighing " + catWeight + " pounds");
    }
    
    public void feed(double amount){
        catHunger -= amount;
        if(catHunger <= 0){
            isDomesticated = true;
            catHunger = 0;
        }
        
        if(catHunger >= 1){
            catHunger = 1;
        }
    }
    
    public void growOlder(){
        if(catAge < 5){
            catWeight += 2.5;
        }
        catAge++;
    }
    
    public void play(){
        if(isDomesticated == false){
            System.out.println("The cat darts away!");
        }
        
        if(isDomesticated && catHunger >= 0.75){
            System.out.println("Feed me meow!");
        } else if(isDomesticated && catHunger < 0.5){
            System.out.println(catName + " pounces on the toy!");
        } else if(isDomesticated) {
            System.out.println(catName + " swats lazily at the toy.");
        }
        
        if(catHunger < 1){
            catHunger += 0.25;
        }
    }
}