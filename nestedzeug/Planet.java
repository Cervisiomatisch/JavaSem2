package nestedzeug;

public enum Planet {
    MERCURY (4879, 0.055, 0.5),
    VENUS (12104, 0.815, 0.6),
    Erde (40000, 1, 1),
    NEPTUNE (49528, 17.1, 3);
    private final int diameter; // in km
    private final double mass; // in Earth masses
    private final double time; //in Jahren
    Planet(int aDiameter, double aMass, double atime) {
        diameter = aDiameter;
        mass = aMass;
        time = atime;
    }
    public int getDiameter() { return diameter; }
    public double getMass() { return mass; }
    public double getTime() {return time; }
    // surface area (km2)
    public double surfaceArea() {
        return Math.PI *diameter * diameter;
    }
    // Kepler's Constant (s3 / m3)
    public static final double K =2.97E-19;
    // volumen
    public double volumen(){
        return (4.0 / 3.0) * Math.PI * diameter * diameter * diameter;
    }
}
