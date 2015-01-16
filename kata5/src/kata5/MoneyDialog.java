package kata5;

import javax.swing.JPanel;
import javax.swing.JTextField;

class MoneyDialog extends JPanel {

    public MoneyDialog() {
        super();
        add(crateTextField());
        add(new CurrencyDialog());
        
    }

    private JTextField crateTextField() {
        return new JTextField(10);
    }
    
}