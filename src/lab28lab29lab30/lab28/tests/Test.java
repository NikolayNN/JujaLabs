package lab28lab29lab30.lab28.tests;

import lab28lab29lab30.lab28.Tanker;

/**
 * Created by Nikol on 3/1/2016.
 */
public class Test {
    public static void main(String[] args) {
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        float testRentTax = 5000;
        float expectedTankerPaymentRentTaxNotDefault = testTankerVolume * testRentTax;

        Tanker tanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

        //check payment if rent tax is not default
        float actualTankerPaymentRentTaxNotDefault = tanker.calculatePayment(testRentTax);
        if (actualTankerPaymentRentTaxNotDefault != expectedTankerPaymentRentTaxNotDefault)
            throw new AssertionError("Rent tax is not default= " + testRentTax + " and expected payment value= " + expectedTankerPaymentRentTaxNotDefault + " but found " + actualTankerPaymentRentTaxNotDefault);

        System.out.print("OK");
    }
}