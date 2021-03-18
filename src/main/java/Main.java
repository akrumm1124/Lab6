/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee ("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee ("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee ("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println("Name: " +employee1.getName() + "; ID num: " + employee1.getIdNumber() + "; Department: " + employee1.getDepartment() + "; Position: " + employee1.getPosition());
        System.out.println("Name: " +employee2.getName() + "; ID num: " + employee2.getIdNumber() + "; Department: " + employee2.getDepartment() + "; Position: " + employee2.getPosition());
        System.out.println("Name: " +employee3.getName() + "; ID num: " + employee3.getIdNumber() + "; Department: " + employee3.getDepartment() + "; Position: " + employee3.getPosition());
        //this comment is here because im testing git
    }
}
