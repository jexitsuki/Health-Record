import java.util.Scanner;


public class HealthRecord {
    
    private long ssn;
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String email;
    private double weight;
    private double height;
    
    private void setSSN(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[1]Social Security Number");
        System.out.println("The person SSN must be a 9 digits and in between 000000001 and 999999999.");
        System.out.print("Enter: ");
        String strSSN = input.nextLine();
        
        while(!strSSN.matches("\\d{9}") || strSSN.matches("000000000")){ 
            System.out.println("Invalid Entries: Follow the instruction above and try again.");
            System.out.print("Enter: ");
            strSSN = input.nextLine();
        }
        
        ssn = Long.parseLong(strSSN);
        
        System.out.println();
    }
    
    private void setFirstName(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[2]First Name");
        System.out.print("Enter: ");
        firstName = input.nextLine();
        System.out.println();
    }
    
    private void setLastName(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[3]Last Name");
        System.out.print("Enter: ");
        lastName = input.nextLine();
        System.out.println();
    }
    
    private void setAge(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[4]Age");
        System.out.println("The person's age must be between 1 and 125.");
        System.out.print("Enter: ");
        age = input.nextInt();
        
        while(age <= 0 || age > 125){ 
            System.out.println("Invalid Entries: Follow the instruction above and try again.");
            System.out.print("Enter: ");
            age = input.nextInt();
        }
        System.out.println();
    }
    
    private void setPhoneNumber(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[5]Telephone Number");
        System.out.println("The telephone number must be a 10 digits and in between 0000000001 and 9999999999.");
        System.out.print("Enter: ");
        String strPhoneNumber = input.nextLine();
        

        while(!strPhoneNumber.matches("\\d{10}") || strPhoneNumber.matches("0000000000")){ 
            System.out.println("Invalid Entries: Follow the instruction above and try again.");
            System.out.print("Enter: ");
            strPhoneNumber = input.nextLine();
        }
        
        phoneNumber = Long.parseLong(strPhoneNumber);
        System.out.println();
    }
    
    private void setEmail(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[6]e-mail adress");
        System.out.print("Enter: ");
        email = input.nextLine();
        System.out.println();
    }
    
    private void setWeight(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[7]Weight (lb)");
        System.out.println("The person's weight must be between 1 and 1400.");
        System.out.print("Enter: ");
        weight = input.nextDouble();
        
        while(weight < 1 || weight > 1400){
            System.out.println("Invalid Entries: Follow the instruction above and try again.");
            System.out.print("Enter: ");
            weight = input.nextDouble();
        }
        System.out.println();
    }
    
    private void setHeight(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("[8]Height (inches)");
        System.out.println("The person's height must be between 1 and 108.");
        System.out.print("Enter: ");
        height = input.nextDouble();
        
        while(height < 1 || height > 108){
            System.out.println("Invalid Entries: Follow the instruction above and try again.");
            System.out.print("Enter: ");
            height = input.nextDouble();
        }
        System.out.println();
    }
    
    private long getSSN(){
        return ssn;
    }
    
    private String getFirstName(){
        return firstName;
    }
    
    private String getLastName(){
        return lastName;
    }
    
    private int getAge(){
        return age;
    }
    
    private long getPhoneNumber(){
        return phoneNumber;
    }
    
    private String getEmail(){
        return email;
    }
    
    private double getWeight(){
        return weight;
    }
    
    private double getHeight(){
        return height;
    }
    
    public void readInputs(){
        
        setSSN();
        setFirstName();
        setLastName();
        setAge();
        setPhoneNumber();
        setEmail();
        setWeight();
        setHeight();
        
    }
    
    private double calculateBMI(){ //Q.Should I limit dicimal number?
        double newBMI = weight / (height * height) * 703;
        return newBMI;
    }
    
    
    public void display(){
        System.out.println();
        System.out.println("\"Your Health Record\"");
        System.out.println();
        
        System.out.println("\tSocial Security Number: " + getSSN());
        System.out.println("\tFrist Name: " + getFirstName());
        System.out.println("\tLast Name: " + getLastName());
        System.out.println("\tAge: " + getAge());
        System.out.println("\tPhone Number: " + getPhoneNumber());
        System.out.println("\te-mail: " + getEmail());
        System.out.println("\tWeight: " + getEmail());
        System.out.println("\tHeight: " + getHeight());
        System.out.println("\tBMI: " + calculateBMI());
        
        System.out.println();
    }
}
