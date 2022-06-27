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
    private int score = 0;
    
    public void act()
    {
        
        comeComida();
        comeComidaEspecial();
        moveSnake1();
        mostraScore();
        
    }
    public void comeComida(){
    /* Checa a colisão com uma fruta.*/
    
        if (isTouching(Comida.class)){
            removeTouching(Comida.class);
            score += 5;
            getWorld().addObject(new Comida(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
            int sorteio = Greenfoot.getRandomNumber(5);
            if (sorteio == 1){
                getWorld().addObject(new ComidaEspecial(), Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getHeight()));
                
            }
               
        }
    
    }
    public void comeComidaEspecial(){
        if (isTouching(ComidaEspecial.class)){
            removeTouching(ComidaEspecial.class);
            score += 10;
        }
    }
    
    // TESTE - movimento pelo usuario;
    
    public void moveSnake1(){
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
    
    public void mostraScore(){
        getWorld().showText("Score: " + score, 100, 30);
    }
}
