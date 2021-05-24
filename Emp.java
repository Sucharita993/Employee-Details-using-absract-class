import java.util.Scanner;

abstract class Employee1 {
    String name, designation;
    int age, salary;
    Scanner sc = new Scanner(System.in);

    public Employee1() {
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    public abstract void salaryRise();
}

final class Clerk1 extends Employee1 {
    public Clerk1() {
        salary = 10000;
        designation = "Clerk";
    }

    public void salaryRise() {
        salary += 1000;
    }
}

final class Programmer1 extends Employee1 {
    public Programmer1() {
        salary = 20000;
        designation = "Programmer";
    }

    public void salaryRise() {
        salary += 2000;
    }
}

final class Manager1 extends Employee1 {
    public Manager1() {
        salary = 25000;
        designation = "Manager";
    }

    public void salaryRise() {
        salary += 2500;
    }
}

public class Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee1[] e = new Employee1[10];
        int ch = 0, choice = 0, i = 0;
        do {
            System.out.println("1.Create \n2.Display \n3.Salary Rise \n4.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    do {
                        System.out.println("1.Clerk \n2.Programmer \n3.Manager \n4.Exit");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                e[i] = new Clerk1();
                                i++;
                                break;
                            case 2:
                                e[i] = new Programmer1();
                                i++;
                                break;
                            case 3:
                                e[i] = new Manager1();
                                i++;
                                break;
                        }
                    } while (choice != 4);
                    break;
                case 2:
                    try {
                        int j=0;
                          do
                         {
                                 e[j].display();
                                 j++;
                        }while(e[j]!=null);
                    } catch (Exception ex) {
                        System.out.println("No records found \n");
                    }
                    break;
                case 3:
                    try {
                        int j=0;
                        do{
                            e[j].salaryRise();
                            j++;
                        }while(e[j] != null);
                        System.out.println("Salary rised");
                    } catch (Exception ex) {
                        System.out.println("No records found \n");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        } while (ch != 4);
        sc.close();
    }
}
