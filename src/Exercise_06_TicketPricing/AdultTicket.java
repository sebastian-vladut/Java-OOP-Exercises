package Exercise_06_TicketPricing;

public class AdultTicket implements Ticket {
    private final double ADULT_PRICE = 24.99;

    /**
     * Calculates the price for an adult ticket.
     * @return The price for an adult ticket.
     */
    public double calculatePrice() {
        return ADULT_PRICE;
    }
}
