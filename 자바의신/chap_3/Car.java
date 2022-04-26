package 자바의신.chap_3;

public class Car {
    int speed;
    int distance;
    String color;

    public Car(){
        this.speed = 0;
        this.distance = 0;
        this.color = "Black";
    }
    public void speedUp(){
        this.speed += 5;
    }

    public void breakDown(){
        this.speed -= 10;
    }

    public int getCurrentSpeed(){
        return speed;
    }
    
    public static void main(String[] args) {
        Car dogCar = new Car();
        Car catCar = new Car();

        catCar.speedUp();
        catCar.speedUp();
        System.out.println(catCar.getCurrentSpeed());
        catCar.breakDown();
        System.out.println(catCar.getCurrentSpeed());
    }
}
