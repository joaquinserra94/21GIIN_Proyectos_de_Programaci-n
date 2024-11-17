public class ClaseHerenciaMultiple extends ClaseSimple implements InterfaceNombre {

    String nombre;



    public ClaseHerenciaMultiple() {

        nombre = "";

    }



    public String obtenerNombre() {

        return nombre;

    }



    public void asignarNombre(String nombre) {

        this.nombre = nombre;

    }



    public static void main(String args[]) {

        InterfaceNombre claseconnombre;

        claseconnombre = new ClaseHerenciaMultiple();

        claseconnombre.asignarNombre(InterfaceNombre.NOMBRE);

        System.out.println(claseconnombre.obtenerNombre());

    }

}