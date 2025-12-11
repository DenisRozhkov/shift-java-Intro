package main.java.transformers;

interface Action {
    void fire();
    void charge();

    default void run() {
        System.out.println(" is running");
    }
}
