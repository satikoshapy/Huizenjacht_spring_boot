package be.pxl.huizenjacht;

public class House {

    private String code;
    private String name;
    private Status status;
    private String city;
    private double price;

    public House(String code, String name, Status status, String city, double price) {
        this.code = code;
        this.name = name;
        this.status = status;
        this.city = city;
        this.price = price;
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
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString(){
        return "House{"+
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name +'\'' +
                ", city='" +city + '\'' +
                ", price=" + price +
                '}';
    }
}
