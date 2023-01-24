import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Brick extends Actor{
    public void act(){
        Actor possibleBall = getOneIntersectingObject(Ball.class);
        if (possibleBall != null) {
            getWorld().removeObject(this);
        }
    }
}
