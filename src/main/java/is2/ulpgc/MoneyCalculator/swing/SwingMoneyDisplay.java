package is2.ulpgc.MoneyCalculator.swing;

import is2.ulpgc.MoneyCalculator.Money;
import is2.ulpgc.MoneyCalculator.MoneyDisplay;

import javax.swing.*;

public class SwingMoneyDisplay extends JLabel implements MoneyDisplay {
    @Override
    public void show(Money money) {
        setText(money.toString());
    }
}