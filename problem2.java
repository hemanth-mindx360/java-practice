import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(10,20,100,210,12);

        List<Integer> result = numbers.stream().map(n -> String.valueOf(n)).filter(s -> s.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(result);
    }

    
}
