import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Movement> movingObjects = new ArrayList<>();

        movingObjects.add(new Airplane("Boeing 747", 2016));
        movingObjects.add(new Bird("Hawk"));
        movingObjects.add(new Bird("Eagle"));

        // Loop through and print how they move
        for (Movement movingObject : movingObjects) {
            System.out.println(movingObject.toString() + ": ");
            movingObject.fly();
            movingObject.walk();
            movingObject.jump();
            System.out.println();
        }
    }
}