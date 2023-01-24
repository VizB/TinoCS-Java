import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor{
    private int dx = 3;
    private int dy = 3;
    
    public void act(){
        int height = getWorld().getHeight();
        int width = getWorld().getWidth();
    
        int ballWidth = getImage().getWidth();
        int ballHeight = getImage().getHeight();
        setLocation(getX() + dx, getY() + dy);
        Actor possibleBrick = getOneIntersectingObject(Brick.class);
        
        if((this.getX() + ballWidth / 2 >= width) || (this.getX() - ballWidth / 2 <= 0)){
            dx = -dx;
        }
        
        if((this.getY() + ballHeight / 2 >= height) || (this.getY() - ballHeight / 2 <= 0)){
            dy = -dy;
        }
        
        if(possibleBrick != null){
            dy = -dy;
        }
    }
}
