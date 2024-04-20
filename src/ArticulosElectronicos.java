public abstract class ArticulosElectronicos extends Producto {
    private String modelo;
    private float precio;



    public ArticulosElectronicos(Producto producto, String modelo, float precio){
        super(producto);
        this.modelo=modelo;
        this.precio=precio;
    }

    public abstract float obtenerPrecio();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
