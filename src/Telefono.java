public class Telefono extends ArticulosElectronicos implements Precio{

    private float PulgadasPantalla;
    private int anioFabricacion;

    public Telefono(Producto producto, String modelo, float precio,float pulgadasPantalla,int anioFabricacion){
        super(producto,modelo,precio);
        this.PulgadasPantalla=pulgadasPantalla;
        this.anioFabricacion=anioFabricacion;
    }
    public float CalcularPrecio(){
    return getPrecio();
  } public float getPulgadasPantalla() {
        return PulgadasPantalla;
    }

    public void setPulgadasPantalla(float pulgadasPantalla) {
        PulgadasPantalla = pulgadasPantalla;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
public float obtenerPrecio(){
return CalcularPrecio();}



}