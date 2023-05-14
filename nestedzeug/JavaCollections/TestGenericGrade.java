package nestedzeug.JavaCollections;

public class TestGenericGrade {
    public static void main(String[] args) {
        genericGrade<Double> germanGrade = new genericGrade<>();
        germanGrade.setValue(1.3);
        genericGrade<Character> swedishGrade = new genericGrade<>();
        swedishGrade.setValue('A');
        //Rohtyp verwenden
        genericGrade oldGrade = new genericGrade(); //Soll man aber nicht machen

        //Mit Enum verwenden
        genericGrade<EnumGrade> neueGrade = new genericGrade<>();
        neueGrade.setValue(EnumGrade.EINS_MINUS);
        System.out.println(neueGrade.getValue().getGrade());

        //Generische Methode aufrufen
        testGenericMethod(12);

        //ersteNote
        genericGrade<EnumGrade> ersteNote = new genericGrade<>();
        genericGrade<EnumGrade> zweiteNote = new genericGrade<>();
        ersteNote.setValue(EnumGrade.EINS);
        zweiteNote.setValue(EnumGrade.ZWEI);
        System.out.println(ersteNote.getValue().compareTo(zweiteNote.getValue()));
        System.out.println(ersteNote.compareGrades(zweiteNote.getValue()));
        zweiteNote.setValue(EnumGrade.EINS);
        System.out.println(ersteNote.compareGrades(zweiteNote.getValue()));

    }
    public static <E> void testGenericMethod(E element){
        System.out.println(element.getClass().getName() + " = " + element);
    }
}
