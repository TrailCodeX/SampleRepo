public class FinaliseUsage {
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Overriden");
    }
    public static void main(String[] args)throws Throwable{


    }
}
