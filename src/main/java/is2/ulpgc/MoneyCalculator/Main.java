package is2.ulpgc.MoneyCalculator;



import is2.ulpgc.MoneyCalculator.fixerws.FixerCurrencyLoader;
import is2.ulpgc.MoneyCalculator.model.Currency;
import is2.ulpgc.MoneyCalculator.model.CurrencyLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new FixerCurrencyLoader();
        List<Currency> currencies = currencyLoader.load();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}
