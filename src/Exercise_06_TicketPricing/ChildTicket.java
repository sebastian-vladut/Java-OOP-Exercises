package Exercise_06_TicketPricing;

public class ChildTicket implements Ticket {
    private final double CHILD_PRICE = 14.99;

    /**
     * Calculates the price for a child ticket.
     * @return The price for a child ticket.
     */
    public double calculatePrice() {
        return CHILD_PRICE;
    }
}
