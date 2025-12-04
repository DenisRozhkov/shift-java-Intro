package main.java.transformers;

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
}
