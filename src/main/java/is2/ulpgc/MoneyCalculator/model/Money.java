package is2.ulpgc.MoneyCalculator.model;

import is2.ulpgc.MoneyCalculator.model.Currency;

public record Money(long amount, Currency currency) {
    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
