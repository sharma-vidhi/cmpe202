import java.util.List;
import java.util.Arrays;

public class TestStrategy {

    public static void main(String[] args) {
        System.out.println("Using normal strategy method\n");
        System.out.println("n and n are integers and n>m ");
        System.out.println("-----------------------------\n\n");



        List<Computation> computations =
                Arrays.asList(
                        new Sum(),
                        new Difference(),
                        new Product()
                );

        for (Computation comp : computations) {

            comp.compute(100, 20);
        }
    }
}
