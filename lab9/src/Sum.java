public class Sum implements Computation<Integer> {
    @Override
    public void  compute(Integer n, Integer m) {
        System.out.println("Sum of "+n+" and "+m+" is "+(n+m));
    }
}
