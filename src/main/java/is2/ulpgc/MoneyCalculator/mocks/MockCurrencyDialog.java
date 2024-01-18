package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.model.Currency;
import is2.ulpgc.MoneyCalculator.view.CurrencyDialog;

import java.util.List;

public class MockCurrencyDialog implements CurrencyDialog{
    private List<Currency> currencies;

    @Override
    public CurrencyDialog define(List<Currency> currencies) {
        this.currencies = currencies;
        return this;
    }

    @Override
    public Currency get() {
        return currencies.get(1);
    }
}
