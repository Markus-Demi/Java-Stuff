package Hospital;

public class Main {
    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();
        manager.createPatients();
        manager.hospitalMenu();
    }
}
