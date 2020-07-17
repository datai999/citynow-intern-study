package builder;

public class LaptopBuilder implements ILaptopBuilder {

    private String cpu;
    private String ram;
    private String ssd;
    private String hhd;

    @Override
    public ILaptopBuilder buildCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ILaptopBuilder buildRam(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ILaptopBuilder buildSsd(String ssd) {
        this.ssd = ssd;
        return this;
    }

    @Override
    public ILaptopBuilder buildHhd(String hhd) {
        this.hhd = hhd;
        return this;
    }

    @Override
    public Laptop build() {
        return new Laptop(cpu, ram, ssd, hhd);
    }
}
