package Exercise_05_CurrencyConversion;

/**
 * A class for the currency convertor using static members.
 * This class provides methods to convert an amount from RON to EUR and to update the conversion rate without needing to be initialised.
 */
public class CurrencyConverter {

    // The static exchange rate.
    private static double exchangeRate = 5.0865;

    /**
     * Private constructor to prevent this utility class from being instantiated.
     */
    private CurrencyConverter() {
    }

    /**
     * Converts a given amount in RON to EUR.
     * @param amount The amount to be converted.
     * @return The converted amount.
     */
    public static double convertToEuro(double amount) {
        return amount / exchangeRate;
    }

    /**
     * Updates the static exchange rate for all future conversions.
     * @param rate The new updated conversion rate.
     */
    public static void setExchangeRate(double rate) {
        if (rate > 0) {
            exchangeRate = rate;
            System.out.println("Exchange rate updated to: " + exchangeRate);
        }
        else {
            System.out.println("ERROR: Invalid exchange rate.");
        }
    }
}
