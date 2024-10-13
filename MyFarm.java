
import java.util.ArrayList;
public class MyFarm {
        public static void main(String[] args) {
            ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

            farmAnimals.add(new Duck("Donald", "male", 3.2, 5, "Quack Quack"));
            farmAnimals.add(new Duck("Cheese", "female", 3.6, 5, "Quack Quack"));
            farmAnimals.add(new Cow("Molly", "female", 1600.0, 3, "Moo Moo"));
            farmAnimals.add(new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo"));
            farmAnimals.add(new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck"));
            farmAnimals.add(new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck"));

            for (FarmAnimal animal : farmAnimals) {
                System.out.println(animal);
            }

            for (FarmAnimal animal : farmAnimals) {
                System.out.println(animal.feedLoadingSchedule());
            }
        }
    }



