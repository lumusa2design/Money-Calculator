package is2.ulpgc.MoneyCalculator.model;

import is2.ulpgc.MoneyCalculator.model.Currency;

import java.time.LocalDate;

public record ExchangeRate(Currency from, Currency to, LocalDate date, double rate) {
}
