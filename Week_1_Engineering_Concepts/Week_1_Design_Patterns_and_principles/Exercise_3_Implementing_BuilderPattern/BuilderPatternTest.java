package Exercise_3_Implementing_BuilderPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer basiComputer = new Computer.Builder("Intel i3", "4GB").build();
        basiComputer.showSpecs();

        Computer gamingComputer=new Computer.Builder("Intel i7", "16GB")
        .setGraphicsCard("NVIDIA RTX 3060")
        .setStorage("1TB SSD")
        .setKeyboard("Mechanical Keyboard")
        .build();
        gamingComputer.showSpecs();

        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "8GB")
        .setStorage("512GB SSD")
        .build();
        officeComputer.showSpecs();
    }
    
}
