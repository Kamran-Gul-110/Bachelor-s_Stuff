class employeeSalaryCalculator {
    private int employeeId;
    private String name;
    private double basicSalary;
    
    void setId(int employeeId){
     this.employeeId = employeeId;   
    }
    void setName(String name){
     this.name = name;   
    }
    void setBasicSalary(double basicSalary){
        if(basicSalary>=30000){
        this.basicSalary = basicSalary;
        }
        }
    
    double hra(){
        double hra=(basicSalary * (20.0/100));
        return hra;
    }
    
    double tax(){
        double tax = (basicSalary * (5.0/100));
        return tax;
    }
    double netSalary(){
        double netSalary = (basicSalary + hra() - tax());
        return netSalary;
    }
    
    void printSlip(){
        System.out.println("Employee id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("House Rent Allowance: " + hra());
        System.out.println("Tax: " + tax());
        System.out.println("Net Salary: " + netSalary());
    }
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setId(123);
        e1.setName("Kamran");
        e1.setBasicSalary(100000);
        e1.printSlip();
        System.out.println("===================================");
        employee e2 = new employee();
        e2.setId(786);
        e2.setName("Sarmad");
        e2.setBasicSalary(123489.55);
        e2.printSlip();
    }
}
