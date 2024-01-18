package is2.ulpgc.MoneyCalculator.controller;

import is2.ulpgc.MoneyCalculator.controller.Command;
import is2.ulpgc.MoneyCalculator.model.Currency;
import is2.ulpgc.MoneyCalculator.model.ExchangeRate;
import is2.ulpgc.MoneyCalculator.model.ExchangeRateLoader;
import is2.ulpgc.MoneyCalculator.model.Money;
import is2.ulpgc.MoneyCalculator.view.CurrencyDialog;
import is2.ulpgc.MoneyCalculator.view.MoneyDialog;
import is2.ulpgc.MoneyCalculator.view.MoneyDisplay;

public class ExchangeMoneyCommand implements Command {
    private final MoneyDialog moneyDialog;
    private final CurrencyDialog currencyDialog;
    private final ExchangeRateLoader exchangeRateLoader;
    private final MoneyDisplay moneyDisplay;

    public ExchangeMoneyCommand(MoneyDialog moneyDialog, CurrencyDialog currencyDialog, ExchangeRateLoader exchangeRateLoader, MoneyDisplay moneyDisplay) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
        this.exchangeRateLoader = exchangeRateLoader;
        this.moneyDisplay = moneyDisplay;
    }

    @Override
    public void execute() {
        Money money = moneyDialog.get();
        Currency currency = currencyDialog.get();

        ExchangeRate exchangeRate = exchangeRateLoader.load(money.currency(), currency);
        Money result = new Money((long) (money.amount()*exchangeRate.rate()), currency);

        moneyDisplay.show(result);
    }
}
