import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor{
    int numFrames = 0;
    int speed = 3;
    
    public void act(){
        numFrames++;
        if(numFrames == 10){
            setImage("bat_02.png");
        } else if(numFrames == 20){
            numFrames = 0;
            setImage("bat_01.png");
        }
        
        MouseInfo mouseStuff = Greenfoot.getMouseInfo();
        
        if(mouseStuff != null){
            int defRotation = this.getRotation();
            this.turnTowards(mouseStuff.getX(), mouseStuff.getY());
            this.move(speed);
            this.setRotation(defRotation);
        }
    }
}
