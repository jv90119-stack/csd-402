// JOSE VELAZQUEZ
// MODULE 10.2 ASSIGNMENT 
// DATE: 03/03/2026
// This is the Division class, which serves as a base class for 
// different types of divisions in a company.


public abstract class Division {

    // Fields
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract display method
    public abstract void display();
}
