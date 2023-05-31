package KlausurVorbereitung;
//Übung zu statischen eingebetteten Klassen
public class ZWEIStudent {
    //Instanzvariablen und Konstruktor äußere Klasse
    private String name;
    private double javaExperience;

    public ZWEIStudent(String name, double javaExperience){
        this.name = name;
        this.javaExperience = javaExperience;
    }
    public double getExaminationScore(double extraExperience){
        return javaExperience + extraExperience;
    }
    public double getJavaExperience() {
        return javaExperience;
    }
    static class ExtraExperience{
        //Instanzvariablen und Konstruktor innere Klasse
        private double extraHoursLearned;

        public ExtraExperience(double extraHoursLearned){
            this.extraHoursLearned = extraHoursLearned;
        }
        public double getExtraExperience(ZWEIStudent einStudent){
            return einStudent.getJavaExperience() * extraHoursLearned;
        }
    }

    public static void main(String[] args) {
        ZWEIStudent Yannick = new ZWEIStudent("Yannick", 100);
        ZWEIStudent Tessa = new ZWEIStudent("Tessa", 5);
        ZWEIStudent Lucas = new ZWEIStudent("Lucas", 10);
        ZWEIStudent.ExtraExperience nichtSoHoch = new ExtraExperience(2);
        ZWEIStudent.ExtraExperience schonSehrHoch = new ExtraExperience(50);
        System.out.println(Tessa.getExaminationScore(nichtSoHoch.getExtraExperience(Tessa)));
    }
}
