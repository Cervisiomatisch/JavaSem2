package nestedzeug;

public class DemoLocalInnerClass {
    public void enclosingMethod () {
        System.out.println("Inside outer Method");
        class LocalClass {
            void localClassDemoMethod () {
                System.out.println("Inside local inner Method");
            }
            private int testNumber;
            private static int statNumber;
            public LocalClass () {
                testNumber = 7;
                statNumber = 8;
            }
            void localClassDemoMethod1() {
                System.out.println("Konstruktor Variable:" + testNumber +", Static:"+ statNumber);
            }
        }
        LocalClass myLocalObject = new LocalClass();
        myLocalObject.localClassDemoMethod();
        myLocalObject.localClassDemoMethod1();
        }

    public static void main(String[] args) {
        DemoLocalInnerClass testEnclosingObject = new DemoLocalInnerClass();
        testEnclosingObject.enclosingMethod();
    }
}
