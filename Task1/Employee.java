package Task1;

public class Employee {

    private int id;
    private String firstNmae;
    private String lastName;
    private int salary;

    public Employee(int id, String firstNmae, String lastName, int salary) {
        this.id = id;
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return (firstNmae + " " + lastName);
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        return salary*=percent;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 19 * result + firstNmae.hashCode();
        result = 19 * result + id;
        result = 19 * result + lastName.hashCode();
        result = 19 * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;
        return employee.id == id && employee.firstNmae.equals(firstNmae) &&
                employee.lastName.equals(lastName) && employee.salary == salary;
    }

    @Override
    public String toString() {
        return ("id = " + id + " name = " + firstNmae + " " + lastName + " salary = " + salary);
    }
}