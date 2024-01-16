import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

class RegistroProductos {
    ArrayList<Producto> productos = new ArrayList();

    public RegistroProductos() {
        this.productos.add(new Producto("Rosa","1987","12/12/2023","12/10/24",0.30,  5));
        this.productos.add(new Producto("Tulipan","0937","12/12/2023","11/10/24",0.45,  15));
        this.productos.add(new Producto("Bugambilla","7023","12/12/2023","12/10/24",0.5,  50));
        this.productos.add(new Producto("Amapola","7800","12/12/2023","12/10/24",0.67,  2));
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        JOptionPane.showMessageDialog((Component)null, producto.getNombre() + " registrado correctamente.");
    }

    public void mostrarProductos() {
        StringBuilder mensaje = new StringBuilder("--CAT\u00c1LOGO--\n");
        if (this.productos.isEmpty()) {
            mensaje.append("No hay productos registrados.");
        } else {
            Iterator var2 = this.productos.iterator();

            while(var2.hasNext()) {
                Producto producto = (Producto)var2.next();
                mensaje.append("Nombre: ").append(producto.getNombre()).append("\n");
                mensaje.append("C\u00f3digo: ").append(producto.getCodigo()).append("\n");
                mensaje.append("Precio: ").append(producto.getPrecio()).append("\n");
                mensaje.append("Cantidad: ").append(producto.getCantidadProducto()).append("\n");
                mensaje.append("Fecha de compra: ").append(producto.getFechaCompra()).append("\n");
                mensaje.append("\n");
            }
        }

        JOptionPane.showMessageDialog((Component)null, mensaje.toString());
    }

    public void buscarProducto(String nombre) {
        try {
            StringBuilder producto = new StringBuilder("--PRODUCTO--\n");
            boolean encontrado = false;
            Iterator var4 = this.productos.iterator();

            while(var4.hasNext()) {
                Producto buscado = (Producto)var4.next();
                if (buscado.getNombre().equals(nombre)) {
                    encontrado = true;
                    producto.append("Nombre: ").append(buscado.getNombre()).append("\n");
                    producto.append("C\u00f3digo: ").append(buscado.getCodigo()).append("\n");
                    producto.append("Precio: ").append(buscado.getPrecio()).append("\n");
                    producto.append("Cantidad: ").append(buscado.getCantidadProducto()).append("\n");
                    producto.append("Fecha de compra: ").append(buscado.getFechaCompra()).append("\n");
                    producto.append("\n");
                    JOptionPane.showMessageDialog((Component)null, producto.toString());
                    int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
                    if (cant <= buscado.getCantidadProducto()) {
                        buscado.setCantidadProducto(buscado.getCantidadProducto() - cant);
                        JOptionPane.showMessageDialog((Component)null, "Producto vendido exitosamente");
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Valor incorrecto");
                    }
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog((Component)null, "Producto no encontrado");
            }
        } catch (Exception var7) {
            JOptionPane.showMessageDialog((Component)null, "Error: Por favor, ingrese un valor correcto");
        }

    }
    public void eliminarProducto(String nombre) {
        Iterator<Producto> iterator = productos.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getNombre().equals(nombre)) {
                iterator.remove();
                encontrado = true;
                JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }
}
