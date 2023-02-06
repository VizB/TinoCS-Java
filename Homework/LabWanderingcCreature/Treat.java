import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treat extends Actor{
    
    public Treat(){
        getImage().scale(32, 32);
        setImage(getImage());
    }
    
    protected void addedToWorld(World world){
        do {
            setLocation(Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
        }while(isTouching(Wall.class) || isTouching(Creature.class) || isTouching(Treat.class) );
    }
    
    /**
     * Act - do whatever the Treat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        // Add your action code here.
    }
}
