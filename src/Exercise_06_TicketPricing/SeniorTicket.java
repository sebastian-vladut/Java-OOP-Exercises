package Exercise_06_TicketPricing;

public class SeniorTicket implements Ticket {
    private final double SENIOR_PRICE = 19.99;

    /**
     * Calculates the price for a senior ticket.
     * @return The price for a senior ticket.
     */
    public double calculatePrice() {
        return SENIOR_PRICE;
    }
}
