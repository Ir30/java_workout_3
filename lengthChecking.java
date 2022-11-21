import java.util.Scanner;

// 5. Define a new exceptions, called ExceptionLineTooShort and ExceptionLineTooLong, 
// that prints out the error message "The input is too long" and "The input is too short". Write 
// a program that reads lines from user and throws an exception of type
// ExceptionLineTooLong and ExceptionLineTooShort in the case where a string of the file 
// is longer than 10 characters and shorter than 5 characters respectively. Create separate
// method for the length checking & exception throw and handle the exception appropriately.
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String s){
        super(s);
    }
}

class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String s){
        super(s);
    }
}

public class lengthChecking {


    static void check_length(String s)throws ExceptionLineTooShort,ExceptionLineTooLong {
        if(s.length()<5){
            throw new ExceptionLineTooShort("The input is too short");
        }
        if(s.length()>10){
            throw new ExceptionLineTooLong("The input is too long");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String inp = sc.nextLine();

        try{
            check_length(inp);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
