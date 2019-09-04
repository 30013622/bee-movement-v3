        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//Bri the cool kid
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
        super(600, 400, 1, false); 
        int randomCactus= Greenfoot.getRandomNumber(2);
        int randomFlower= Greenfoot.getRandomNumber(2);
        
        beee bee1=new beee();
        addObject(bee1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        
        beee bee2=new beee();
        addObject(bee2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        if(randomCactus==0){
        Cactus cactus1=new Bobbie();
        addObject(cactus1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
        if(randomCactus==2){
        Cactus cactus2=new Frank();
        addObject(cactus2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    } 
        if(randomCactus==1){
        Cactus cactus3=new Suzie();
        addObject(cactus3,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    } 
        
    if(randomFlower==1){
        flower flower1=new Adam();
        addObject(flower1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==2){
        flower flower2=new Daisy();
        addObject(flower2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==0){
        flower flower3=new Gerturd();
        addObject(flower3,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    }
}
