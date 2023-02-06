import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Baby extends Actor {
    
    public void onHit(Actor a) {
        turnTowards(a.getX(), a.getY());
        turn(180);
        move(5);
    }
}
