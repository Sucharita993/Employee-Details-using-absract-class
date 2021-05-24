# Employee-Details-using-absract-class
# Usage of Try-Catch for NullPointer Exception
Create an abstract employee class for data hiding<br>
```java
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
```
Create CLERK, MANAGER, PROGRAMMER classes extending employee class<br>
```java
final class Clerk1 extends Employee1 {
    public Clerk1() {
        salary = 10000;
        designation = "Clerk";
    }

    public void salaryRise() {
        salary += 1000;
    }
}
```
```java
final class Programmer1 extends Employee1 {
    public Programmer1() {
        salary = 20000;
        designation = "Programmer";
    }

    public void salaryRise() {
        salary += 2000;
    }
}
```
```java
final class Manager1 extends Employee1 {
    public Manager1() {
        salary = 25000;
        designation = "Manager";
    }

    public void salaryRise() {
        salary += 2500;
    }
}
```
Write a Do-While loop Switch inside it for Creation,Display,Salary, rise, Exit<br>

```java
 do {
            System.out.println("1.Create \n2.Display \n3.Salary Rise \n4.Exit");
            ch = sc.nextInt();
            switch (ch) {
```
write a Do-While loop inside every Switch case for selection of Clerk,Programmer,Manager<br>

```java
case 1:
                    do {
                        System.out.println("1.Clerk \n2.Programmer \n3.Manager \n4.Exit");
                        choice = sc.nextInt();
                        switch (choice)
 ```
We have to store data in the employee array created, display is also done by exmployee array only<br>
Creation of detalis
```java
 e[i] = new Programmer1();
                                i++;
                                break;
 ```
 Display of details
 ```java
  int j = 0;
                        do {
                            e[j].display();
                            j++;
                        } while (e[j] != null);
  ```
Write a try-catch conditions for catching of NullPointer Exception in casse 2,3 for display and salary rise without creation of details.
```java
 try {
                        int j = 0;
                        do {
                            e[j].salaryRise();
                            j++;
                        } while (e[j] != null);
                        System.out.println("Salary rised");
                    } catch (Exception ex) {
                        System.out.println("No records found \n");
                    }
                    break;
 ```
 <img width="960" alt="Screenshot 2021-05-24 081343" src="https://user-images.githubusercontent.com/84003518/119289334-074c6580-bc68-11eb-95cf-2099d9d7c03b.png">
<img width="960" alt="Screenshot 2021-05-24 081401" src="https://user-images.githubusercontent.com/84003518/119289356-10d5cd80-bc68-11eb-8499-99b9c6fcc888.png">

