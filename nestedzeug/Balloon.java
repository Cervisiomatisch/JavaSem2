package nestedzeug;

public class Balloon {
    private String type; //benoetigt
    private String manufacturer; //optional
    private double payload; //optional
    private String color;
    private int price;

    private Balloon(BalloonBuilder builder) {
        type = builder.type;
        manufacturer = builder.manufacturer;
        color = builder.color;
        price = builder.price;
    }
    public static class BalloonBuilder {
        private String type; //benoetigt
        private String manufacturer; // optional (null)
        private double payload;// optional (0)
        private String color;
        private int price;

        public BalloonBuilder(String aType) {
            type = aType; //benoetigte Werte sind Pflicht
        }
        public BalloonBuilder manufacturer(String aManufacturer) {
            manufacturer = aManufacturer; //optionalen Wert über Methode
        return this;
        }
        public BalloonBuilder payload(double aPayload) {
            payload = aPayload; //optionalen Wert über Methode
            return this;
        }
        public BalloonBuilder color(String aColor){
            color = aColor;
            return this;
        }
        public BalloonBuilder price(int aPrice){
            price = aPrice;
            return this;
        }
        public Balloon build() {
            return new Balloon(this);
        }
    }
}

