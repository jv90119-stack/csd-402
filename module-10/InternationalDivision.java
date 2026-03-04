// JOSE VELAZQUEZ
// MODULE 10.2 ASSIGNMENT 
// DATE: 03/03/2026
// This is the InternationalDivision class, which extends the Division class 
// and represents an international division in a company. It includes additional 
// fields for country and language, and implements the display method to show all 
// relevant information about the division.


public class InternationalDivision extends Division {

    // Additional fields
    private String country;
    private String language;

    // Constructor requiring all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Implement display method
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
