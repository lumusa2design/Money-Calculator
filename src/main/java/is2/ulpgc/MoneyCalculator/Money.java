package is2.ulpgc.MoneyCalculator;

public record Money(long amount, Currency currency) {
    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
