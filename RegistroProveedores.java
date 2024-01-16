import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

class RegistroProveedores {
    ArrayList<Proveedor> proveedores = new ArrayList();

    public RegistroProveedores() {
        this.proveedores.add(new Proveedor("Flores de los Andes", "1234567891001", "02-2341667", "Flroesdelosand@gmail.com"));
        this.proveedores.add(new Proveedor("Sachaflor", "16728192341001", "02-654321", "Sachaflor@yahoo.com"));
        this.proveedores.add(new Proveedor("Expoflores\u00f3", "71263182319001", "02-981625", "Expoflores\u00f3@yahoo.com"));
    }

    public void agregarProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
        JOptionPane.showMessageDialog((Component)null, "Proveedor " + proveedor.getNombreProveedor() + " registrado correctamente.");
    }

    public void mostrarProveedores() {
        StringBuilder mensaje = new StringBuilder("Proveedores registrados:\n");
        if (this.proveedores.isEmpty()) {
            mensaje.append("No hay proveedores registrados.");
        } else {
            Iterator var2 = this.proveedores.iterator();

            while(var2.hasNext()) {
                Proveedor proveedor = (Proveedor)var2.next();
                mensaje.append("Nombre: ").append(proveedor.getNombreProveedor()).append("\n");
                mensaje.append("RUC: ").append(proveedor.getRuc()).append("\n");
                mensaje.append("Tel\u00e9fono: ").append(proveedor.getTelefono()).append("\n");
                mensaje.append("Correo: ").append(proveedor.getCorreo()).append("\n");
                mensaje.append("\n");
            }
        }

        JOptionPane.showMessageDialog((Component)null, mensaje.toString());
    }
}
