package KlausurVorbereitung;

public class ZWEIKanguru {

    private static String name = "Tessa";
    private int große;
    public ZWEIKanguru(int eineGroße){
        große = eineGroße;
    }

    static class BabyKanguru{
        private static String land = "GERMANY";
        private int alter;

        public BabyKanguru(int einAlter){
            alter = einAlter;
        }
        public void babyKanguruMessage(){
            System.out.println("Name äußere: " + ZWEIKanguru.name);
            ZWEIKanguru obj = new ZWEIKanguru(10);
            System.out.println("große äußere: " + obj.große);
            System.out.println("innere Land: " + land);
            ZWEIKanguru.BabyKanguru einBabyK = new BabyKanguru(40);
            System.out.println("innere Alter: " + einBabyK.alter);
        }
    }

    public static void main(String[] args) {
        ZWEIKanguru.BabyKanguru inneresObj = new BabyKanguru(12);
        inneresObj.babyKanguruMessage();
    }
}
