package nestedzeug;

public enum Planet {
    MERCURY (4879, 0.055, 0.5, 5),
    VENUS (12104, 0.815, 0.6, 4),
    Erde (40000, 1, 1, 3),
    NEPTUNE (49528, 17.1, 3, 2),

    MARS (30000, 0.8 , 1, 1);
    private final int diameter; // in km
    private final double mass; // in Earth masses
    private final double time; //in Jahren
    private final double daytime;
    Planet(int aDiameter, double aMass, double atime, double daytime) {
        diameter = aDiameter;
        mass = aMass;
        time = atime;
        this.daytime = daytime;
    }
    public int getDiameter() { return diameter; }
    public double getMass() { return mass; }
    public double getTime() {return time; }
    public double getDaytime() {return daytime; }
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
