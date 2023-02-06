import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Ambulance extends Actor {
    public Ambulance() {
        getImage().scale((int)(1.25 * getImage().getWidth()), 5 * getImage().getHeight() / 4);
    }
    
    @Override
    public void act() {
        turn(Greenfoot.getRandomNumber(9) - 4);
        move(2);
        if (isAtEdge()) {
            turn(180);
        }
        
        List<Baby> babies = getIntersectingObjects(Baby.class);
        for (int i = 0; i < babies.size(); i++) {
            Baby widdleBaby = babies.get(i);
            widdleBaby.onHit(this);
        }
        
    }
    
    
    public boolean touchingBaby() {
        return isTouching(Baby.class);
    }
}
