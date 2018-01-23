package by.itacademy.task2;

public class LuminanceException extends Exception {
    private String russianMessage;

    public LuminanceException(String russianMessage) {
        this.russianMessage = russianMessage;
    }


    public String getRussianMessage() {
        return russianMessage;
    }
}
