public class Product implements Computation<Integer> {
    @Override
    public void compute(Integer n, Integer m) {

        System.out.println("Product of "+n+" and "+m+" is " +(n*m));
    }
}
