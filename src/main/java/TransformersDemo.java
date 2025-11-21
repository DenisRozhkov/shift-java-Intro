package main.java;

class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void fire() {
        System.out.println(name + " is firing");
    }

    public void charge() {
        System.out.println(name + " is charging");
    }

    public String getName() {
        return name;
    }
}

class Autobot extends Transformer {
    private final String teamName = "Autobots";
    private final String eyeColor = "синие";
    private boolean kindness;

    public Autobot(String name) {
        super(name);
        this.kindness = true; // по умолчанию true
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    // Сеттер для kindness
    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    // Метод трансформации
    public void transform() {
        System.out.println(name + " трансформируется в транспортное средство");
    }

    // Метод для показа всех свойств
    public void showProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Доброта: " + (kindness ? "да" : "нет"));
    }
}

// Дочерний класс Decepticon
class Decepticon extends Transformer {
    private final String teamName = "Decepticons";
    private final String eyeColor = "красные";
    private boolean kindness;

    public Decepticon(String name) {
        super(name);
        this.kindness = false; // по умолчанию false
    }

    public String getTeamName() {
        return teamName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    public void transform() {
        System.out.println(name + " трансформируется в наземный и воздушный транспорт, оружие, технику");
    }

    public void showProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Доброта: " + (kindness ? "да" : "нет"));
    }
}

// Главный класс для демонстрации
public class TransformersDemo {
    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime");
        Decepticon megatron = new Decepticon("Megatron");

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
    }
}