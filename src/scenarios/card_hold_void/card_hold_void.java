package card_hold_void;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class card_hold_void {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-22IOkhevjZlmRP2do6CZixkkDshTiOjTV");

CardHold cardHold = new CardHold("/card_holds/HL4joUazeM3BJE6emmv2Q8EF");
try {
    cardHold.unstore();
}
catch (HTTPError e) {}
catch (NotCreated notCreated) {}

}
}

