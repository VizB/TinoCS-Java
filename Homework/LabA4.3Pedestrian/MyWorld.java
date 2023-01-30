import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static boolean gameState;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Pedestrian ped = new Pedestrian();
        addObject(ped, ped.getImage().getWidth() / 2, getHeight()-(ped.getImage().getHeight()/2));
    }
    
    public void act(){
        int chance = Greenfoot.getRandomNumber(1000);
        if(gameState){
            if(chance == 1 || chance == 2 || chance == 3 || chance == 4 || chance == 5 
                || chance == 6 || chance == 7){
                Fruit fruit = new Fruit();
                int x = Greenfoot.getRandomNumber(getWidth() - fruit.getImage().getWidth()) + fruit.getImage().getWidth()/2;
                int y = Greenfoot.getRandomNumber(getHeight() - fruit.getImage().getHeight()) + fruit.getImage().getHeight()/2;
                addObject(fruit, x, fruit.getImage().getHeight() / 2);
            }
        } else {
            showText("Game Over", getWidth() / 2, getHeight() / 2);
        }
    }
}