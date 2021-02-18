package Behavior;

import java.util.ArrayList;
import java.util.Scanner;

import Entity.Employee;

public class EmployeeManagement {
      ArrayList<Employee> employeeList = new ArrayList<>();
      Scanner sc = new Scanner(System.in);

      public void addEmployee() {
            System.out.println("Nhap ten nhan vien");
            String employeeName = sc.nextLine();
            System.out.println("Nhap ngay sinh nhan vien");
            String employeeDoB = sc.nextLine();
            System.out.println("Nhap gioi tinh nhan vien (Male / Female)");
            String employeeGender = sc.nextLine();
            Employee newEmployee = new Employee(employeeName, employeeDoB, employeeGender);
            employeeList.add(newEmployee);
            System.out.println("Employee added successfully");
      }

      public void showAllEmployee() {
            if (employeeList.size() == 0) {
                  System.out.println("Khong co nhan vien nao");
            }
            for (Employee e : employeeList) {
                  System.out.println(e.toString());
            }
      }

      public void deleteEmployee() {
            System.out.println("Nhap ten nhan vien can xoa");
            String employeeNameToRemove = sc.nextLine();
            int removeCount = 0;
            for (int i = 0; i < employeeList.size(); i++) {
                  if (employeeList.get(i).getFullName().equals(employeeNameToRemove)) {
                        employeeList.remove(i);
                        removeCount++;
                  }
            }
            if (removeCount == 0) {
                  System.out.println("Khong tim thay nhan vien can xoa");
            }
            else {
                  System.out.println("Da xoa thanh cong nhan vien");
            }
      }

      public void updateEmployee() {
            System.out.println("Nhap ten nhan vien can thay doi thong tin");
            String employeeNameToChangeInfo = sc.nextLine();
            int changeCount = 0;

            for (Employee e : employeeList) {
                  if (e.getFullName().equals(employeeNameToChangeInfo)) {
                        System.out.println("Nhap ten moi");
                        String newName = sc.nextLine();
                        System.out.println("Nhap ngay sinh moi");
                        String newDoB = sc.nextLine();
                        System.out.println("Nhap gioi tinh moi");
                        String newGender = sc.nextLine();
                        e.setFullName(newName);
                        e.setGender(newGender);
                        e.setDateofBirth(newDoB);
                        changeCount++;
                  } 
            }

            if (changeCount == 0) {
                  System.out.println("Khong co nhan vien duoc tim thay");
            }
            else {
                  System.out.println("Sua thong tin nhan vien thanh cong");
            }
      }

}
