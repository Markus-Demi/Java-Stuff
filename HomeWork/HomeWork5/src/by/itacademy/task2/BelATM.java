package by.itacademy.task2;

public class BelATM implements ATM {
    private int hundreds;
    private int fifties;
    private int twenties;

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public int getTwenties() {
        return twenties;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    @Override
    public void putCash(int cash) {
        if (cash >= 20) {

            if (cash / 100 != 0) {
                hundreds += cash / 100;
            }
            if ((cash % 100) % 50 == 0) {
                fifties += (cash % 100) / 50;
            }
            if ((cash % 100) % 20 == 0) {
                twenties += (cash % 100) / 20;
            }
            if (((cash % 100) - 50) % 20 == 0 && ((cash % 100) - 50) != 0) {
                fifties++;
                twenties += ((cash  % 100) - 50) / 20;
            }
            System.out.println("100 - " + hundreds + ".\n50 - " +
                    fifties + ".\n20 - " + twenties);

        } else {
            System.out.println("20, 50 ,100 are only accepted banknotes.");
        }
    }

    @Override
    public void outCash(int cash) {
        if (cash / 100 != 0) {
            hundreds -= cash / 100;
            System.out.println("100 - " + cash / 100);
        }
        if ((cash % 100) % 50 == 0) {
            fifties--;
            System.out.println("50 - " + 1);
        }
        if ((cash % 100) % 20 == 0) {
            twenties -= (cash % 100) / 20;
            System.out.println("20 - " + (cash % 100) / 20);
        }
        if (((cash % 100) - 50) % 20 == 0 && ((cash % 100) - 50) != 0) {
            fifties--;
            twenties -= ((cash % 100) - 50) / 20;
            System.out.println("50 - " + 1);
            System.out.println("20 - " + ((cash % 100) - 50) / 20);
        }
    }

    @Override
    public void showMoney() {
        System.out.println("100 - " + hundreds + ".\n50 - " +
                fifties + ".\n20 - " + twenties);
    }
}
