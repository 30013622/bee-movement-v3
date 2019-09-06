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
        int randomCactus= Greenfoot.getRandomNumber(2);
        int randomCactus2= Greenfoot.getRandomNumber(2);
        int randomFlower= Greenfoot.getRandomNumber(2);
        int randomFlower2= Greenfoot.getRandomNumber(2);
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
        flower flower1=new Adam();
        addObject(flower1,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==2 || randomFlower2==2){
        flower flower2=new Daisy();
        addObject(flower2,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    if(randomFlower==0  || randomFlower2==0){
        flower flower3=new Gerturd();
        addObject(flower3,Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber​(400));
    }
    }
}
