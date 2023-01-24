import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Ball ball = new Ball();
        for(int i = 0; i < 10; i++){
            Brick brick = new Brick();
            addObject(brick, getWidth() / 2 - brick.getImage().getWidth()/2 - 4*(brick.getImage().getWidth())+i*(brick.getImage().getWidth()), getHeight()/2); 
        }
        
        addObject(ball, getWidth()/2, (3*getHeight())/4);
    }
}
