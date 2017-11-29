package Hospital;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HospitalManager {
    private Patient[] patients = null;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public Patient[] createPatients() {
        int size = 3;
        patients = new Patient[size];

        System.out.println("Write down patient info:");
        for (int i = 0; i < size; i++) {
            patients[i] = new Patient();
            try {
                System.out.println("Write patient " + (i + 1) + " age: ");
                patients[i].setAge(addAge());
            } catch (Exception ex) {
            }
            try {
                System.out.println("Write patient " + (i + 1) + " name: ");
                patients[i].setName(addName());
            } catch (Exception ex) {
            }
        }
        return patients;
    }

    private int addAge() {
        int inputInt = 0;
        try {
            inputInt = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception ex) {

        }
        return inputInt;
    }

    private String addName() {
        String inputString = null;
        try {
            inputString = bufferedReader.readLine();
        } catch (Exception ex) {

        }
        return inputString;
    }

    public void hospitalMenu() {
        try {
            while (true) {
                System.out.println("\nEnter a num to swtich between:\n1. Show all patients." +
                        "\n2. Search a patient by his name.\n3. Search a patient by his age.\nEnter anything else to exit.\n");
                int switchCommand = Integer.parseInt(bufferedReader.readLine());
                switch (switchCommand) {
                    case 1: {
                        Patient[] pArr = getPatients();
                        if (pArr != null) {
                            for (int i = 0; i < pArr.length; i++) {
                                System.out.println("Patient name - " + pArr[i].getName() + ", age - " + pArr[i].getAge());
                            }
                        } else {
                            System.out.println("In the hospital no one patient.");
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("Searching the patient by name... (write down name)");
                        Patient[] arr = searchByName(bufferedReader.readLine());
                        if (arr.length > 0) {
                            for (Patient patient : arr) {
                                System.out.println("Patient that we found: " + patient.getName());
                            }
                        } else {
                            System.out.println("Try to check another name.");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Searching the patient by age... (write down age)");
                        int testData = Integer.parseInt(bufferedReader.readLine());
                        Patient[] arr = searchByAge(testData);
                        if (arr.length > 0) {
                            for (Patient patient : arr) {
                                System.out.println("Patient that we found: " + patient.getName() + ", age: " + patient.getAge());
                            }
                        } else {
                            System.out.println("Try to check another age group.");
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    private Patient[] searchByName(String name) {
        Patient[] search = new Patient[patients.length];
        int i = 0;
        for (Patient patient : patients) {
            if (patient.getName().toLowerCase().contains(name.toLowerCase())) {
                search[i] = patient;
                i++;
            }
        }
        Patient[] searchFinalName = new Patient[i];
        System.arraycopy(search, 0, searchFinalName, 0, i);
        return searchFinalName;
    }

    private Patient[] searchByAge(int age) {
        Patient[] search = new Patient[patients.length];
        int i = 0;
        for (Patient patient : patients) {
            if (patient.getAge() == age) {
                search[i] = patient;
                i++;
            }
        }
        Patient[] searchFinalAge = new Patient[i];
        System.arraycopy(search, 0, searchFinalAge, 0, i);
        return searchFinalAge;
    }

    private void printPatientArray() {
        for (Patient patient : patients) {
            System.out.println("Patient name - " + patient.getName() + ", age - " + patient.getAge());
        }
    }

    public Patient[] getPatients() {
        return patients;
    }
}
