import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(10,20,20,30,10,49,78);
        Integer n = numbers.stream().count();

        System.out.println(n);
        
    }
}