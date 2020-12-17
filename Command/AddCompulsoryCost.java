package Command;
import Model.CompulsoryCosts;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.awt.Dimension;
import javax.swing.JButton;

public class AddCompulsoryCost extends Operation {
    private String compulsoryItemOfExpenditure;
    private double amount;

    public void addCompulsoryCost(ArrayList<CompulsoryCosts> compulsoryCosts) {
        compulsoryCosts.add(new CompulsoryCosts(compulsoryItemOfExpenditure, amount));
    }

    public void execute() {
        JFrame jframe = new JFrame();
        jframe.setSize(200,260);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelCompulsoryItemOfExpenditure = new JLabel(" Item of expenditure");
        labelCompulsoryItemOfExpenditure.setSize(100,50);
        JTextField textFieldCompulsoryItemOfExpenditure = new JTextField();
        textFieldCompulsoryItemOfExpenditure.setMaximumSize(new Dimension(370,50));

        JLabel labelAmount = new JLabel(" Amount");
        labelAmount.setSize(100,50);
        JTextField textFieldAmount = new JTextField();
        textFieldAmount.setMaximumSize(new Dimension(370,50));

        JButton button = new JButton("Add");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {
            if(!textFieldCompulsoryItemOfExpenditure.getText().equals(" ") && Double.parseDouble(textFieldAmount.getText()) != 0)
            {
                compulsoryItemOfExpenditure = textFieldCompulsoryItemOfExpenditure.getText();
                amount = Double.parseDouble(textFieldAmount.getText());
                textFieldCompulsoryItemOfExpenditure.setText("");
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

        jPanel.add(labelCompulsoryItemOfExpenditure);
        jPanel.add(textFieldCompulsoryItemOfExpenditure);
        jPanel.add(labelAmount);
        jPanel.add(textFieldAmount);
        jPanel.add(button);
        jPanel.add(label);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
