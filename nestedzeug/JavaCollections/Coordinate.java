package nestedzeug.JavaCollections;

public class Coordinate<X extends Number, Y extends Number> {
    //Platzhalter
    private X xCoordinate;
    private Y yCoordinate;

    //Konstruktor
    public Coordinate(){
        xCoordinate = null;
        yCoordinate = null;
    }
    public Coordinate(X xKoordinate, Y yKoordinate){
        xCoordinate = xKoordinate;
        yCoordinate = yKoordinate;
    }

    //getter und setter
    public X getxCoordinate(){
        return xCoordinate;
    }
    public Y getyCoordinate() {
        return yCoordinate;
    }
    public void setxCoordinate(X xKoordinaten) {
        xCoordinate = xKoordinaten;
    }
    public void setyCoordinate(Y yKoordinaten) {
        yCoordinate = yKoordinaten;
    }
    public void copyFrom(Coordinate<? extends X, ? extends Y> coordinate){
        //coordinate.setxCoordinate(xCoordinate);
        //coordinate.setyCoordinate(yCoordinate);
    }

}
