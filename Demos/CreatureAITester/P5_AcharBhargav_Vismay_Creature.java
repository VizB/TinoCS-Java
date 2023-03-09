import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Represents a creature that moves toward treats and eats them.
 * 
 * @author Vismay Achar Bhargav 
 * @version 3/5/2023
 */
public class P5_AcharBhargav_Vismay_Creature extends Actor {
    public int speed = 2;
    Actor closestTreat = null;
    
    public void act() {
        Actor treatLocated = getOneIntersectingObject(Treat.class);
        boolean possibleWall = isTouching(Wall.class);
        Actor insideWall = getOneIntersectingObject(Wall.class);
        List<Treat> treats = getObjectsInRange(9999, Treat.class);
        
        if(closestTreat == null){
            closestTreat = closestReachableTreat();
        }
        
        if(closestTreat != null) {
            if(!isTouching(Wall.class)){
                turnTowards(closestTreat.getX(), closestTreat.getY());
                move(speed);
                setRotation(0);
            }
            if(treatLocated != null){
                getWorld().removeObject(treatLocated);
                closestTreat = null;
            }
        }
    }
    
    public int numStepsToTreat(Treat treat) {
        int moves = 0;
        int initialX = getX();
        int initialY = getY();
        while (getOneIntersectingObject(Treat.class) == null){
            if(isTouching(Wall.class)) {
                setLocation(initialX, initialY);
                setRotation(0);
                System.out.println("invalid move");
                return -1;
            }
            turnTowards(treat.getX(), treat.getY());
            move(speed);
            setRotation(0);
            moves++;
        }
        setLocation(initialX, initialY);
        setRotation(0);
        return moves;
    }
    
    public Actor closestReachableTreat() {
        List<Treat> treats = getObjectsInRange(9999, Treat.class);
        Treat closeTreat;
        if(treats.size() >= 1){
            closeTreat = treats.get(0);
        } else {
            closeTreat = null;
        }
        for(int i = 0; i < treats.size(); i++) {
            if(numStepsToTreat(treats.get(i)) != -1 && numStepsToTreat(treats.get(i)) < numStepsToTreat(closeTreat)) {
                closeTreat = treats.get(i);
            }
        }
        if(treats.size() < 1){
            return null;
        } else {
            return closeTreat;
        }
    }
}