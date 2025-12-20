import java.util.*;
class Employee{
    private String empName;
    private String empDesignation;
    private String empemail;
    public Employee( String empName,String empDesignation,String empemail){
        super();
        this.empName=empName;
        this.empDesignation=empDesignation;
        this.empemail=empemail;
    }
    public String getEmpName(){
        return empName;
    }
     public String getEmpDesignation(){
        return empDesignation;
    }
     public String getEmpemail(){
        return empemail;
    }
    public String toString(){
        return "Employee empName="+empName+"empDesignation= "+empDesignation+"empemail="+empemail;
    }
}



public class ExampleLinkedlist2 {
    public static void main(String[] args) {
        Employee e1=new Employee("likitha","trainer","liki123@gmail.com");
        Employee e2=new Employee("manasa","developer","manasa123@gmail.com");
        Employee e3=new Employee("akhila","HR","akhila123@gmail.com");

        LinkedList<Employee> ll=new LinkedList<Employee>();
        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        for(Object obj:ll){
            System.out.println(obj);
        }
    }
}
