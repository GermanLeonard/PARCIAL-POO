public class Laptops extends ArticulosElectronicos implements Precio{
    private float pulgadasPantalla;
    private int anioFabricacion;

    public Laptops(Producto producto, String modelo,float precio,float pulgadasPantalla, int anioFabricacion){
        super(producto, modelo, precio);
        this.pulgadasPantalla=pulgadasPantalla;
        this.anioFabricacion=anioFabricacion;
    }

    public float CalcularPrecio(){
        return getPrecio();
    }

    public float obtenerPrecio(){
        return CalcularPrecio();
    }

    public float getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(float pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
