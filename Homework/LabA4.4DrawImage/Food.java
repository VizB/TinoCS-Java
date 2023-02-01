import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor 
{
    int regen = 0;
    public Food(){
        int rand = Greenfoot.getRandomNumber(3);
        if(rand == 0){
            setImage("apple1.png");
            regen = 2;
        }else if(rand == 1){
            setImage("bananas.png");
            regen = 3;
        }else if(rand == 2){
            setImage("bread.png");
            regen = 5;
        }
    }
    
    public int getFoodRegen(){
        return regen;
    }

    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
