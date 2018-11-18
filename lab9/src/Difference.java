public class Difference implements Computation<Integer>{
    @Override
    public void compute(Integer n, Integer m) {

        System.out.println("Difference of "+n+" and "+m+" is "+(n-m));
    }
}
