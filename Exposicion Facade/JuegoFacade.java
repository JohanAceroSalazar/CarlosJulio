// Esta es la clase fachada (Facade)
// Aquí simplificamos todo el proceso de jugar en un solo método
class JuegoFacade {
    // Método que ejecuta todos los pasos para jugar
    void jugar() {
        // Encendemos la pantalla
        Pantalla pantalla = new Pantalla();
        pantalla.encender();

        // Encendemos la consola
        Consola consola = new Consola();
        consola.encender();

        // Cargamos el videojuego
        VideoJuego juego = new VideoJuego();
        juego.cargar();

        // Mensaje final al usuario
        System.out.println("¡Todo listo para jugar!");
    }
}
