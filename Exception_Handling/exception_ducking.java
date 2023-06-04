package Exception_Handling;

public class exception_ducking 
{
    void a() throws Exception
    {
        b();
    }
    void b() throws Exception
    {
        int num1 = 6;
        int num2 = 0;
        int result = num1/num2;
    }
    public static void main(String[] args) {
        exception_ducking obj = new exception_ducking();
        try{
        obj.a();
        obj.b();
        }
        catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}
