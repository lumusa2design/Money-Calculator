package is2.ulpgc.MoneyCalculator.view;

import is2.ulpgc.MoneyCalculator.model.Money;
import is2.ulpgc.MoneyCalculator.view.MoneyDisplay;

import javax.swing.*;

public class SwingMoneyDisplay extends JLabel implements MoneyDisplay {
    @Override
    public void show(Money money) {
        setText(money.toString());
    }
}