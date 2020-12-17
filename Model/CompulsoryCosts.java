package Model;

import java.util.ArrayList;

public class CompulsoryCosts {
    private String compulsoryItemOfExpenditure;
    private double amount;

    private ArrayList<CompulsoryCosts> compulsoryCosts = new ArrayList<>();

    public CompulsoryCosts(){

    }

    public CompulsoryCosts(String compulsoryItemOfExpenditure, double amount){
        this.compulsoryItemOfExpenditure = compulsoryItemOfExpenditure;
        this.amount = amount;
    }

    public void setCompulsoryCosts(String compulsoryItemOfExpenditure, double amount) {

    }

    public String getCompulsoryItemOfExpenditure() {
        return compulsoryItemOfExpenditure;
    }

    public double getAmount() {
        return amount;
    }

    public ArrayList<CompulsoryCosts> getCompulsoryCosts() {
        return compulsoryCosts;
    }
}
