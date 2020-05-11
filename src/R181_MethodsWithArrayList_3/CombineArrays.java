package R181_MethodsWithArrayList_3;
import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {
    /*
    combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
     */
        public static String combineRs(String[] r1, String[] r2){
/*
    String result =" ";

    for (int i = 0;  i < r1.length; i++){

        result += r1[i];
    }

    for (String each : r2){

        result += each;
    }

return result;
*/
    ArrayList<String> combine = new ArrayList<>();

    for (String each : r1){

        combine.add(each);
    }
    for (String each : r2){

        combine.add(each);
    }
    String result = "";

    for (String each : combine){

        result += each;
    }

    return result;
    }

    public static void main(String[] args) {

            String[] r1 = {"f","o","o"};

            String[] r2 = {" b","a","r"};

            String str = combineRs(r1,r2);

        System.out.println(str);
    }

 }
