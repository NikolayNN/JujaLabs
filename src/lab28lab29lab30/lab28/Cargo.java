package lab28lab29lab30.lab28;

/**
 * Created by Nikol on 3/1/2016.
 */
public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rental) {
        if((rental == 0) || (rental < 0)) {
            return calculatePayment();
        }
        return tonnage * rental;

    }


     /*BODY*/

}