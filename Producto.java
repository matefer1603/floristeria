public class Producto {
    private String nombre;
    private String codigo;
    private String fechaCompra;
    private double precio;
    private int cantidadProducto;

    public Producto(String nombre, String codigo, String fechaCompra, String compra, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getFechaCompra() {
        return this.fechaCompra;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

}
