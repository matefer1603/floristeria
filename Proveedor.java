public class Proveedor {
    private String nombreProveedor;
    private String ruc;
    private String telefono;
    private String correo;

    public Proveedor(String nombreProveedor, String ruc, String telefono, String correo) {
        this.nombreProveedor = nombreProveedor;
        this.ruc = ruc;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombreProveedor() {
        return this.nombreProveedor;
    }

    public String getRuc() {
        return this.ruc;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
