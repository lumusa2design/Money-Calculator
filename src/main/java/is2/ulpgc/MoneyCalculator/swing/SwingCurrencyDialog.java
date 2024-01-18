package is2.ulpgc.MoneyCalculator.swing;

import is2.ulpgc.MoneyCalculator.Currency;
import is2.ulpgc.MoneyCalculator.CurrencyDialog;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SwingCurrencyDialog  extends JPanel implements CurrencyDialog {
    private JComboBox<Currency> currencySelector;

    public SwingCurrencyDialog() {
        initializeComponents();
    }

    private void initializeComponents() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Añade espaciado entre componentes
        add(createCurrencySelector());
    }


    private JComboBox<Currency> createCurrencySelector() {
        JComboBox<Currency> selector = new JComboBox<>();
        this.currencySelector = selector;
        // Puedes personalizar el aspecto del JComboBox aquí si es necesario
        return selector;
    }

    @Override
    public CurrencyDialog define(List<Currency> currencies) {
        currencySelector.setModel(new DefaultComboBoxModel<>(currencies.toArray(new Currency[0])));
        return this;
    }

    @Override
    public Currency get() {
        return currencySelector.getItemAt(currencySelector.getSelectedIndex());
    }

}
