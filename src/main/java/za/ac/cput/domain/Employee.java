package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    private String employeeCode;
    @Id
    private int id;
    private String firstName;
    private String lastName;

    //Constructors
    public Employee() {
    }
    public Employee(String employeeCode, int id, String firstName, String lastName) {
        this.employeeCode = employeeCode;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //private Builder Constructors
    private Employee(Builder builder){
        this.employeeCode = builder. employeeCode;
        this.id = builder. id;
        this.firstName = builder. firstName;
        this.lastName = builder. lastName;
    }

    //Getters
    public String getEmployeeCode() {
        return employeeCode;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Builder Constructors
    public static class Builder {
        private String employeeCode;
        private int id;
        private String firstName;
        private String lastName;

        //Builder Setters
        public Builder setEmployeeCode(String employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }
        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee employee){
            this.employeeCode = employee.employeeCode;
            this.id= employee.id;
            this.firstName = employee.firstName;
            this.lastName= employee.lastName;
            return this;
        }

        public Employee build(){return  new Employee(this);}
    }
}
