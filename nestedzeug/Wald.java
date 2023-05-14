package nestedzeug;

public class Wald {
    private String type; //must have
    private int flaeche; //opt
    private String location; // must have

    private int baumhohe;

    private boolean nachhaltig;

    private Wald(waldbuilder builder){
        type = builder.type;
        flaeche = builder.flaeche;
        location = builder.location;
        baumhohe = builder.baumhohe;
        nachhaltig = builder.nachhaltig;
    }
    //Builderklasse
    public static class waldbuilder {
        private String type;
        private int flaeche;
        private String location;
        private int baumhohe;
        private boolean nachhaltig;

        public waldbuilder(String atype, String alocation){
            type = atype;
            location = alocation;
        }
        public waldbuilder flaeche(int aflaeche){
            flaeche = aflaeche;
            return this;
        }
        public waldbuilder type(String atype){
            type = atype;
            return this;
        }
        public waldbuilder location(String alocation){
            location = alocation;
            return this;
        }
        public waldbuilder nachhaltig(boolean anachhaltig){
            nachhaltig = anachhaltig;
            return this;
        }
        public waldbuilder baumhohe(int abaumhohe){
            baumhohe = abaumhohe;
            return this;
        }
        public Wald anpflanzen() {
            return new Wald(this);
        }
    }
    @Override
    public String toString() {
        return "Wald Typ: " + type + "\n" +
                "Wald Location: " + location + "\n" +
                "Wald nachhaltig: " + nachhaltig + "\n" +
                "Wald Baumhöhe: " + baumhohe + "\n" +
                "Wald Fläche: " + flaeche;
    }
}
