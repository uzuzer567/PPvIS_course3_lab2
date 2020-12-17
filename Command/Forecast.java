package Command;

import Model.CompulsoryCosts;
import Model.Funds;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Forecast extends Operation {
    private boolean fundsEnough;

    public void predict(ArrayList<CompulsoryCosts> compulsoryCosts, Funds funds) {
        double compulsoryCostsAmount = 0;
        for (int i = 0; i < compulsoryCosts.size(); i++) {
            compulsoryCostsAmount += compulsoryCosts.get(i).getAmount();
        }

        if (compulsoryCostsAmount >= funds.getAmount()) {
            fundsEnough = false;
        }
        else {
            fundsEnough = true;
        }
    }

    public void execute() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,250);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelAmount = new JLabel(" Command.Forecast");
        labelAmount.setSize(100,50);
        jPanel.add(labelAmount);

        if (fundsEnough) {
            JTextField textFieldAmount = new JTextField("Ok!");
            textFieldAmount.setMaximumSize(new Dimension(370,50));
            jPanel.add(textFieldAmount);
        }
        else {
            JTextField textFieldAmount = new JTextField("Not ok!");
            textFieldAmount.setMaximumSize(new Dimension(370,50));
            jPanel.add(textFieldAmount);
        }

        JButton buttonBack = new JButton("Back");
        buttonBack.setMaximumSize(new Dimension(100,50));
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
        });

        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
