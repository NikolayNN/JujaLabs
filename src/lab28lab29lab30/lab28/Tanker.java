package lab28lab29lab30.lab28;

/**
 * Created by Nikol on 3/1/2016.
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }
    public float calculatePayment(float rental) {
        if((rental == 0) || (rental < 0)){
            return calculatePayment();
        }
        return volume * rental;
    }


     /*BODY*/

}