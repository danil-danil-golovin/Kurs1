public class Main {
    public static void main(String[] args) {
        printEmployees();
        System.out.println();
        System.out.println("Затраты на зп в месяц " + calculateTotalSalary());
        System.out.println("Минимальная зп " + minSalarry());
        System.out.println("Максимальная зп " + MaxSalary());
        System.out.println("Средняя зп " + averageSalary());
        System.out.println();
        fullName();
    }
    private static final Employee[] employees ={
            new Employee("Иванов Иван Иванович", 100, 1),
            new Employee("Сергеев Сергей Сергеевич", 200, 2),
            new Employee("Петров Петр Петрович", 120, 3),
            new Employee("Алексеев Алексей Алексеевич", 130, 4),
            new Employee("Петрова Ангелина Сергеевна", 140, 5),
            new Employee("Иванова Светлана Михайловна", 150, 2),
            new Employee("Максимов Максим Максимович", 110, 2),
            new Employee("Сидорова Алена Сергеевна", 115, 3),
            new Employee("Емельянова Ирина Александровна", 125, 4),
            new Employee("Сергеева Дарья Вениаминовна", 160, 5)
    };

    public static void printEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary(){
        int sum = 0;
        for(Employee employee:employees){
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee minSalarry(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee:employees){
            if (employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;

    }
    public static Employee MaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee:employees){
            if (employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float averageSalary(){
        return calculateTotalSalary()/(float) employees.length;
    }
    public static void fullName(){
        for (Employee employee:employees){
            System.out.println(employee.getFullName());
        }
    }
}