package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.MoneyDisplay;
import is2.ulpgc.MoneyCalculator.Money;

public class MockMoneyDisplay implements MoneyDisplay {
        @Override
        public void show(Money money) {
            System.out.println(money);
        }
    }
