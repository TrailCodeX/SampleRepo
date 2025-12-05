public class Outer {
    private String name="merin";

    //---------------------   MEMBER INNER CLASS ------------------
    class Inner{
        void show(){
            System.out.println(name);
        }
    }
    //---------------------   STATIC INNER CLASS ------------------
    static class Helper{
        void show(){
            System.out.println("Inside static nested class");
        }
    }

    //---------------------   LOCAL INNER CLASS ------------------
    void process(){
        class LocalInnerClass{
            void show(){
                System.out.println("Local Inner Class");
            }

        }
        LocalInnerClass lc=new LocalInnerClass();
        lc.show();
    }

    //---------------------   ANONYMOUS INNER CLASS ------------------
    Runnable r=new Runnable() {
        @Override
        public void run() {
            System.out.println("Running thread");
        }
    };
}
