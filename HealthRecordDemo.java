

public class HealthRecordDemo {
    public static void main(String[] args){
        
        System.out.println("Welcome to the Health Record.");
        System.out.println();
        
        HealthRecord yourRecord = new HealthRecord();
        
        yourRecord.readInputs();
        yourRecord.display();
        
        System.out.println("Thank you for using our service. Have a wonderful day!");
    }
}
