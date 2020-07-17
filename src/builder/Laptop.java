package builder;

public class Laptop {
    private String cpu;
    private String ram;
    private String ssd;
    private String hhd;

    public Laptop(String cpu, String ram, String ssd, String hhd) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.hhd = hhd;
    }

    @Override
    public String toString(){
        return "Laptop [cpu:" + cpu + ",ram:" + ram + ",ssd:" + ssd + ",hhd:" + hhd + "]";
    }
}
