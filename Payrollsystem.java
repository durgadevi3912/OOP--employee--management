// Base Employee class
class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return 0.0;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + calculateSalary());
    }
}

// Full-time emp
