package View;

import java.util.Scanner;

import Behavior.EmployeeManagement;

public class Main {
      static Scanner sc = new Scanner(System.in);
      static EmployeeManagement em = new EmployeeManagement();

      public static void showMenu() {


            boolean condition = true;
            while (condition) {
                  System.out.println("Please select the option");
                  System.out.println("1 - Them nhan vien");
                  System.out.println("2 - Sua thong tin nhan vien");
                  System.out.println("3 - Xoa nhan vien");
                  System.out.println("4 - Hien thi nhan vien");
                  System.out.println("5 - Quit");
                  int userChoice = Integer.parseInt(sc.nextLine());
                  if (userChoice == 1) {
                        em.addEmployee();
                  }
                  else if (userChoice == 2) {
                        em.updateEmployee();
                  }
                  else if (userChoice == 3) {
                        em.deleteEmployee();
                  }
                  else if (userChoice == 4) {
                        em.showAllEmployee();
                  }
                  else if (userChoice == 5) {
                        condition = false;
                  }
                  else {
                        System.out.println("Nhap sai roi, nhap lai di");
                  }
            }
      }
      public static void main(String[] args) {
            showMenu();
      }
}
