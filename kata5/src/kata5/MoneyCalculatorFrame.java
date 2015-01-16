package kata5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 300));
        createComponents();
        setVisible(true);
        
    }

    private void createComponents() {
        add(createExchandeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createExchandeDialog() {
        JPanel panel = new JPanel();
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
        
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }

    private JButton createCloseButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return button;
    }
        

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating...");
            }
        });
        return button;
    }
    
    
}