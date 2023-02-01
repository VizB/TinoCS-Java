import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor{
    public int hunger = 0;
    GreenfootImage head;
    public int numFramesToHunger = 0;
    
    public Player(){
        head = new GreenfootImage(100, 100);
        setImage(head);
        head.setColor(Color.ORANGE);
        head.fill();
        
        int eyeDim = (int) ((2*head.getWidth())/10.0);
        int pupilDim = (int) (head.getWidth()/10.0);
        
        head.setColor(Color.WHITE);
        head.fillOval(head.getWidth()/2 - (int)((3.0/10.0)*head.getWidth()), head.getWidth()/4, eyeDim, eyeDim);
        head.fillOval(head.getWidth()/2 + (int)(head.getWidth()/10.0), head.getWidth()/4, eyeDim, eyeDim);
        
        head.setColor(Color.BLACK);
        head.fillOval(head.getWidth()/2 - (head.getWidth()/4), (int)(head.getWidth()/4 + ((5.0/100.0)*head.getWidth())), 
                        pupilDim, pupilDim);
        head.fillOval(head.getWidth()/2 + (int)((15.0/100.0)*head.getWidth()), (int)(head.getWidth()/4 + ((5.0/100.0)*head.getWidth())), 
                        pupilDim, pupilDim);
        
        head.fillRect(head.getWidth()/2 - head.getWidth()/4 , head.getWidth() - head.getWidth() / 3, head.getWidth()/2, head.getWidth() / 5);
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        if(hunger < 100){
            if(numFramesToHunger >= 10){
                hunger++;
                numFramesToHunger = 0;
            }else{
                numFramesToHunger++;
            }
            
            GreenfootImage copy = new GreenfootImage(head);
            copy.setColor(Color.RED);
            copy.fillRect(0,0, copy.getWidth(), 10);
            copy.setColor(Color.GREEN);
            float proportionalWidth = copy.getWidth() * (float)((100-hunger)/100.0);
            copy.fillRect(0, 0, (int)proportionalWidth, 10);
            setImage(copy);
            
            Food possibleFood = (Food) getOneIntersectingObject(Food.class);
            
            if(possibleFood != null){
                hunger -= possibleFood.getFoodRegen();
                getWorld().removeObject(possibleFood);
            }
            
        } else {
            MyWorld.gameOver();
        }
    }
}
