import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor{
    int fruitHeight;
    int fruitColor = (new Random()).nextInt((3 - 1) + 1) + 1;
    
    public Fruit(){
        setImage("fruit" + fruitColor + ".png");
        fruitHeight = getImage().getHeight();
    }
    
    public int getFruitColor(){
        return fruitColor;
    }
    
    public void act(){
        if(getY() + fruitHeight/2 <= getWorld().getHeight()){
            this.setLocation(getX(), getY() + 4);
        }
    }
}
