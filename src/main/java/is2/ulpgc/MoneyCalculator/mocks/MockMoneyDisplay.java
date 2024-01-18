package is2.ulpgc.MoneyCalculator.mocks;

import is2.ulpgc.MoneyCalculator.view.MoneyDisplay;
import is2.ulpgc.MoneyCalculator.model.Money;

public class MockMoneyDisplay implements MoneyDisplay {
        @Override
        public void show(Money money) {
            System.out.println(money);
        }
    }
