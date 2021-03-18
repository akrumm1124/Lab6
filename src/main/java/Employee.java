/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Employee {
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   public Employee() {
       name = "";
       idNumber = 0;
       department = "";
       position = "";
   }
   
   public Employee(String employeeName, int id, String dpt, String pstn) {
       name = employeeName;
       idNumber = id;
       department = dpt;
       position = pstn;
   }
   
   public Employee(String empName, int empID) {
       name = empName;
       idNumber = empID;
       department = "";
       position = "";
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    //this comment is also here to test git
}
