package Hospital;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HospitalManager {
    private Patient[] patients = null;

    public Patient[] createPatients() {
        int size = 3;
        patients = new Patient[size];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write down patient info:");
        for (int i = 0; i < size; i++) {
            patients[i] = new Patient();
            try {
                System.out.println("Write patient " + (i + 1) + " age: ");
                patients[i].setAge(Integer.parseInt(bufferedReader.readLine()));
            } catch (Exception ex) {
                //System.out.println(ex.getMessage());
            }
            try {
                System.out.println("Write patient " + (i + 1) + " name: ");
                patients[i].setName(bufferedReader.readLine());
            } catch (Exception ex) {
                //System.out.println(ex.getMessage());
            }
        }
        return patients;
    }

    public Patient[] getPatients() {
        return patients;
    }
}
