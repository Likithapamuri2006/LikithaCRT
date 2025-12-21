import java.util.*;
class Student{
    private String name;
    private String email;
    private String rollNo;
    Student(String name,String email,String rollNo){
    super();
    this.rollNo=rollNo;
    this.name=name;
    this.email=email;
}
public String getName(){
    return name;
}
public String getemail(){
    return email;
}
public String getRollNo(){
    return rollNo;
}
public String toString(){
    return "Student[name="+ name+",email="+ email+",rollNo="+rollNo+"]";
   }
}


public class ExampleforLinkedhashset2 {
    public static void main(String[] args) {
         Student s=new Student("likitha","likitha123@gmail.com","23AK1A3622");
         Student s1=new Student("akhila","akhila123@gmail.com","23AK1A3642");
         LinkedHashSet<Student>lhs=new LinkedHashSet<>();
         lhs.add(s);
         lhs.add(s1);
         for(Object i:lhs){
            System.out.println(i);
         }
    }
}
