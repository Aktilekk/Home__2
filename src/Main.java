public class Main {
    public static void main(String[] args){
        CreateObject("Nokia");
        CreateObject("Redmi");
        CreateObject("Motorola");
    }
    public static String CreateObject(String ClassName) {
        switch (ClassName) {
            case "Nokia":
                Nokia nokia = new Nokia(   " Nokia ",  4,    " Red ");
                System.out.println(nokia.print());
                break;
            case "Redmi":
                Redmi redmi = new Redmi(" Redmi ", 8, " Big ");
                System.out.println(redmi.print());
                break;
            case "Motorola":
                Motorola motorola = new Motorola(" Motorola ",  16, " 4х8 ");
                System.out.println(motorola.print());
                break;}
            return ClassName;
        }
    }
