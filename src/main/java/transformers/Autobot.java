package main.java.transformers;


class Autobot extends Transformer implements Action {
    private static final String TEAM_NAME = "Autobots";
    private static final String EYE_COLOR = "синие";
    private boolean kindness;

    public Autobot(String name) {
        super(name);
        this.kindness = true;
    }

    public static String getTeamName() {
        return TEAM_NAME;
    }

    public static String getEyeColor() {
        return EYE_COLOR;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в транспортное средство");
    }

    @Override
    public void fire() {
        System.out.println(name + " is firing");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging");
    }

    public void showProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + TEAM_NAME);
        System.out.println("Цвет глаз: " + EYE_COLOR);
        System.out.println("Доброта: " + (kindness ? "да" : "нет"));
    }
}