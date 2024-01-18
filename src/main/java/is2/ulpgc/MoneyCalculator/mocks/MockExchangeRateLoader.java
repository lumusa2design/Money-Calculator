package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.Currency;
import is2.ulpgc.MoneyCalculator.ExchangeRate;
import is2.ulpgc.MoneyCalculator.ExchangeRateLoader;

import java.time.LocalDate;

public class MockExchangeRateLoader implements ExchangeRateLoader {
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return  new ExchangeRate(from, to, LocalDate.now(), 1.218);
    }
}
