package nestedzeug;

public class Student {
    private String name;
    private double javaExperience;

    public double getExaminationScore(double extraExperience){
        return extraExperience + javaExperience;
    }
    public double getJavaExperience() {
        return javaExperience;
    }
    public static class ExtraExperience {
        private double extraHoursLearned;
        public double getExtraExperience (Student student){
            return extraHoursLearned * student.getJavaExperience();
        }
    }

    public static void main(String[] args) {
        Student schlauerStudent = new Student();
        //Student.ExtraExperience lessons = schlauerStudent.new ExtraExperience();
        schlauerStudent.name = "Lucas";
        schlauerStudent.javaExperience = 10.0;
        System.out.println("Get Examination Score: " + schlauerStudent.getExaminationScore(5.0));
    }
}
