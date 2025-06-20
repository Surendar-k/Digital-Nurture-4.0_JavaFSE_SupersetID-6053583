package Exercise_3_Implementing_BuilderPattern;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String keyboard;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.keyboard=builder.keyboard;

    }

    public String getCpu(){
        return cpu;
    }
    public String getRam(){
        return ram;
    }
    public String getStorage(){
        return storage;
    }
    public String getGraphicsCard(){
        return graphicsCard;
    }
    public String getKeyboard(){
        return keyboard;
    }

    public void showSpecs(){
        System.out.println("CPU: "+cpu);
         System.out.println("RAM: " + ram);
        System.out.println("Storage: " + (storage != null ? storage : "N/A"));
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "N/A"));
        System.out.println("Keyboard: " + (keyboard != null ? keyboard : "N/A"));
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String keyboard;

        public Builder(String cpu, String ram){
            this.cpu=cpu;
            this.ram=ram;
        }
        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }
         public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
    
}
