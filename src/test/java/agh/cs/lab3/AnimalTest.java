package agh.cs.lab3;
import agh.cs.lab3.MapDirection;
import  agh.cs.lab3.Animal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testAnimal(){
        Animal animal = new Animal();
        assertEquals(animal.getPosition(), new Vector2d(2,2));
        assertEquals(animal.getDirection(), MapDirection.NORTH);
    }

    @Test
    public void testMove(){
        Animal animal = new Animal();
        animal.move(MoveDirection.FORWARD);
        assertEquals(animal.getPosition(), new Vector2d(2,3));
        animal.move(MoveDirection.BACKWARD);
        assertEquals(animal.getPosition(), new Vector2d(2,2));
        animal.move(MoveDirection.FORWARD);
        assertEquals(animal.getPosition(), new Vector2d(2,3));
        animal.move(MoveDirection.FORWARD);
        assertEquals(animal.getPosition(), new Vector2d(2,4));
        animal.move(MoveDirection.RIGHT);
        assertEquals(animal.getPosition(), new Vector2d(2,4));

        }
        @Test
        public void testAnimalOutMap(){
            Animal animal = new Animal();
            animal.move(MoveDirection.FORWARD);
            animal.move(MoveDirection.FORWARD);
            animal.move(MoveDirection.FORWARD);
            assertEquals(animal.getPosition(), new Vector2d(2,0));
            assertEquals(animal.getDirection(), MapDirection.NORTH);
            animal.move(MoveDirection.RIGHT);
            assertEquals(animal.getDirection(), MapDirection.EAST);
            assertEquals(animal.getPosition(), new Vector2d(2,0));

        }


    }


