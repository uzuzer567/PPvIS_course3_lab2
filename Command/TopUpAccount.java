package Command;
import Model.Funds;
import Model.IncomeExpenseStatistics;

import javax.swing.*;
import java.awt.*;

public class TopUpAccount extends Operation {
    private double amountToTopUpAccount;

    IncomeExpenseStatistics incomeExpenseStatistics;

    public void topUpAccount(Funds funds) {
        funds.topUpAmount(amountToTopUpAccount);
    }

    public void execute() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,250);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelAmount = new JLabel(" Amount");
        labelAmount.setSize(100,50);
        JTextField textFieldAmount = new JTextField();
        textFieldAmount.setMaximumSize(new Dimension(370,50));

        JButton button = new JButton("Top up");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {
            if(!textFieldAmount.getText().isEmpty())
            {
                amountToTopUpAccount = Double.parseDouble(textFieldAmount.getText());
                textFieldAmount.setText("");
            }
        });

        JLabel label = new JLabel(" ");
        label.setSize(100,50);

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(labelAmount);
        jPanel.add(textFieldAmount);
        jPanel.add(button);
        jPanel.add(label);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
