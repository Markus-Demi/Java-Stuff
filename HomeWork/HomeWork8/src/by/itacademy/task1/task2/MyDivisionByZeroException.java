package by.itacademy.task1.task2;

public class MyDivisionByZeroException extends Exception {
    private String getExcMessage;

    public MyDivisionByZeroException(String getExcMessage) {
        this.getExcMessage = getExcMessage;
    }

    public String getRusMessage() {
        return getExcMessage;
    }
}
