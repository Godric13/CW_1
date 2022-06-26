public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
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
        printAllEmployee(employees);
        minSallary(employees);
        maxSallary(employees);
        summSalary(employees);
        avergeSallary(employees);
        printAllNameEmployee(employees);

    }

    public static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void minSallary(Employee[] employees) {
        Employee a = employees[0];
        for (Employee employee : employees) {
            if (a.getSalary() < employee.getSalary()) {
                a = employee;
            }
        }
        System.out.println("Минимальная ЗП " + a.getSalary());
    }

    public static void maxSallary(Employee[] employees) {
        Employee a = employees[0];
        for (Employee employee : employees) {
            if (a.getSalary() > employee.getSalary()) {
                a = employee;
            }
        }
        System.out.println("Максимальная ЗП " + a.getSalary());
    }

    public static int summSalary(Employee[] employees) {
        int a = 0;
        for (Employee employee : employees) {
            a = a + employee.getSalary();
        }
        System.out.println("Суммарная ЗП " + a);
        return a;
    }

    public static void avergeSallary(Employee[] employees) {
        int a = summSalary(employees);
        int aveetge = a / employees.length;
        System.out.println("Средняя ЗП " + aveetge);

    }

    public static void printAllNameEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


}


