import java.util.List;
import java.util.Arrays;

public class TestLambdaStrategy {
    public static void main(String[] args) {

        System.out.println("Using lambda function\n");
        System.out.println("n and n are integers and n>m ");
        System.out.println("-----------------------------\n\n");

        List<Computation<Integer>> computations =
                Arrays.asList(
                        (n, m)-> {  System.out.println("Sum of "+n+" and "+m+" is "+(n+m)); },
                        (n, m)-> {  System.out.println("Difference of "+n+" and "+m+" is "+(n-m)); },
                        (n, m)-> {  System.out.println("Product of "+n+" and "+m+" is " +(n*m)); }
                );
        computations.forEach((comp) -> comp.compute(100,20));
    }
}
