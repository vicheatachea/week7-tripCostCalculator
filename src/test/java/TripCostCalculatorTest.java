import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TripCostCalculatorTest {
    private TripCostCalculator tripCostCalculator = new TripCostCalculator();

    @Test
    public void testCalculateTripCost() {
        double cost = tripCostCalculator.calculateCost(100, 1.5, 6.5);
        assertEquals(9.75, cost);
    }

}
