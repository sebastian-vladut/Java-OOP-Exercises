## Exercise 5: Currency Conversion
### **Requirements:**
Create a class CurrencyConverter that uses a static variable to store a fixed
exchange rate (for example, from RON to EUR). The class should also contain
a static method convertToEUR(double amount) that converts a given amount
in RON to EUR using the static exchange rate. Allow the static exchange rate
to be modified using a static method setExchangeRate(double rate) so that
the conversion can be adjusted. Demonstrate the functionality by performing
conversions with different exchange rates without needing to instantiate any
objects of the CurrencyConverter class.