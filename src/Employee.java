public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private int id;
    private static int counter;


    public Employee(String fullName, int department, int salary) {
        this.id = id++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + " ФИО: " + fullName + " Отдел: " + department + " ЗП: " + salary;
    }

}
