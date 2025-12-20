import java.util.*;
class Student{
    private String name;
    private int age;
public String getName(){
        return name; 
    }
public void setName(String name){
     this.name=name;
    }
public int getage(){
        return age; 
    }
public void setName(int age){
     this.age=age;
    }
    public Student(String name,int age){
        super();
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Name="+name+",age="+age;
    }
}

public class ExampleforArraylist {
    public static void main(String[] args) {
        Student s1=new Student("likitha",21);
        Student s2=new Student("manasa",21);

        ArrayList<Student> al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        for(Object i:al){
            System.out.println(i);
        }
    }
}
