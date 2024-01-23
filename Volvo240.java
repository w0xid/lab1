import java.awt.*;

public class Volvo240 extends CommonBaseCar implements Movable {

    private final static double trimFactor = 1.25;

    public Volvo240() {
        super(4, Color.black, 100, "Volvo240");
    }

    @Override
    protected double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void move() {
        double angleInRadians = Math.toRadians(getCurrentDirection());
        double deltaX = getCurrentSpeed() * Math.cos(angleInRadians);
        double deltaY = getCurrentSpeed() * Math.sin(angleInRadians);
        setCurrentX(getCurrentX() + deltaX);
        setCurrentY(getCurrentY() + deltaY);
    }

    @Override
    public void turnLeft() {
        setCurrentDirection((getCurrentDirection() - 90) % 360);
    }

    @Override
    public void turnRight() {
        setCurrentDirection((getCurrentDirection() + 90) % 360);
    }
}
