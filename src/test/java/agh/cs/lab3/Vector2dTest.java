package agh.cs.lab3;

import org.junit.Assert;
import org.junit.Test;

public class Vector2dTest {
    @Test
    public void equals(){
        Vector2d vector2d = new Vector2d(1,1);
        Vector2d vector2d1 = new Vector2d(1,1);
        Assert.assertEquals(vector2d,vector2d1);
    }

    @Test
    public void printInfo(){
        Vector2d vector2d = new Vector2d(2,2);
        Assert.assertEquals(2,vector2d.getX());
        Assert.assertEquals(2,vector2d.getY());
    }
    @Test
    public void precedes(){
        Vector2d vector2d = new Vector2d(3,3);
        Vector2d vector2d1 = new Vector2d(4,4);
        Assert.assertEquals(true,vector2d.precedes(vector2d1));
    }
    @Test
    public void follows(){
        Vector2d vector2d = new Vector2d(8,8);
        Vector2d vector2d1 = new Vector2d(6,6);
        Assert.assertEquals(true,vector2d.follows(vector2d1));
    }
    @Test
    public void upperRight(){
        Vector2d vector2d = new Vector2d(2,2);
        Vector2d vector2d1 = new Vector2d(2,2);
        Assert.assertEquals(new Vector2d(3,3),vector2d.upperRight(vector2d1));
    }
    @Test
    public void lowerLeft(){
        Vector2d vector2d = new Vector2d(2,2);
        Vector2d vector2d1 = new Vector2d(2,2);
        Assert.assertEquals(new Vector2d(1,1),vector2d.lowerLeft(vector2d1));
    }
    @Test
    public void add(){
        Vector2d vector2d = new Vector2d(2,2);
        Vector2d vector2d1 = new Vector2d(2,2);
        Vector2d vector2d2 = new Vector2d(4,4);
        Assert.assertEquals(vector2d2,vector2d1.add(vector2d));
    }
    @Test
    public void subtract(){
        Vector2d vector2d = new Vector2d(2,2);
        Vector2d vector2d1 = new Vector2d(2,2);
        Vector2d vector2d2 = new Vector2d(0,0);
        Assert.assertEquals(vector2d2,vector2d.subtract(vector2d1));
    }
    @Test
    public void opposite(){
        Vector2d vector2d = new Vector2d(2,2);
        Vector2d vector2d1 = new Vector2d(-2,-2);
        Assert.assertEquals(vector2d1,vector2d.opposite());
    }
}
