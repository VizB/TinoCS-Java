import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedestrian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedestrian extends Actor{
    private int colorTracker = 1;
    
    public void act(){
        
    }
    
public void setColor(int mode){
    if(mode == 1){
        setImage("ppl1.png");
    } else if(mode == 2){
        setImage("ppl2.png");
    } else if(mode == 3){
        setImage("ppl3.png");
    }       
}