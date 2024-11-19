
public class Demo {
    public static void main(String[] args) {
        Workable employee = new Employee();
        employee.work();

        Eatable eatableEmployee = (Eatable) employee;
        eatableEmployee.eat();

        Sleepable sleepableEmployee = (Sleepable) employee;
        sleepableEmployee.sleep();

        Workable robot = new Robot();
        robot.work();
    }
}