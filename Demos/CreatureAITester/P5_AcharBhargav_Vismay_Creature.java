import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Represents a creature that wanders around and collects treats.
 * 
 * @author Vismay Achar Bhargav
 * @version (a version number or a date)
 */
public class P5_AcharBhargav_Vismay_Creature extends Actor {
    public int speed = 2;
    public Treat target = null;
    
    public void act() {
        Actor treatLocated = getOneIntersectingObject(Treat.class);
        boolean possibleWall = isTouching(Wall.class);
        Actor insideWall = getOneIntersectingObject(Wall.class);
        List<Treat> treats = getObjectsInRange(9999, Treat.class);
        
        if(!possibleWall){
            if(treats.size() >= 1){
               Treat firstTreat = treats.get(0); 
               if(target == null){
                target = firstTreat;
                }
            }
        
            if(target != null && possibleWall == false && insideWall == null){
                turnTowards(target.getX(), target.getY());
                move(speed);
                setRotation(0);
                if(treatLocated != null){
                    getWorld().removeObject(treatLocated);
                    target = null;
                }
            }
        }
    }
}
