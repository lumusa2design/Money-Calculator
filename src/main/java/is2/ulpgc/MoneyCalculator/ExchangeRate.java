package is2.ulpgc.MoneyCalculator;

import java.time.LocalDate;

public record ExchangeRate(Currency from, Currency to, LocalDate date, double rate) {
}
