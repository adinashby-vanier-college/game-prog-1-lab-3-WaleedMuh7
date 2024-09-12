// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Worm = getOneIntersectingObject(Worm.class);
        if (Worm != null) {
            World world = getWorld();
            world.removeObject(Worm);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
}
