interface Flight{
    void fly();
}
interface Movement extends Flight{
    void walk();
    void jump();
}
class Airplane implements Movement {
    private String model;
    private int yearBuilt;


    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }


    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    public void walk() {
        System.out.println("I taxi on my wheels.");
    }

    public void jump() {
        System.out.println("I cannot jump.");
    }

    public String toString() {
        return "Airplane [model=" + model +  ", year=" + yearBuilt + "]";
    }
}
class Bird implements Movement {
    private String type;


    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void fly() {
        System.out.println("I’m a bird who flaps wings to fly.");
    }
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    @Override
    public String toString() {
        return "Bird [type='" + type  +
                ']';
    }
}
