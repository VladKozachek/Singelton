public class Main {
    public static void main(String[] args) {
        Singelton singelton1=Singelton.singelton;
        Singelton singelton2=Singelton.singelton;
        System.out.println(singelton1); // один и тот же объект
        System.out.println(singelton2);
    }
}
