package test5;

public class Company {
    private static Company instance = new Company();

    private Company() {

    }

    private static Company getInstance() {
        return instance;
    }
}