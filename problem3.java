import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(10,20,30,40);

        Optional<Integer> result = numbers.stream().findFirst();

        System.out.println(result.orElse(null));


    }
}