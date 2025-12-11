package main.java.transformers;

class Decepticon extends Transformer implements Action {
    private static final String TEAM_NAME = "Decepticons";
    private static final String EYE_COLOR = "красные";
    private boolean kindness;
    private String transformationForm;

    public Decepticon(String name) {
        super(name);
        this.kindness = false;
        this.transformationForm = "наземный транспорт";
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

    public void setTransformationForm(String form) {
        this.transformationForm = form;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в " + transformationForm);
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
        System.out.println("Форма трансформации: " + transformationForm);
    }
}