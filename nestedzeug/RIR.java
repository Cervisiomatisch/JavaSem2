package nestedzeug;

public enum RIR {
    //Regional Internet Registries
    AFRINIC("African Network Information Centre", "https://afrinic.net/"),
    ARIN("American Registry for Internet Numbers", "https://www.arin.net/"),
    APNIC("Asia-Pacific Network Information Centre", "https://www.apnic.net/"),
    LACNIC("Latin America and Caribbean Network Information Centre", "https://www.lacnic.net/R"),
    RIPENCC("RIPE Network Coordination Centre", "https://www.ripe.net/");

    private final String name;
    private final String website;

    RIR(String aname, String awebsite){
        name = aname;
        website = awebsite;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }
}
