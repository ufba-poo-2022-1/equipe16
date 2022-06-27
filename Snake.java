import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author Diego Anjos 
 * @version 2022-05-28
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        eat();
        moveSnake2();
        
    }
    public void eat(){
    /* Checa a colisão com uma fruta.*/
    
        Actor comida;
        comida = getOneObjectAtOffset(0 ,0 , Food.class);
        if(comida != null)
        {
            World world;
            world = getWorld();
            world.removeObject(comida);
            world.addObject(new Food(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        }
    
    }
    public void moveSnake1(){
        // TESTE - movimento pelo usuario;
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if (Greenfoot.isKeyDown("up")){
            move(5);
        }
    }
    public void moveSnake2(){
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        move(5);
    }
    
}
