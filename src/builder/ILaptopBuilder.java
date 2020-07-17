package builder;

public interface ILaptopBuilder {

    ILaptopBuilder buildCpu(String cpu);
    ILaptopBuilder buildRam(String ram);
    ILaptopBuilder buildSsd(String ssd);
    ILaptopBuilder buildHhd(String hhd);

    Laptop build();
}
