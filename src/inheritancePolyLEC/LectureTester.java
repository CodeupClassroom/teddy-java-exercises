package inheritancePolyLEC;

public class LectureTester {

    public static void main(String[] args) {

        Employee e = new Employee();
        doWork(e);

        Employee m = new Manager();
        doWork(m);

    }

    public static void doWork(Employee someObj) {
        System.out.println(someObj.work());
    }

}
