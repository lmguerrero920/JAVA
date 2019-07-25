package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("Esto es un mensaje,¡Bienvenido!"),
    MENSAJE_TITULO("Esto es un titulo"),
    MENSAJE_DOLAR_ALTO("El dolar esta caro"),
    MENSAJE_DOLAR_BAJO("el dolar esta barato"),
    MENSAJE_INGRESO_VALORES("ingresa un valor");



    private String mensaje;
    Constantes(String s){
  this.mensaje=s;

    }

    public String getMensaje() {
        return mensaje;
    }

}
