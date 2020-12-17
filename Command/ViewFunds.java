package Command;
import Model.Funds;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewFunds extends Operation {
    private ArrayList<Double> funds = new ArrayList<>();

    public void viewFunds(Funds funds) {
        this.funds.add(funds.getAmount());
    }

    public void execute() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,200);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelBalance = new JLabel(" Account balance");
        labelBalance.setSize(100,50);
        JTextField textFieldAccountBalance = new JTextField();
        textFieldAccountBalance.setMaximumSize(new Dimension(370,50));

        if (funds.size() == 0) {
            textFieldAccountBalance.setText("0.0");
        }
        else {
            textFieldAccountBalance.setText(funds.get(0).toString());
        }

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(labelBalance);
        jPanel.add(textFieldAccountBalance);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
