import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beee extends Actor
{
    private int score = 0;    
    
    
    
    /**
     * Act - do whatever the beee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(2);
        move(Greenfoot.getRandomNumber(100));
        int x = getX();
        int y = getY();
    if(x > 599 || x < 1){
            x = Greenfoot.getRandomNumber(600);
            setLocation(x,y);
    }    
        if(y > 399 || y < 1){
            y = Greenfoot.getRandomNumber(400);
            setLocation(x,y);
    }    
    //Check if We Hit a Flower
    boolean contactFlower = isTouching(flower.class);
    if(contactFlower){
        flower plant = (flower)getOneIntersectingObject(flower.class);
        int plantScore = plant.getScore();
        score = plantScore + score;
        removeTouching(flower.class);
    }
    boolean contactCactus= isTouching(Cactus.class);
    if(contactCactus){
        Cactus plant = (Cactus)getOneIntersectingObject(Cactus.class);
        int plantScore = plant.getScore();
        score = score - plantScore;
        removeTouching(Cactus.class);
    }
    //check if it wins
    if(score>= 12){
        BeeWin winScreen= new BeeWin();
        Greenfoot.setWorld(winScreen);
    }
    if(score<=-12){
        TurtleWin loseScreen= new TurtleWin();
        Greenfoot.setWorld(loseScreen);
    }
    }
}
