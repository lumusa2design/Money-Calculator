package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.Currency;
import is2.ulpgc.MoneyCalculator.CurrencyLoader;

import java.util.List;

public class MockCurrencyLoader implements CurrencyLoader {
    @Override
    public List<Currency> load() {
        return List.of(
                new Currency("EUR", "Euro"),
                new Currency("USD", "Dolar"),
                new Currency("GBP", "Libra")
        );
    }
}
