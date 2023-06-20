package nestedzeug.JavaCollections;

public enum EnumGrade {
    EINS(1.0),
    EINS_MINUS(1.3),
    ZWEI_PLUS(1.7),
    ZWEI(2.0),
    FUENF(5.0);

    private final double wert;
    EnumGrade(double aWert){
        wert = aWert;
    }
    public double getGrade(){
        return wert;
    }
    public boolean hasPassed(){
        return wert < 4.0;
    }
}
