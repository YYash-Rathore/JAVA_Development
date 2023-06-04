package Exception_Handling;

public class exception_sec {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        String name = null;
        int values[] = {2,4,6,7};
        try{
            result = num1/name.length();
            System.out.println(values[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        catch(Exception e){
            System.out.println("Something went wrong....");
        }
    }
}
