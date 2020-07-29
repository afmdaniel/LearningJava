package com.daniel.polimorfismo;

import javax.swing.JOptionPane;

public class PayrollSystemTest {
    public static void main(String[] args) {
        
        SalariedEmployee salariedEmployee; // declarei aqui pq declarada dentro do try viraria uma variavel local de try
        
        while (true){
            try {
                double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário ($)", "Salaried Employee", JOptionPane.QUESTION_MESSAGE));
                salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", salary);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        ComissionEmployee comissionEmployee = new ComissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusComissionEmployee basePlusComissionEmployee =
                new BasePlusComissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        
        System.out.println("Employees processed individually:");
        
        System.out.printf("\n%s\n%s: $%,.2f\n\n",salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%s\n%s: $%,.2f\n\n",hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s\n%s: $%,.2f\n\n",comissionEmployee, "earned", comissionEmployee.getPaymentAmount());
        System.out.printf("%s\n%s: $%,.2f\n\n",basePlusComissionEmployee, "earned", basePlusComissionEmployee.getPaymentAmount());
        
        Employee[] employees = new Employee[4];
        
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;
        
        System.out.printf("Employees processed polymorphically:\n\n");
        
        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            
            if (currentEmployee instanceof BasePlusComissionEmployee){
                BasePlusComissionEmployee employee = (BasePlusComissionEmployee) currentEmployee;
                
                employee.setBaseSalary(1.1 * employee.getBaseSalary());
                
                System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                        employee.getBaseSalary());
            }
            
            System.out.printf("earned $%,.2f\n\n", currentEmployee.getPaymentAmount());
        }
        
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is an %s\n", j, employees[j].getClass().getName());
    }
}
