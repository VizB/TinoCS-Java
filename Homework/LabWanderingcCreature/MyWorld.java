import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(){    
        super(640, 480, 1); 
        
        Creature c1 = new Creature();
        Creature c2 = new Creature();
        Creature c3 = new Creature();
        
        Treat t1 = new Treat();
        Treat t2 = new Treat();
        Treat t3 = new Treat();
        
        drawRect();
        
        addObject(c1, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(c2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(c3, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
        addObject(t1, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(t2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(t3, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
    }
    
    public void drawRect(){
        Wall justAWall = new Wall();
        drawWalls(getWidth()/ (justAWall.getImage().getWidth()), 1, 0, 0);
        drawWalls(1, (getHeight()/justAWall.getImage().getHeight()) - 2, 0, justAWall.getImage().getHeight());
        drawWalls(getWidth()/ (justAWall.getImage().getWidth()), 1, 0, getHeight() - justAWall.getImage().getHeight());
        drawWalls(1, (getHeight()/justAWall.getImage().getHeight()) - 2, getWidth() - justAWall.getImage().getWidth(), justAWall.getImage().getHeight());
        drawWalls(5, 5, getWidth()/2 - 5*justAWall.getImage().getWidth()/2, getHeight()/2 - 5*justAWall.getImage().getHeight()/2);
    }
    
    public void drawWalls(int w, int h, int x, int y){
        Wall testWall = new Wall();
        int wallWidth = testWall.getImage().getWidth();
        int wallHeight = testWall.getImage().getHeight();
        int firstXPos = x;
        int currYPos = y;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                Wall daWall = new Wall();
                addObject(daWall, firstXPos + wallWidth/2, currYPos + wallHeight/2);
                firstXPos += wallWidth;
            }
            currYPos += wallHeight;
            firstXPos = x;
        }
    }
}
