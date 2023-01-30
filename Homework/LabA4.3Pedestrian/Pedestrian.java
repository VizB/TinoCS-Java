import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Pedestrian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedestrian extends Actor{
    private int colorState = 1;
    private int dx = 3;
    private int pedWidth = this.getImage().getWidth();
    private int worldWidth;
    private int health = 5;
    
    private int coolDown;
    
    public Pedestrian(){
        this.setColorState(colorState);
        MyWorld.gameState = true;
        coolDown = 20;
    }
    
    public void act(){
        if(MyWorld.gameState){
            Fruit possibleFruit = (Fruit)(getOneIntersectingObject(Fruit.class));
            if(coolDown > 0){
                coolDown--;   
            }
            this.setLocation(this.getX() + dx, getY());
            if(this.getX() + pedWidth/2 >= getWorld().getWidth() || this.getX() - pedWidth/2 <= 0){
                dx = -dx;
            }
        
            if(Greenfoot.getKey() == "space" && coolDown <= 0){
                setColorState(getColorState() + 1);
                coolDown = 20;
            }
            if(possibleFruit != null){
                getWorld().removeObject(possibleFruit);
                if(possibleFruit.getFruitColor() != colorState){
                    setHealth(getHealth() - 1);
                    dx = -dx;
                }
            }
            updateImage();
        }
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int newHealth){
        if(newHealth <= 0){
            MyWorld.gameState = false;
        }
        health = newHealth;
    }
    
    public void setColorState(int newColorState){
        if(newColorState < 1 || newColorState > 3){
            colorState = 1;
        }else {
            colorState = newColorState;
        }
    }
    
    public void updateImage(){
        setImage("ppl" + colorState + ".png");
        GreenfootImage healthText = new GreenfootImage(health + "", 2 * getImage().getWidth()/3, Color.WHITE, (Color)null);
        getImage().drawImage(healthText, getImage().getWidth()/2 - healthText.getWidth()/2, getImage().getWidth()/2 - healthText.getHeight() / 2);
    }
    
    public int getColorState(){
        return colorState;
    }
}