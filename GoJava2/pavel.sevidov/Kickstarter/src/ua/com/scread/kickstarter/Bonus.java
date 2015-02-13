package ua.com.scread.kickstarter;

public class Bonus {
    private double amount;
    private String description;
    
    public Bonus(double amount, String description) {
        this.amount = amount;
        this.description = description;    
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getDescription() {
        return description;
    }
    
}
