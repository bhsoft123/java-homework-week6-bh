package javaProgrammes;

/*4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme*/

public class Prog4_BothVar_BothMeth_Two {

            //declaring two instance and two static variables
    int carprice1 = 45000;
    int carprice2 = 50000;
    static String carmodel1 = "Toyota Hybrid Pure";
    static String carmodel2 = "Toyota Hybrid Motion";

            //declaring one instance method
    public void compprice(){
        System.out.println("The price of '" + carmodel2 + "' is higher than " + "the price of '" + carmodel1 + "' by £ " + (carprice2-carprice1));
        }
            //declaring one static method
    public static void display(){
        Prog4_BothVar_BothMeth_Two obj41 = new Prog4_BothVar_BothMeth_Two();
        System.out.println("The price of '" + carmodel1 +"' is: £"+ obj41.carprice1);
        System.out.println("The price of '" + carmodel2 +"' is: £"+ obj41.carprice2);
        }
    public static void main(String[] args) {
        display();
        Prog4_BothVar_BothMeth_Two obj4 = new Prog4_BothVar_BothMeth_Two();
        obj4.compprice();
        }
    }
