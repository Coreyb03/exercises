public class PayrollProgram {

    public static void main(String[] args) {
        long hoursWorked = 40;    
        double payRate = 10.0;
        double taxRate = 0.10;
        double payAmount = (payRate * hoursWorked);
        double taxAmount = payAmount * taxRate;
        System.out.println("Hours Worked: " + hoursWorked );
        System.out.println("pay Amount  : " + payAmount );
        System.out.println("tax Amount  : " + taxAmount );
    }   
}