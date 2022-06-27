public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("ABC", 1, 100_000);
        employees[1] = new Employee("DEF", 1, 200_000);
        employees[2] = new Employee("GHI", 2, 300_000);
        employees[3] = new Employee("JKL", 2, 400_000);
        employees[4] = new Employee("MNO", 3, 500_000);
        employees[5] = new Employee("PQR", 3, 500_000);
        employees[6] = new Employee("STU", 4, 600_000);
        employees[7] = new Employee("VWX", 4, 700_000);
        employees[8] = new Employee("YZA", 5, 900_000);
        employees[9] = new Employee("BCD", 5, 1100_000);
        printAllEmployees();
        minSallary();
        maxSallary();
        printSumSalary();
        avergeSallary();
        printAllNameEmployee();

    }

    private static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void maxSallary() {
        Employee a = employees[0];
        for (Employee employee : employees) {
            if (a.getSalary() < employee.getSalary()) {
                a = employee;
            }
        }
        System.out.println("Максимальная ЗП " + a.getSalary());
    }

    private static void minSallary() {
        Employee a = employees[0];
        for (Employee employee : employees) {
            if (a.getSalary() > employee.getSalary()) {
                a = employee;
            }
        }
        System.out.println("Минимальная ЗП " + a.getSalary());
    }

    private static int summSalary() {
        int a = 0;
        for (Employee employee : employees) {
            a = a + employee.getSalary();
        }
        return a;
    }

    private static void printSumSalary() {
        int a = summSalary();
        System.out.println("Суммарная ЗП " + a);
    }

    private static void avergeSallary() {
        double aveetge = ((double) summSalary() / employees.length);
        System.out.println("Средняя ЗП " + aveetge);
    }

    private static void printAllNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


}


