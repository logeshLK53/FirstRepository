package CollectionsFramework.EmployeeManagement;

public class Employee {
    int id;
    String name;
    int age;
    String role;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Employee(int id, String name, int age, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
    }
    @Override
    public String toString() {
        return "Employee [ id=" + id + ", name=" + name + ", age=" + age+" role=" + role  + "]";
    }
}
