import java.awt.Color;

public class Saab95 extends CommonBaseCar implements Movable {

    private boolean turboOn;

    public Saab95() {
        super(2, Color.red, 125, "Saab95");
        turboOn = false;
    }

    @Override
    public void move() {
        // Implementera logik för att flytta Saab95
        System.out.println("Saab95 moving");
    }

    @Override
    public void turnLeft() {
        // Implementera logik för att svänga vänster
        System.out.println("Saab95 turning left");
    }

    @Override
    public void turnRight() {
        // Implementera logik för att svänga höger
        System.out.println("Saab95 turning right");
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }
}
