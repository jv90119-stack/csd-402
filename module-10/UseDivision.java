// JOSE VELAZQUEZ
// MODULE 10.2 ASSIGNMENT 
// DATE: 03/03/2026
// This is the UseDivision class, which contains the main method to create 
// instances of InternationalDivision and DomesticDivision, and calls their 
// display methods to show their information. It demonstrates the use of inheritance 
// and polymorphism in Java by utilizing the Division class as a base class for both 
// types of divisions. The main method creates two instances of each division type 
// and displays their details.


public class UseDivision {

    public static void main(String[] args) {

        // Two International divisions
        InternationalDivision intDiv1 =
                new InternationalDivision("Europe Sales", 101, "Germany", "German");

        InternationalDivision intDiv2 =
                new InternationalDivision("Asia Operations", 102, "Japan", "Japanese");

        // Two Domestic divisions
        DomesticDivision domDiv1 =
                new DomesticDivision("West Coast Division", 201, "California");

        DomesticDivision domDiv2 =
                new DomesticDivision("East Coast Division", 202, "New York");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
