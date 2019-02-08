import java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
        int people;
        int hotdogs;

        //Create a scanner object to read input
        Scanner keyboard= new Scanner(System.in);

        //Create a cookout object
        cookout food=new cookout();

        //Get the number of attending the cookout
        System.out.println("Enter the number of people attending the cookout: ");
        people= keyboard.nextInt();

        //Get the number of hotdogs each person will be given
        System.out.println("Enter the number of hotdogs each person will be given: ");
        hotdogs=keyboard.nextInt();

        //Store the data
        food.setNum_People(people);
        food.setNum_Hotdogs(hotdogs);

        //Display the final results
        System.out.println("\nThe minimum number of packages of hot dogs required: " + food.getMinimum_Hotdogs()+";\n");
        System.out.println("The minumum number of packages of buns required: " + food.getMinimum_Buns()+";\n");
        System.out.println("The number of hot dogs that will be left over: " + food.getRemaining_Hotdogs()+";\n");
        System.out.println("The number of buns that will be left over: " + food.getRemaining_Buns()+";\n");
    }
}
