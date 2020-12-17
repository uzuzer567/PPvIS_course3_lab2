package Command;
import Model.IncomeExpenseStatistics;

import javax.swing.*;
import java.util.ArrayList;

public class ViewStatistics extends Operation {
    ArrayList<String> incomeStatisticsItem = new ArrayList<>();
    ArrayList<Double> incomeStatisticsAmount = new ArrayList<>();
    ArrayList<String> expenseStatisticsItem = new ArrayList<>();
    ArrayList<Double> expenseStatisticsAmount = new ArrayList<>();

    public void viewIncomeExpenseStatistics (ArrayList<IncomeExpenseStatistics> incomeStatistics, ArrayList<IncomeExpenseStatistics> expenseStatistics) {
        if (incomeStatistics.size() == 0) {
            for (int i = 0; i < expenseStatistics.size(); i++) {
                this.expenseStatisticsAmount.add(expenseStatistics.get(i).getExpence());
                this.expenseStatisticsItem.add(expenseStatistics.get(i).getItem());
            }
        }
        else if(expenseStatistics.size() == 0) {
            for (int i = 0; i < incomeStatistics.size(); i++) {
                this.incomeStatisticsAmount.add(incomeStatistics.get(i).getIncome());
                this.incomeStatisticsItem.add(incomeStatistics.get(i).getItem());
            }
        }
        else {
            for (int i = 0; i < expenseStatistics.size(); i++) {
                this.expenseStatisticsAmount.add(expenseStatistics.get(i).getExpence());
                this.expenseStatisticsItem.add(expenseStatistics.get(i).getItem());
            }
            for (int i = 0; i < incomeStatistics.size(); i++) {
                this.incomeStatisticsAmount.add(incomeStatistics.get(i).getIncome());
                this.incomeStatisticsItem.add(incomeStatistics.get(i).getItem());
            }
        }
    }

    public void execute() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,200);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        ArrayList<String> headers1 = new ArrayList<>();
        headers1.add("Item (income)");
        headers1.add("Amount");
        JTable jTable1 = new JTable(incomeStatisticsItem.size() + 2, 2);
        jTable1.setValueAt(headers1.get(0), 0, 0);
        jTable1.setValueAt(headers1.get(1), 0, 1);

        if (incomeStatisticsItem.size() == 0) {
            jTable1.setValueAt("", 1, 0);
            jTable1.setValueAt("",1, 1);
        }
        else {
            for(int i = 0; i < incomeStatisticsItem.size(); i++)
            {
                jTable1.setValueAt(incomeStatisticsItem.get(i), i, 0);
                jTable1.setValueAt(incomeStatisticsAmount.get(i),i, 1);
            }
        }

        JLabel label = new JLabel(" ");
        label.setSize(100,50);

        ArrayList<String> headers2 = new ArrayList<>();
        headers2.add("Item (expense)");
        headers2.add("Amount");
        JTable jTable2 = new JTable(expenseStatisticsItem.size() + 2, 2);
        jTable2.setValueAt(headers2.get(0), 0, 0);
        jTable2.setValueAt(headers2.get(1), 0, 1);

        if(expenseStatisticsItem.size() == 0) {
            jTable2.setValueAt("", 1, 0);
            jTable2.setValueAt("",1, 1);
        }
        else {
            for(int i = 0; i < expenseStatisticsItem.size(); i++)
            {
                jTable1.setValueAt(expenseStatisticsItem.get(i), i, 0);
                jTable1.setValueAt(expenseStatisticsAmount.get(i),i, 1);
            }
        }

        Box tables = new Box(BoxLayout.Y_AXIS);
        tables.add(jTable1);
        tables.add(label);
        tables.add(jTable2);

        jPanel.add(tables);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
