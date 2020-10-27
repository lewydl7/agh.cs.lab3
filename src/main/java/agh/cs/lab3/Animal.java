package agh.cs.lab3;
import java.util.Objects;
public class Animal {
    private MapDirection direction;
    private  Vector2d position;
    private final int rad;

    public MapDirection getDirection() {
        return direction;
    }

    public Vector2d getPosition() {
        return position;
    }


    public Animal(){
        this.direction = MapDirection.NORTH;
        this.position = new Vector2d(2,2);
        this.rad = 5;
    }

    @Override
    public String toString() {
        return "Animal " +
                "kierunek = " + direction +
                ", pozycja = " + position;
    }
    public void move(MoveDirection direction){
        switch (direction){
            case RIGHT:
            this.direction = this.direction.next();
            break;
            case LEFT:
                this.direction = this.direction.next();
                break;
            case FORWARD:
                this.position = this.countPWDCase(this.direction.toUnitVector());
                break;
            case BACKWARD:
                this.position = this.countPWDCase(Objects.requireNonNull(this.direction.toUnitVector().opposite()));
                break;
        }
        System.out.println(this);
    }
    private Vector2d countPWDCase(Vector2d move){
        this.position = this.position.add(move);

        Vector2d outputVector = new Vector2d(this.position.getX() % rad, this.position.getY() % rad);
        // dzielenie przez rad = 5 ograniczna uzyskanie wartosci dla których nasz zwierzak mógłby wyjść po za plansze
        if(outputVector.getX() >= 0 && outputVector.getY() >= 0){
            return outputVector;
        }
        if (outputVector.getX() < 0){
            return new Vector2d(this.rad + outputVector.getX(), outputVector.getY());
        }
        if(outputVector.getY() < 0){
            return new Vector2d(outputVector.getX(), this.rad + outputVector.getY());
        }
        return outputVector;
    }
}
