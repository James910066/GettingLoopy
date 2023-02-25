public class GettingLoopy
{
    public static void main(String[] args)
    {

        // 1. Counts up by 1 from 0 to 30
        for(int cnt = 0; cnt <= 30; cnt++) //Initialize variable for starting point, then set stopping point, then add 1 each loop to variable
        {
            System.out.println(cnt); //Output statement for each loop with new variable value
        }

//        // 2. Counts down by 1 from 30 to 0
//        for(int cnt = 30; cnt >= 0; cnt--) //Initialize variable for starting point, then set stopping point, then subtract 1 each loop from variable
//        {
//            System.out.println(cnt); //Output statement for each loop with new variable value
//        }

//         // 3. Counts up by 3 from 0 to 18
//        for(int cnt = 0; cnt <= 18; cnt = cnt + 3) //Initialize variable for starting point, then set stopping point, then add 3 each loop to variable
//        {
//            System.out.println(cnt); //Output statement for each loop with new variable value
//        }

//           // 4. Counts down by 2 from 10 to 0
//        for(int cnt = 10; cnt >= 0; cnt = cnt - 2) //Initialize variable for starting point, then set stopping point, then subtract 2 each loop from variable
//        {
//            System.out.println(cnt); //Output statement for each loop with new variable value
//        }

        // Part B: Output for Loops
//        // 5.
//            String star = "*"; //Initializing string variable
//            for(int row = 1; row <= 5; row++) //Starting value for row variable which is the counter; Stopping point for the outer loop; Adding 1 to row counter. This determines then number of lines for stars
//            {
//                for(int column = 1; column <= 5; column++) //vertical starting then stopping point for column variable; This inner loop determines number of stars per line
//                    if(column <= row) //Condition check to stop or continue inner loop, This determines the count of stars per line
//                        {
//                     System.out.print(star); //Outputs the string variable, star count is determined on the number of the inner loop, example; 3rd loop = 3 stars
//                        }
//                     System.out.println(""); //output each line of stars individually on separate lines
//            }

//        //6.
//        String star = "*"; //Initializing string variable
//        for(int row = 1; row <= 5; row++) //Starting value for row variable which is the counter; Stopping point for the outer loop; Adding 1 to row counter. This determines then number of lines for stars
//        {
//            for(int column = 1; column <= 5; column++) //vertical starting then stopping point for column variable; This inner loop determines number of stars per line
//                if(column >= row)  //Condition check to stop or continue inner loop, This determines the count of stars per line.
//                {
//                    System.out.print(star); //Outputs the string variable, star count is determined on the number of the inner loop, example; 3rd loop = 3 stars
//                }
//            System.out.println(""); //output each line of stars individually on separate lines
//        }

//        // 7.
//        //Declaration and assignment of all variables
//        final int ROW = 5;
//        final int COLUMN = 5;
//        String star = "*";
//
//        for(int row = 1; row <= ROW; row++) // Start point for variable row; While row is less than or equal to ROW keep looping and adding 1 to row
//        {
//            // Inner loop goes across the row through the columns
//            for (int column = 1; column <= COLUMN; column++) //Start point for column; While column less than or equal to COLUMN; keep looping and adding 1 to column
//                {
//                    System.out.print(star); //Outputs string star per COLUMN value
//                }
//            System.out.println(""); //output each line of stars individually on separate lines
//
//        }
    }


}