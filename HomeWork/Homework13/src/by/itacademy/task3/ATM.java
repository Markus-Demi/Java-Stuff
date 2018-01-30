package by.itacademy.task3;

public class ATM {
    private int count20 = 0, count50 = 0, count100 = 0;

    public int get20() {
        return count20;
    }

    public void set20(int count20) {
        this.count20 = count20;
    }

    public int get50() {
        return count50;
    }

    public void set50(int count50) {
        this.count50 = count50;
    }

    public int get100() {
        return count100;
    }

    public void set100(int count100) {
        this.count100 = count100;
    }

    public void put(int quantityMoney) {
        if (quantityMoney / 100 != 0) {
            count100 += quantityMoney / 100;
        }
        if ((quantityMoney % 100) % 50 == 0 && quantityMoney % 100 != 0) {
            count50++;
        }
        if ((quantityMoney % 100) % 20 == 0 && quantityMoney % 100 != 0) {
            count20 += (quantityMoney % 100) / 20;
        }
        if (((quantityMoney % 100) - 50) % 20 == 0 && ((quantityMoney % 100) - 50) != 0) {
            count50++;
            count20 += ((quantityMoney % 100) - 50) / 20;
        }
    }

    public void withdraw(int quantityMoney) {
        if (quantityMoney / 100 != 0) {
            count100 -= quantityMoney / 100;
            System.out.println("denomination 100 - " + quantityMoney / 100);
        }
        if ((quantityMoney % 100) % 50 == 0 && quantityMoney % 100 != 0) {
            count50--;
            System.out.println("denomination 50 - " + 1);
        }
        if ((quantityMoney % 100) % 20 == 0 && quantityMoney % 100 != 0) {
            count20 -= (quantityMoney % 100) / 20;
            System.out.println("denomination 20 - " + (quantityMoney % 100) / 20);
        }
        if (((quantityMoney % 100) - 50) % 20 == 0 && ((quantityMoney % 100) - 50) != 0) {
            count50--;
            count20 -= ((quantityMoney % 100) - 50) / 20;
            System.out.println("denomination 50 - " + 1);
            System.out.println("denomination 20 - " + ((quantityMoney % 100) - 50) / 20);
        }
    }
}
