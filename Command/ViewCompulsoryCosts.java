package Command;
import Model.CompulsoryCosts;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTable;

public class ViewCompulsoryCosts extends Operation {
    private ArrayList<String> compulsoryItemOfExpenditure = new ArrayList<>();
    private ArrayList<Double> amount = new ArrayList<>();

    public void viewCompulsoryCost (ArrayList<CompulsoryCosts> compulsoryCosts) {
        for (int i = 0; i < compulsoryCosts.size(); i++) {
            compulsoryItemOfExpenditure.add(compulsoryCosts.get(i).getCompulsoryItemOfExpenditure());
            amount.add(compulsoryCosts.get(i).getAmount());
        }
    }

    public void execute() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,200);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        ArrayList<String> headers = new ArrayList<>();
        headers.add("Compulsory item of expenditure");
        headers.add("Amount");
        JTable jTable = new JTable(compulsoryItemOfExpenditure.size() + 1, 2);
        jTable.setValueAt(headers.get(0), 0, 0);
        jTable.setValueAt(headers.get(1), 0, 1);

        if (compulsoryItemOfExpenditure.size() == 0) {
            jTable.setValueAt("", 0, 0);
            jTable.setValueAt("",0, 1);
        }
        else {
            for(int i = 0; i < compulsoryItemOfExpenditure.size(); i++)
            {
                jTable.setValueAt(compulsoryItemOfExpenditure.get(i), i, 0);
                jTable.setValueAt(amount.get(i),i, 1);
            }
        }

        jPanel.add(jTable);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
