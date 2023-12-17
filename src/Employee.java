public class Employee {
    private final Integer id;
    private String fullName;
    private Integer salary;
    private Integer departamentId;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departamentId){
        this.id = idCounter++;
        this.fullName = fullName;
        this.departamentId = departamentId;
        this.salary = salary;
    }
    public Integer getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public Integer getSalary(){
        return salary;
    }
    public Integer getDepartamentId(){
        return departamentId;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setSalary(Integer salary){
        this.salary = salary;
    }
    public void setDepartamentId(Integer departamentId){
        this.departamentId = departamentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departamentId=" + departamentId +
                '}';
    }
}
