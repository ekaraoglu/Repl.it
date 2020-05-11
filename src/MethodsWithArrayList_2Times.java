import java.util.ArrayList;
import java.util.Arrays;

public class MethodsWithArrayList_2Times {
    /*
    Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
     */
    public static void main(String[] args) {

        ArrayList<Integer> repeat = new ArrayList<>();

        repeat.addAll(Arrays.asList(1,5,3,7));

        twoTimes(repeat);

        System.out.println(twoTimes(repeat));

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> numbers){

        ArrayList<Integer> twoTimes = new ArrayList<>();

        for (Integer each : numbers){

            twoTimes.add(each);
        }

        int i = 0;

        for (Integer each : numbers){

            twoTimes.add(i,each);

            i += 2;
        }
        return twoTimes;
    }
}
