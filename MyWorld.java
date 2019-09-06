        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//Bri the cool kid!!!!
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
        int randomCactus= Greenfoot.getRandomNumber(3);
        int randomCactus2= Greenfoot.getRandomNumber(3);
        int randomFlower= Greenfoot.getRandomNumber(3);
        int randomFlower2= Greenfoot.getRandomNumber(3);
        int amtOfFlowers= 2;
        int amtOfCacti= 2;
        
        beee bee1=new beee();
        addObject(bee1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        
        Turtle turtle1 = new Turtle();
        addObject(turtle1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
          
      
        if(randomCactus==0){
        Cactus bobbieCactus=new Bobbie();
        addObject(bobbieCactus,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400)); 
    }
        if(randomCactus==1){
        Cactus suzieCactus=new Suzie();
        addObject(suzieCactus,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
       if(randomCactus==2){
        Cactus frankCactus=new Frank();
        addObject(frankCactus,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));  
    } 
    
    if(randomCactus2==0){
            Cactus bobbieCactus2=new Bobbie();
            addObject(bobbieCactus2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        }
    if(randomCactus2==1){
        Cactus suzieCactus2=new Suzie();
        addObject(suzieCactus2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        }
    if(randomCactus2==2){
        Cactus frankCactus2=new Frank();
        addObject(frankCactus2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
        }
    
        
    if(randomFlower==1){
        flower adamFlower=new Adam();
        addObject(adamFlower,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==2){
        flower daisyFlower=new Daisy();
        addObject(daisyFlower,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==0){
        flower gerturdFlower=new Gerturd();
        addObject(gerturdFlower,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    
    if(randomFlower2==1){
        flower adamFlower2=new Adam();
        addObject(adamFlower2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower2==2){
        flower daisyFlower2=new Daisy();
        addObject(daisyFlower2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower2==0){
        flower gerturdFlower2=new Gerturd();
        addObject(gerturdFlower2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    }
}
