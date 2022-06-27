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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 700, 1);
        addObject(new Comida(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Comida(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Predador(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Predador(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
        Snake cobra1 = new Snake();
        
        addObject(cobra1, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
    }
        
        
}
