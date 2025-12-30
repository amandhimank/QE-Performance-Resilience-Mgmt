package ExceptionHandling;

public class ExceptionTest {

    /*
        -> ALWAYS USE "THROWS" KEYWORD AND THEN HANDLE THE EXCEPTION USING try-catch BLOCK
    */ 

    // A static method can access non-static members, but only through an object.
    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
                throw new CustomException("string value is null");
        } else {
            System.out.println("String: " + str);
        }
       
    }
    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest("");
            exceptionTest(null);
        } catch (CustomException ce) {
            System.out.println("Exception: " + ce.getMessage());;
        }
    }
}
