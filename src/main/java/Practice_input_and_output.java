import static input.InputUtils.*;

public class Practice_input_and_output {

    public static void main(String[] args) {


         // Ask the user for their name and store their name in a variable. What type of variable is this?

            String name = stringInput("Please enter your name:");//get information from user
            System.out.println("My name is: "+ name); //display output

         // Ask the user for the number of students in a class. Store the answer in an int variable.

            int numberOfStudents = positiveIntInput("How many students are in your class?");
            System.out.println("There are "+ numberOfStudents + "  in class");

         // As the user for the number of rooms in their house or apartment. Store the answer in an int variable.

            int numberOfRooms =  intInput("How many rooms are in your house (or apartment)? ");
            System.out.println(numberOfRooms);

         // Ask the user for today's temperature in F. Store the answer in a double variable.

             double temp = doubleInput("What is the temperature for today in F?"); //get information from user
             System.out.printf("Temperature for today is: %.1f\n" , temp);

         // Ask the user for the value of change in their pockets. Store the answer in a double variable.

             double changeValue = positiveDoubleInput("What are the change values in your pocket?");
             System.out.printf("Change values are: $%.2f \n", changeValue);//show printf displays float point number with 2 digits after period


         //Ask the user for the name of the school they attend. Store the answer in a String variable
            String nameOfSchoolAttend = stringInput("What school did you attend?");
            System.out.println("I attended: " + nameOfSchoolAttend);
    }
}
