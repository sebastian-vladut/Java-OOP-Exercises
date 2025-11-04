package Exercise_06_TicketPricing;

/**
 * An interface defining a contract for all ticket types.
 * Any class that implements this interface must provide a way to calculate its price.
 */
public interface Ticket {

    /**
     * Calculate the price for a specific type of Price.
     * @return The calculated price of the ticket.
     */
    public double calculatePrice();
}
