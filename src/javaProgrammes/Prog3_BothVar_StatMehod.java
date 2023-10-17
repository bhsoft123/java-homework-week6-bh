package javaProgrammes;
    /*3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme*/

public class Prog3_BothVar_StatMehod {


            //declaring one instance and one static variable
    static int discount = 1000;
    String model = "Toyota Hybrid";

            //declaring one instance method
    public void offerdisc() {
        System.out.println("Offer discount of £" + discount + " on " + model + " in December only ");
    }

            //declaring one static method
    public static void nooffer() {
        Prog3_BothVar_StatMehod obj3 = new Prog3_BothVar_StatMehod();
        System.out.println("Do not offer discount of £" + discount + " on " + obj3.model + " in other months ");
    }
            //main method
    public static void main(String[] args) {
        Prog3_BothVar_StatMehod obj31 = new Prog3_BothVar_StatMehod();
        obj31.offerdisc(); //calling instance method
        nooffer();   //calling static method
    }
}


