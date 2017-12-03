package by.itacademy.task2;

public abstract class ATM implements BankName {
    public abstract void showMoney();

    @Override
    public String bankName(String name) {
        return name;
    }
}
