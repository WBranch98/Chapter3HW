public abstract class FarmAnimal {
    protected String name;
    protected String gender;
    protected double weight;
    protected int age;


    public FarmAnimal (String name, String gender, double weight, int age) {
        this.name=name;
        this.gender=gender;
        this.weight=weight;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "[name=" + name  +
                ", gender=" + gender  +
                ", weight=" + weight +
                ", age=" + age +
                ']';
    }

    public String feedLoadingSchedule() {
        return null;
    }
}

class Chicken extends FarmAnimal{
    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Chicken " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return name + ": 8am-4pm";
    }
}

// Subclass Cow
class Cow extends FarmAnimal {
    private String sound;

    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Cow " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return name + ": 6am-4pm";
    }
}

// Subclass Duck
class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Duck " + sound + " " + super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return name + ": 8am-12pm-6pm";
    }
}
