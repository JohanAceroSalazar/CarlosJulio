package condicionalesCompuestos;

public class exercise10 {
    public static void main(String[] args) {
        String enteredUser = "Johan";
        String enteredPassword = "654123";

        String correctUser = "Johan";
        String correctPassword = "654123";

        if(enteredUser.equals(correctUser) && enteredPassword.equals(correctPassword)){
            System.out.println("Acceso concedido");
        }
        else{
            System.out.println("Acceso denegado");
        }
    }
}
