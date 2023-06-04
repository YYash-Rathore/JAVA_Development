package Exception_Handling;

public class exception_First {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
            System.out.println("In Try Block");
        }
        catch(Exception obj){
            System.out.println("Something went wrong...."+obj);
        }
        System.out.println("End of the Program");
    }
}