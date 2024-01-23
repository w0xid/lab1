import java.awt.Color;

public class Volvo240 extends CommonBaseCar implements Movable {

    private final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240");
    }

    @Override
    public void move() {
        // Implementera logik för att flytta Volvo240
        System.out.println("Volvo240 moving");
    }

    @Override
    public void turnLeft() {
        // Implementera logik för att svänga vänster
        System.out.println("Volvo240 turning left");
    }

    @Override
    public void turnRight() {
        // Implementera logik för att svänga höger
        System.out.println("Volvo240 turning right");
    }
}
