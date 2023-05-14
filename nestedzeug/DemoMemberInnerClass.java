package nestedzeug;

public class DemoMemberInnerClass {
    private int enclosingValue = 1;
    private static int StaticEnclosingValue = 2;
    public class MemberClass {
        private int innerClassValue = 3;
        private static int StaticInnerClassValue = 4;

        public void memberClassMessage() {
            System.out.println("Hier ist MemberClass");
            System.out.println("Access to value of enclosing Class:");
            System.out.println("enclosingValue: " + enclosingValue);
            System.out.println("StaticEnclosingValue: " + +StaticEnclosingValue);
            System.out.println("Access to value of member Class:");
            System.out.println("innerClassValue:" + innerClassValue);
            System.out.println("StatucInnerClassValue:" + StaticInnerClassValue);
        }
    }
        public class Safe {
            private static int numberOfSafes = 0;
            public static void Staticausgabe(){
                System.out.println("numberOfSafes:" + numberOfSafes);
        }
    }
    public static void main(String[] args) {
        DemoMemberInnerClass testEnclsoingObject = new DemoMemberInnerClass();
        DemoMemberInnerClass.MemberClass testMemberObject = testEnclsoingObject.new MemberClass();
        testMemberObject.memberClassMessage();
        System.out.println(Safe.numberOfSafes);
    }
}
