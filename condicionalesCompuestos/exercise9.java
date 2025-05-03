package condicionalesCompuestos;

public class exercise9 {
    public static void main(String[] args) {
        int hour = 20;

        if(hour >= 6 && hour <= 12){
            System.out.println("Es de mañana");
        }
        else if(hour >= 13 && hour <= 18){
            System.out.println("Es de tarde");
        }
        else if(hour >= 19 && hour <= 23){
        System.out.println("Es de noche");
        }
        else if(hour >= 0 && hour <= 5){
            System.out.println("Es de madrugada");
        }
        else{
            System.out.println("Hora invalida");
        }
    }
}
