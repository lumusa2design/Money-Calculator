package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.Currency;
import is2.ulpgc.MoneyCalculator.Money;
import is2.ulpgc.MoneyCalculator.MoneyDialog;

import java.util.List;

public class MockMoneyDialog implements MoneyDialog {
    private List<Currency> currencies;

    @Override
    public MoneyDialog define(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    @Override
    public Money get() {
        return new Money(200, currencies.get(0));
    }
}
