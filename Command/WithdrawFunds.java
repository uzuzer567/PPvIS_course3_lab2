package Command;
import Model.Funds;
import Model.IncomeExpenseStatistics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WithdrawFunds extends Operation {
    private double amountToWithdraw;

    IncomeExpenseStatistics incomeExpenseStatistics;

    public void withdrawFunds(Funds funds) {
        funds.withdrawAmount(amountToWithdraw);
    }

    public boolean checkFunds(Funds funds) {
        if (funds.getFunds().get(funds.getFunds().size()).getAmount() < amountToWithdraw) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean checkLimitations(ArrayList<Double> limitations) {
        boolean checkLimitations = false;
        for (int i = 0; i < limitations.size(); i++){
            if(limitations.get(i) > amountToWithdraw){
                checkLimitations = false;
            }
            else {
                checkLimitations = true;
            }
        }
        return checkLimitations;
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

        JButton button = new JButton("Withdraw");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {
            amountToWithdraw = Double.parseDouble(textFieldAmount.getText());
            textFieldAmount.setText("");
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
