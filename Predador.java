import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Predador extends Actor
{
    /**
     * Act - do whatever the Obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
     moveAround();
     comeCobra();
    }
    public void moveAround(){
        
        move(4);
        
        if (Greenfoot.getRandomNumber(100) < 10){
        turn(Greenfoot.getRandomNumber(90) - 45);
        
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5){
            turn(180);
        }
        }
    public void comeCobra(){
    
        Actor snake;
        snake = getOneObjectAtOffset(0 ,0 , Snake.class);
        if(snake != null)
        {
            World world;
            world = getWorld();
            List<Actor> actors = world.getObjects(null);
            world.removeObjects(actors);
            world.setBackground("game-over.jpg");
            world.showText("GAME OVER", world.getWidth() / 2, world.getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
