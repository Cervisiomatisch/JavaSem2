package ObjektLang;

public class ObjectMethodTest {

    public static void main(String[] args) {
        Circus fun = new Circus("JavaFun", 1);
        Circus great = new Circus("JavaFun", 1);
        SpecialCircus greatWithFlag = new SpecialCircus("JavaFun", 1, true);
        Clown myClown = new Clown("me", 10, new Circus("JavaFun", 1));
        System.out.println(fun);
        System.out.println(great);
        System.out.println(greatWithFlag);
        System.out.println(myClown);
        // Ausgabe ohne Override toString()
        /*
        ObjektLang.Circus@5ca881b5
        ObjektLang.Circus@24d46ca6
        ObjektLang.SpecialCircus@4517d9a3
        ObjektLang.Clown@372f7a8d
         */
        // Ausgabe mit Override toString()
        /*
        Circus{name='JavaFun', id=1}
        Circus{name='JavaFun', id=1}
        SpecialCircus{hasFlag=true}
        Clown{name='me', laughFactor=10, circus=Circus{name='JavaFun', id=1}}
         */
        System.out.println(fun.equals(great));
        System.out.println(great.equals(fun));
        System.out.println(greatWithFlag.equals(great));
        System.out.println(great.equals(greatWithFlag));
        //Ausgabe ohne Override equals()
        /*
        false
        false
        false
        false
         */
        // Ausgabe mit Override equals()
        /*
        true
        true
        false
        false
         */
        Clown myClownNr2 = null;
        try {
            myClownNr2 = (Clown) myClown.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(myClownNr2);
        myClownNr2.setName("Jonas");
        myClownNr2.setLaughFactor(-999);
        myClownNr2.getCircus().setId(69);
        System.out.println("original " + myClown);
        System.out.println("der Klon " + myClownNr2);

    }
}
