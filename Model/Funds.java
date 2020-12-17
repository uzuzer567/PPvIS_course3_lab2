package Model;

import java.util.ArrayList;

public class Funds {
    private double amount;

    private ArrayList<Funds> funds = new ArrayList();

    Funds() {    }

    Funds(int amount) {
        this.amount = amount;
    }

    public boolean topUpAmount(double amount) {
        funds.get(funds.size()).setAmount(getAmount() + amount);
        return true;
    }

    public boolean withdrawAmount(double amount) {
        funds.get(funds.size()).setAmount(getAmount() - amount);
        return false;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<Funds> getFunds() {
        return funds;
    }
}
