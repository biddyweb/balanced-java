package bank_account_show;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class bank_account_show {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-22IOkhevjZlmRP2do6CZixkkDshTiOjTV");

BankAccount bankAccount = new BankAccount("/bank_accounts/BA3PDwDCkdeC4OgPtPNwoCWl");

}
}

