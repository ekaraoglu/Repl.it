import java.util.*;

public class MethodsWithArrayList_swap {
    /*
    In this assignment you will swap a position in an array list with another.

swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:

swap(["one","two","three"],0,2)
returns:["three","two","one"]


swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]

     */

    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2)
    {

        String  temp = list.get( pos1 ) ;

        list.set( pos1, list.get( pos2) ) ;

        list.set( pos2, temp ) ;

        return list;

    }

    public static void main(String[] args) {

     ArrayList<String> swap = new ArrayList<>();

     swap.addAll(Arrays.asList("a","c","b","d","e"));

    swap(swap,0,2);

        System.out.println(swap);

    }
}
