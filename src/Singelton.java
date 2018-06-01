public class Singelton {
    static Singelton singelton=new Singelton();
    private Singelton(){
    }
    public static Singelton getInstans(){
        return singelton;
    }
}
