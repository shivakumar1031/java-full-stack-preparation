public class Exceptions {
    static void ageVerifier(int age) throws MyException{
        if(age<18)
            throw new MyException("Age Not Eligible");
        System.out.println("You can Drive.....");
    }
    public static void main(String[] args) {
        int age = 12;
        try{
            ageVerifier(age);
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        
    }
}
class MyException extends Exception {
    MyException(String message){
        super(message);
    }
}
