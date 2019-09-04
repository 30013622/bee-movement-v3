BeeWinimport greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    private int score = 0;    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     turn(1);
     move(Greenfoot.getRandomNumber(50));
     int x = getX();
     int y = getY();
        if(y > 399 || y < 1){
            y = Greenfoot.getRandomNumber(400);
            setLocation(x,y);
    }    
    //Check if We Hit a Cactus
    boolean contactFlower = isTouching(flower.class);
   if(contactFlower){
        flower plant = (flower)getOneIntersectingObject(flower.class);
        int plantScore = plant.getScore();
        score = score - plantScore;
        removeTouching(flower.class);
    }
    boolean contactCactus= isTouching(Cactus.class);
    if(contactCactus){
        Cactus plant = (Cactus)getOneIntersectingObject(Cactus.class);
        int plantScore = plant.getScore();
        score = score + plantScore;
        removeTouching(Cactus.class);
    }
    if(score>= 12){
        TurtleWin winScreen= new TurtleWin();
        Greenfoot.setWorld(winScreen);
    }
    if(score<=-12){
        BeeWin loseScreen= new BeeWin();
        Greenfoot.setWorld(loseScreen);
    }
    }
    }    