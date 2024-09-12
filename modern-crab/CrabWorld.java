// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 436, 185);
        Worm worm =  new  Worm();
        addObject(worm, 311, 343);
        Worm worm2 =  new  Worm();
        addObject(worm2, 284, 177);
        Crab crab2 =  new  Crab();
        addObject(crab2, 393, 116);
        Crab crab3 =  new  Crab();
        addObject(crab3, 175, 290);
        Worm worm3 =  new  Worm();
        addObject(worm3, 90, 125);
        Worm worm4 =  new  Worm();
        addObject(worm4, 105, 417);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 264, 74);
        Lobster lobster2 =  new  Lobster();
        addObject(lobster2, 417, 312);
        Lobster lobster3 =  new  Lobster();
        addObject(lobster3, 184, 211);
    }
}
