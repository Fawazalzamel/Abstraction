public class Teacher extends Person {
    
 
public String subject;
 public String school;

public Teacher(String name, String subject, String school) {
        super(name);
        this.subject=subject;
        this.school=school;
    }

@Override

void describeRole(){
System.out.println("The teacher's name is " +getName()+ " they teach " + subject + " at " +school);}




 
}
