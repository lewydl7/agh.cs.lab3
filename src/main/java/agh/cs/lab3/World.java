package agh.cs.lab3;

public class World {
    public static void main(String[] args) {
     /*   Animal animal = new Animal();
        System.out.println(animal);
        animal.move(MoveDirection.RIGHT);
        animal.move(MoveDirection.FORWARD);
        animal.move(MoveDirection.FORWARD);
*/

        Animal animal1 = new Animal();
        String[] test = {"r","r","r","x","forward","forward","forward","backward","backward","b","b","r","l"};
    OptionParser parser = new OptionParser();
    MoveDirection[] moves = parser.parse(test);
        for (MoveDirection move : moves) {
            animal1.move(move);
        }

    }
}
