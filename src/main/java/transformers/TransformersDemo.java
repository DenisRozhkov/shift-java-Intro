package main.java.transformers;

public class TransformersDemo {
    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime");
       Decepticon megatron = new Decepticon("Megatron");

        megatron.setTransformationForm("воздушный транспорт");

        System.out.println("=== Autobot Actions ===");
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();

        System.out.println("\n=== Autobot Properties ===");
        optimus.showProperties();

        System.out.println("\n=== Decepticon Actions ===");
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();

        System.out.println("\n=== Decepticon Properties ===");
        megatron.showProperties();

        System.out.println("\n=== Смена формы трансформации ===");
        megatron.setTransformationForm("оружие");
        megatron.transform();
    }
}