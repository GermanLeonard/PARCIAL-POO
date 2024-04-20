public class Producto {
    private String nombre;
    private float peso;

    private int codigo;

    public Producto(String nombre, float peso, int codigo){
        this.nombre=nombre;

        this.peso=peso;
        this.codigo=codigo;
    }

    public Producto(Producto producto){
        nombre= producto.nombre;
        peso= producto.peso;
        codigo=producto.codigo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
