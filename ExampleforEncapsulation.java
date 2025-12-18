import java.util.*;
class Student{
    //Atrributs,properties of an object
   private String rollno;
   private String name;
   private String email;
    int age;
    
    //seter method-->update the values
    public void setData(String x,String y,String z,int a){
        rollno=x;
        name=y;
        email=z;
        age=a;
    }

    //getter methos-->to read the values
    public String getrollno(){
        return rollno;
    }
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public int getage(){
        return age;
    }
}


public class ExampleforEncapsulation {
    public static void main(String[]args){
        
        Student s1=new Student();
        Student s2=new Student();
        s1.setData("A2236","Likitha","abc@gmail.com",21);
        s2.setData("a3623","manasa","dcb@gmail.com",21);
        System.out.println("The student rollno:"+s1.getrollno());
        System.out.println("The student name:"+s1.getname());
        System.out.println("The student email:"+s1.getemail());
        System.out.println("The student age:"+s1.getage());
        System.out.println("The student rollno:"+s2.getrollno());
        System.out.println("The student name:"+s2.getname());
        System.out.println("The student email:"+s2.getemail());
        System.out.println("The student age:"+s2.getage());
    }
}
