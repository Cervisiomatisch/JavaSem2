package nestedzeug.lambdastreams;

import java.util.function.IntBinaryOperator;

public class Lambdas {
    public static void main(String[] args) {
        /*
        IntBinaryOperator dings = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return 0;
            }
        };
        */
        IntBinaryOperator mySumSquareOperator = (a, b) -> (a + b) * (a * b);
        System.out.println(mySumSquareOperator.applyAsInt(1, 2));

        //mit eigenen Interface
        TestInterface myLambdaTest;
        /*
        myLambdaTest = () -> 42;
        System.out.println(myLambdaTest.getSomething());
        myLambdaTest = () -> (int) (Math.random() * 100);
        System.out.println(myLambdaTest.getSomething());
        System.out.println(myLambdaTest.getSomething());
        //mylambdaTest = () -> "42"   //Fehler da laut schnittstelle int geliefert wird, besser mit valueOf
        */
        myLambdaTest = (a) -> (2 * a);
        System.out.println(myLambdaTest.getSomething(3));
        myLambdaTest = (a) -> {
                int result = 1;
                for (int i = 1; i <= a; i++) {
                    result = i * result;
                }
                return result;
        };
        System.out.println(myLambdaTest.getSomething(3));

    }
}
