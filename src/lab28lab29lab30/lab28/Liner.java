package lab28lab29lab30.lab28;

/**
 * Created by Nikol on 3/1/2016.
 */
public class Liner extends AbstractShip {
    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }
    public float calculatePayment(float rental) {
        if((rental == 0)||(rental < 0)){
            return calculatePayment();
        }
        return passengers * rental;
    }
}


