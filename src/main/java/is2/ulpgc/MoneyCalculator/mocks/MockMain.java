package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.controller.Command;
import is2.ulpgc.MoneyCalculator.controller.ExchangeMoneyCommand;
import is2.ulpgc.MoneyCalculator.model.Currency;
import is2.ulpgc.MoneyCalculator.model.ExchangeRateLoader;
import is2.ulpgc.MoneyCalculator.view.CurrencyDialog;
import is2.ulpgc.MoneyCalculator.view.MoneyDialog;
import is2.ulpgc.MoneyCalculator.view.MoneyDisplay;

import java.util.List;

public class MockMain {
    public static void main(String[] args) {
        List<Currency> currencies = new MockCurrencyLoader().load();
        MoneyDialog moneyDialog = new MockMoneyDialog().define(currencies);
        CurrencyDialog currencyDialog = new MockCurrencyDialog().define(currencies);
        MoneyDisplay moneyDisplay = new MockMoneyDisplay();
        ExchangeRateLoader exchangeRateLoader = new MockExchangeRateLoader();
        Command command = new ExchangeMoneyCommand(moneyDialog, currencyDialog, exchangeRateLoader, moneyDisplay);
        command.execute();
    }
}
