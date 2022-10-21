package Application;

import Entities.Address;
import Entities.Department;
import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Department dept = new Department();
        System.out.print("Nome do departamento: ");
        dept.setName(sc.nextLine());
        System.out.print("Dia do pagamento: ");
        dept.setPayday(sc.nextInt());
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        sc.next();
        String fone = sc.nextLine();
        dept.setAddress(new Address(email, fone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Dados do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            dept.addEmployee(new Employee(nome, salario));
        }

        showReport(dept);
        sc.close();
    }
    private static void showReport (Department dept){
        System.out.println(dept.toString());
    }
}
