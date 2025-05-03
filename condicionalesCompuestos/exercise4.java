package condicionalesCompuestos;

public class exercise4 {
    public static void main(String[] args) {
        int temperature = 17;

        if(temperature < 15){
            System.out.println("Hace frio: " + temperature + "°C");
        }
        else if(temperature <= 30){
            System.out.println("Temperatura normal: " + temperature + "°C");
        }
        else{
            System.out.println("Hace calor: " + temperature + "°C");
        }
    }
}
