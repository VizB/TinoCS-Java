import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class TeleBaby extends Baby {
    
    @Override
    public void onHit(Actor a) {
        super.onHit(a);
        List<Baby> babies = getObjectsInRange(75, Baby.class);
        for (Baby b : babies) {
            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(getWorld().getHeight());
            b.setLocation(x, y);
        }
    }
}
