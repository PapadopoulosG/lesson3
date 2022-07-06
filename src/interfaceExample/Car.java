package interfaceExample;

public class Car implements Vehicle{
    private String type, speed, color;

    public Car(String type, String speed , String color){
        this.type = type;
        this.speed = speed;
        this.color = color;

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
          System.out.println("type: "+ type + " speed:  "+ speed+ " color: "+ color);
        return  null;

    }
}
