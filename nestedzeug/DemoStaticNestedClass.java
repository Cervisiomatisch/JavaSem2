package nestedzeug;

public class DemoStaticNestedClass {
    //äußer Klasse
    private int enclosingValue = 1;
    private static int enclosingStaticValue = 2;
    private static int sameName = 5;

    static class StaticNestedClass {
        //innere Klasse
        private int staticNestedValue = 3;
        private static int staticNestedStaticValue = 4;
        private static int sameName = 6;
        public void staticNestedClassMessage(){
            System.out.println("Innere Methode antwortet!");
            System.out.println("Das ist static Value of äußere Class: " + enclosingStaticValue);
            DemoStaticNestedClass test = new DemoStaticNestedClass();
            System.out.println("Zugriff auf keine statischen Variablen durch objekt: " + test.enclosingValue);
            System.out.println("Same Name Value: " + DemoStaticNestedClass.sameName);
            //Klasseneigene Variablen
            System.out.println("Für innere Methoden:");
            System.out.println("staticNestedValue: " + staticNestedValue);
            System.out.println("staticNestedStaticValue: " + staticNestedStaticValue);
            System.out.println("Same Name Value: " + sameName);
        }
    }

    public static void main(String[] args) {
        DemoStaticNestedClass.StaticNestedClass testNestedObject = new DemoStaticNestedClass.StaticNestedClass();
        testNestedObject.staticNestedClassMessage();
    }
}
