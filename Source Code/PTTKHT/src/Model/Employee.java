/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Employee extends Person implements Serializable{

    private String empId;
    private String position;

    public Employee() {
    }

    public Employee(String empId, String position) {
        this.empId = empId;
        this.position = position;
    }

    public Employee(String empId, String position, String fullName,
            String address, Date dob, String numberId, String phoneNumber) {
        super(fullName, address, dob, numberId, phoneNumber);
        this.empId = empId;
        this.position = position;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
