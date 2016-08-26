package mx.pepivsky.tareasemana4recyclerview.Pojo;

/**
 * Created by noisecontrollers on 07/08/2016.
 */
public class Mascota {


    private int foto;
    private String nombre;

    public Mascota(int foto,String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
