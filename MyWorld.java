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
        super(900, 900, 1);
        addObject(new Food(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new Food(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new Obstaculo(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new Snake(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
    }
        
        
}
