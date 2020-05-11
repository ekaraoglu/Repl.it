import java.util.ArrayList;
import java.util.Arrays;

public class R190_MethodsWithArrayList_11_appendPosSum {
    /*
    Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned
should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
     */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(4,-6,3,-8,0,4,3));

        appendPosSum(numbers);

        System.out.println(appendPosSum(numbers));




    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numbers){

        ArrayList<Integer> appendPosSum = new ArrayList<>();

        for (Integer each : numbers){

            if (each > 0){

                appendPosSum.add(each);

            }
        }

        Integer Sum = 0;

        for (Integer each : appendPosSum){

           Sum += each;
        }

        appendPosSum.add(Sum);

        return appendPosSum;
    }
}
