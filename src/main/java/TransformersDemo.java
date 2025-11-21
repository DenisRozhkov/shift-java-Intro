package main.java;

 class transformer {
}
// Базовый класс Transformer
class Transformer {
    protected String name;

    // Конструктор
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

    // Геттер для имени
    public String getName() {
        return name;
    }
}

// Дочерний класс Autobot
class Autobot extends Transformer {
    private final String teamName = "Autobots";
    private final String eyeColor = "синие";
    private boolean kindness;

    // Конструктор
    public Autobot(String name) {
        super(name);
        this.kindness = true; // по умолчанию true
    }

    // Геттеры для свойств
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

    // Конструктор
    public Decepticon(String name) {
        super(name);
        this.kindness = false; // по умолчанию false
    }

    // Геттеры для свойств
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
        System.out.println(name + " трансформируется в наземный и воздушный транспорт, оружие, технику");
    }

    // Метод для показа всех свойств
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
        // Создаем трансформеров
        Autobot optimus = new Autobot("Optimus Prime");
        Decepticon megatron = new Decepticon("Megatron");

        System.out.println("=== Autobot Actions ===");
        // Действия Autobot
        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();

        System.out.println("\n=== Autobot Properties ===");
        optimus.showProperties();

        System.out.println("\n=== Decepticon Actions ===");
        // Действия Decepticon
        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();

        System.out.println("\n=== Decepticon Properties ===");
        megatron.showProperties();

        // Демонстрация изменения свойства kindness
        System.out.println("\n=== Изменение свойств ===");
        optimus.setKindness(false);
        megatron.setKindness(true);

        System.out.println("После изменения:");
        System.out.println(optimus.getName() + " доброта: " + optimus.isKindness());
        System.out.println(megatron.getName() + " доброта: " + megatron.isKindness());
    }
}