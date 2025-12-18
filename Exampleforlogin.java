import java.util.*;
class InvalidLogin extends Exception{
     public String getMessage(){
        return "invalid login password";
     }

}
class Login{
    String username="likitha";
    int password=1234567;
    String un;
    int pwd;
    void takeinput(){
        Scanner sc =new Scanner(System.in);
       System.out.println("enter user name");
      un=sc.next();
       System.out.println("enter password");
       pwd=sc.nextInt();
    }
    void verify() throws InvalidLogin{
         if(un.equals(username)&&pwd==password){
            System.out.println("the user name is correct login successful");
         }
         else{
            InvalidLogin i=new InvalidLogin();
            System.out.println(i.getMessage());
            throw i;
         }
    }
}
class Password{
    Login l=new Login();
    void result(){
    try{
        l.takeinput();
        l.verify();
    }
    catch(Exception e){
        try{
        l.takeinput();
        l.verify();
     }
     catch(Exception a){

             try{
          l.takeinput();
          l.verify();
      }
      catch(Exception b){
          System.out.println("login password is wrong");
      }
     }

    }
}
}
public class Exampleforlogin {
    public static void main(String[] args) {
        Password p=new Password();
        p.result();
    }
    
}