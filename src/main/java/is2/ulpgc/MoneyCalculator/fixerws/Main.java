package is2.ulpgc.MoneyCalculator.fixerws;



import is2.ulpgc.MoneyCalculator.Currency;
import is2.ulpgc.MoneyCalculator.CurrencyLoader;

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
