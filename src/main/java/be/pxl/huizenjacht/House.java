package be.pxl.huizenjacht;

public class House {

    private String code;
    private String name;
    private Status status;
    private String city;
    private double squareMeters;
    private EPCScore EPCScore;
    private final double basePricePerSqrM = 2356.75;

    public House(String code, String name, double area, EPCScore score, String city) {
        this.code = code;
        this.name = name;
        this.squareMeters = area;
        this.EPCScore = score;
        this.city = city;
        this.status = Status.FOR_SALE;

    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public EPCScore getEPCScore() {
        return EPCScore;
    }

    public double getBasePricePerSqrM() {
        return basePricePerSqrM;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        double price = basePricePerSqrM * squareMeters;
        if (city.equals("Hasselt") || city.equals("Genk")){
            return price * 1.25;
        }
        return price;
    }

    public void setSquareMeters(double squareMeters) {
        if (squareMeters >= 50){
            this.squareMeters = squareMeters;
        }

    }

    public void setEPCScore(be.pxl.huizenjacht.EPCScore EPCScore) {
        this.EPCScore = EPCScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void markAsSold() throws IllegalAccessException {
        if (getStatus() == Status.FOR_SALE){
            setStatus(Status.SOLD);
        }
        else {
            throw new IllegalAccessException("the house is already sold");
        }
    }



    @Override
    public String toString(){
        return "House{"+
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name +'\'' +
                ", city='" +city + '\'' +
                '}';
    }
}
