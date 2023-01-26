import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BananaWorld extends World{
    public BananaWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Bat bat = new Bat();
        addObject(bat, getWidth()/2, getHeight()/2);
    }
    
    public void act(){
        int chance = Greenfoot.getRandomNumber(100);
        
        if(chance == 1){
            Banana banana = new Banana();
            int x = Greenfoot.getRandomNumber(getWidth() - banana.getImage().getWidth()) + banana.getImage().getWidth()/2;
            int y = Greenfoot.getRandomNumber(getHeight() - banana.getImage().getHeight()) + banana.getImage().getHeight()/2;
            addObject(banana, x, y);
        }
    }
}
