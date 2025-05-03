package condicionalesCompuestos;

public class exercise8 {
    public static void main(String[] args) {
        int total = 147;

        if(total > 100){
            double discount = total * 0.10;
            double calculate = total - discount;
            System.out.println("Total con el descuento: " + calculate);
        }
        else{
            System.out.println("Total: " + total + " No tiene descuento");
        }
    }
}
