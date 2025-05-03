package condicionalesCompuestos;

public class exercise5 {
    public static void main(String[] args) {
        int note = 16;

        if(note < 10){
            System.out.println(note + ": Desaprobado");
        }
        else if(note <= 13){
            System.out.println(note + ": Regular");
        }
        else if(note <= 17){
            System.out.println(note + ": Bueno");
        }
        else if(note <= 20){
            System.out.println(note + ": Excelente");
        }
        else{
            System.out.println("Nota invalidad");
        }
    }
}