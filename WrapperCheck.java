public class WrapperCheck {
    public static void main(String[] args){
        Integer i=200;
        Integer j=200;
        Long l=200L;                //Long Objects
        Long k=200L;
        long m=200;
        long n=200;

        System.out.println(i==j);               //false -126 to 127
        System.out.println(i.equals(j));        //true as compares reference


        System.out.println(l==k);
        System.out.println(l.equals(k));


        System.out.println(m==n);

        //System.out.println(m.equals(n));      ------------doesn't work because it comes under primitive

    }
}
