package Model;

import java.util.ArrayList;

public class IncomeExpenseStatistics {
    private double income;
    private double expense;
    private String item;

    private ArrayList<IncomeExpenseStatistics> incomes = new ArrayList<>();
    private ArrayList<IncomeExpenseStatistics> expenses = new ArrayList<>();

    public void addIncomes(IncomeExpenseStatistics incomeExpenseStatistics) {
        incomes.add(incomeExpenseStatistics);
    }

    public void addExpenses(IncomeExpenseStatistics incomeExpenseStatistics) {
        expenses.add(incomeExpenseStatistics);
    }

    public double getIncome() {
        return income;
    }

    public double getExpence() {
        return expense;
    }

    public String getItem() {
        return item;
    }

    public ArrayList<IncomeExpenseStatistics> getIncomes() {
        return incomes;
    }

    public ArrayList<IncomeExpenseStatistics> getExpenses() {
        return expenses;
    }
}
