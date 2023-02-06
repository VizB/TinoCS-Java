import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature extends Actor{
    
    public int speed = 3;
    public int defRotation = this.getRotation();
    
    public Creature(){
        getImage().scale(32, 44);
        setImage(getImage());
    }
    
    protected void addedToWorld(World world){
        do {
            setLocation(Greenfoot.getRandomNumber(world.getWidth()), Greenfoot.getRandomNumber(world.getHeight()));
        }while(isTouching(Wall.class) || isTouching(Treat.class)|| isTouching(Creature.class));
    }
    
    /**
     * Act - do whatever the Creature wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        boolean hasTouchedWall = false;
        int currRotation = this.getRotation();
        
        setRotation(defRotation);
        turn(Greenfoot.getRandomNumber(30) - 15);
        
        defRotation = this.getRotation();
        move(speed);
        setRotation(currRotation);
        
        if(isTouching(Wall.class)){
            setRotation(defRotation);
            move(-speed);
            hasTouchedWall = true;
            setRotation(currRotation);
        }
        
        if(hasTouchedWall){
            defRotation += Greenfoot.getRandomNumber(150) + 30;
        }
        
        Treat treat = (Treat) getOneIntersectingObject(Treat.class);
        if(treat != null){
            getWorld().removeObject(treat);
        }
        
    }
}
