package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();

        manager.createPatients();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to swtich between:\n1.Show all patients." +
                "\n2.Search a patient by his name.\n3.Search a patient by his age");
        int switchCommand = sc.nextInt();
        switch(switchCommand) {
            case 1: {
                Patient[] pArr = manager.getPatients();
                if(pArr != null) {
                    for (int i = 0; i < pArr.length; i++) {
                        System.out.println("Patient - " + pArr[i].getName() + ", age - " + pArr[i].getAge());
                    }
                } else {
                    System.out.println("In the hospital no one patient.");
                }
                break;
            }
            case 2: {

                break;
            }
            case 3: {

                break;
            }
            default: {

                break;
            }
        }

    }
}
