import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Player player;
    public static boolean gameState = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
    }

    public void act(){
        if(gameState){
            if(Greenfoot.getRandomNumber(100) == 42){
                Food food = new Food();
                addObject(food, Greenfoot.getRandomNumber(getWidth() - food.getImage().getWidth()) + food.getImage().getWidth()/2, Greenfoot.getRandomNumber(getHeight() - food.getImage().getHeight())+food.getImage().getHeight()/2);
            }
            
            if(Greenfoot.isKeyDown("Left") && (player.getX() - player.getImage().getWidth() / 2 > 0)){
                player.setLocation(player.getX() - 3, player.getY());
            }
            if(Greenfoot.isKeyDown("Right") && (player.getX() + player.getImage().getWidth() / 2 < getWidth())){
                player.setLocation(player.getX() + 3, player.getY());
            }
            if(Greenfoot.isKeyDown("Up") && (player.getY() - player.getImage().getHeight() / 2 > 0)){
                player.setLocation(player.getX(), player.getY() - 3);
            }
            if(Greenfoot.isKeyDown("Down") && (player.getY() + player.getImage().getHeight() / 2 < getHeight())){
                player.setLocation(player.getX(), player.getY() + 3);
            }
        } else {
            gameOver();
            GameOver g = new GameOver();
            addObject(g, getWidth()/2, getHeight()/2);
        }
    }
    
    public static void gameOver(){
        gameState = false;
    }
}
