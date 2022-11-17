
package Clases;

public class Object {
    private int codigo_articulo;
    private String nombre_articulo;
    private String alias;
    private String fecha_registro;
    private int id_categoria;

    
    public Object(int uno, String dos, String tres, String cuatro, int cinco){
        this.codigo_articulo=uno;
        this.nombre_articulo=dos;
        this.alias=tres;
        this.fecha_registro=cuatro;     
        this.id_categoria=cinco;   
    }
    
    

    public int getUno() {
        return codigo_articulo;
    }

    public void setUno(int uno) {
        this.codigo_articulo = uno;
    }

    public String getDos() {
        return nombre_articulo;
    }

    public void setDos(String dos) {
        this.nombre_articulo = dos;
    }

    public String getTres() {
        return alias;
    }

    public void setTres(String tres) {
        this.alias = tres;
    }

    public String getCuatro() {
        return fecha_registro;
    }

    public void setCuatro(String cuatro) {
        this.fecha_registro = cuatro;
    }

    public int getCinco() {
        return id_categoria;
    }

    public void setCinco(int cinco) {
        this.id_categoria = cinco;
    }

    
    
}
