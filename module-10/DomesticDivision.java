// JOSE VELAZQUEZ
// MODULE 10.2 ASSIGNMENT 
// DATE: 03/03/2026
// This is the DomesticDivision class, which extends the Division class 
// and represents a domestic division in a company.


public class DomesticDivision extends Division {

    // Additional field
    private String state;

    // Constructor requiring all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Implement display method
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
