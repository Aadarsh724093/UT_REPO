public class Employer {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employer(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Display Employer details
    @Override
    public String toString() {
        return "Employer{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }
}

