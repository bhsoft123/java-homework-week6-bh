package javaProgrammes;

/*2. Write a Java programme using the following steps.
        2.1 Declare two static variables
        2.2 Declare one static method
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and Run the programme*/


public class Prog2_StatVar_StatMeth {
                        //declaring two static variables
        static String carmodel1 = "Toyota Auris Hybrid";
        static int carmodel1price = 45000;

                        //declaring one static method
        public static void prntcarmodelpr(){
            System.out.println("The price of carmodel - '" +carmodel1 + "' is £" +carmodel1price);
        }

                        //calling main method
        public static void main(String[] args) {
               prntcarmodelpr();
        }

}
