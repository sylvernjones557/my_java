import java.util.Scanner;

class Employee {
    String name;
    int emp_no;
    int basic_pay;
}

class Salary extends Employee {
    public int getHRA() {
        return (int) (0.18 * basic_pay);
    }

    public int getDA() {
        return (int) (0.09 * basic_pay);
    }

    public int getPF() {
        return (int) (0.13 * basic_pay);
    }

    public int getGrossPay() {
        return basic_pay + getHRA() + getDA();
    }

    public int getNetPay() {
        return getGrossPay() - getPF();
    }
}

class Cal_tax extends Salary {
    public void Tax() {
        if ((getGrossPay() * 12) > 500000)
            System.out.println("Your tax amount is: " + ((getGrossPay() * 12) * 0.08));
        else
            System.out.println("You have no tax. Enjoy!!!");
    }
}

class Report extends Salary {
    public void display() {
        System.out.println("House Rent Allowance: " + getHRA());
        System.out.println("Dearness Allowance: " + getDA());
        System.out.println("Provident Fund: " + getPF());
        System.out.println("Gross Pay: " + getGrossPay());
        System.out.println("Net Pay: " + getNetPay());
    }
}

class Hybrid {
    public static void main(String h[]) {
        Report rr = new Report();
        Cal_tax tt = new Cal_tax();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        rr.name = sc.nextLine();
        System.out.println("Enter your emp number:");
        rr.emp_no = sc.nextInt();
        System.out.println("Enter your basic pay:");
        rr.basic_pay = sc.nextInt();
        tt.basic_pay = rr.basic_pay;

        rr.display();
        tt.Tax();
    }
}
