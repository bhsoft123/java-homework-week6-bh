package javaProgrammes;

/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme*/

public class Prog1_InstVaria_InstMeth {

            //declaring instance variables
    int car1 = 25000;
    int car2 = 30000;

            //declaring instance method
    public void carprice(){
        System.out.println("Price of car1 is : £ " +car1);
        System.out.println("Price of car2 is : £ " +car2);
    }

            //main method and calling instance method
    public static void main(String[] args) {
        Prog1_InstVaria_InstMeth obj1 = new Prog1_InstVaria_InstMeth();
        obj1.carprice();
    }
}
