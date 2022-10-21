package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;

    private Integer payday;

    private Address address;

    List <Employee> employeeList = new ArrayList<>();

    public Department() {
    }


    public Department(String name, Integer payday, Address address) {
        this.name = name;
        this.payday = payday;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayday() {
        return payday;
    }

    public void setPayday(Integer payday) {
        this.payday = payday;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee (Employee employee){
            employeeList.add(employee);
    }
    public void removeEmployee (Employee employee){
            employeeList.remove(employee);
    }
    public double payroll (){
        double sum = 0.0;
        for (int i = 0; i < employeeList.size(); i++){
             sum += employeeList.get(i).getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
           sb.append("FOLHA DE PAGAMENTO:" + "\n");
           sb.append("Departamento ");
           sb.append(getName()).append(" = R$ ");
           sb.append(String.format("%.2f", payroll())).append("\n");
           sb.append("Pagamento realizado no dia ").append(payday).append("\n");
           sb.append("Funcionários:" + "\n");
           for (Employee nome: employeeList){
               sb.append(nome.getName()).append("\n");
           }
           sb.append("Para dúvidas favor entrar em contato: " + address.getEmail());

         return sb.toString();
    }
}
