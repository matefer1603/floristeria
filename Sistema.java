import java.awt.Component;
import javax.swing.JOptionPane;

public class Sistema {
    public Sistema() {
    }

    public static void main(String[] args) {
        RegistroProveedores registro = new RegistroProveedores();
        RegistroProductos registroProducto = new RegistroProductos();

        int opcionInicio;
        label79:
        do {
            try {
                opcionInicio = Integer.parseInt(JOptionPane.showInputDialog((Component)null, "Floristeria La Rosa De Guadalupe\n1. LOGIN (Admin)\n2. INICIAR(Usuario)\n3. SALIR"));
                int opcionMenu;
                String nom;
                switch (opcionInicio) {
                    case 1:
                        String usuario = JOptionPane.showInputDialog((Component)null, "USUARIO", "INGRESE USUARIO", 1);
                        String contrasena = JOptionPane.showInputDialog((Component)null, "CONTRASE\u00d1A", "INGRESE CONTRASE\u00d1A", 1);
                        String us1 = "Camilo";
                        String us2 = "Mateo";
                        String con = "12345";
                        if (usuario.equals(us1) && contrasena.equals(con) || usuario.equals(us2) && contrasena.equals(con) && contrasena.equals(con)) {
                            do {
                                try {
                                    nom = JOptionPane.showInputDialog("MEN\u00da\n1. Registrar Proveedor\n2. Ver Proveedor\n3. Registrar Productos\n4. Eliminar productos \n5. Ver Productos  \n6. Caja \n7. Salir");
                                    opcionMenu = Integer.parseInt(nom);
                                    switch (opcionMenu) {
                                        case 1:
                                            String nombreProveedor = JOptionPane.showInputDialog("Ingrese nombre:");
                                            String ruc = JOptionPane.showInputDialog("Ingrese RUC:");
                                            String telefono = JOptionPane.showInputDialog("Ingrese tel\u00e9fono:");
                                            String correo = JOptionPane.showInputDialog("Ingrese correo:");
                                            Proveedor nuevoProveedor = new Proveedor(nombreProveedor, ruc, telefono, correo);
                                            registro.agregarProveedor(nuevoProveedor);
                                            break;
                                        case 2:
                                            registro.mostrarProveedores();
                                            break;
                                        case 3:
                                            String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                                            String codigo = JOptionPane.showInputDialog("Ingrese codigo: ");
                                            String caducidad = JOptionPane.showInputDialog("Ingrese fecha de caducidad: ");
                                            String compra = JOptionPane.showInputDialog("Ingrese fecha de compra: ");
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio: "));
                                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad: "));
                                            Producto nuevoProducto = new Producto(nombre, codigo, caducidad, compra, precio, cantidad);
                                            registroProducto.agregarProducto(nuevoProducto);
                                            break;
                                        case 4:
                                            String operacionProductos = JOptionPane.showInputDialog("1. Registrar Productos\n2. Ver Productos\n3. Eliminar Producto\n4. Volver");
                                            int opcionProductos = Integer.parseInt(operacionProductos);

                                            switch (opcionProductos) {
                                                case 1:
                                                    // Registrar productos (código existente)
                                                    break;
                                                case 2:
                                                    registroProducto.mostrarProductos();
                                                    break;
                                                case 3:
                                                    String nombreProductoEliminar = JOptionPane.showInputDialog("Ingrese nombre del producto a eliminar:");
                                                    registroProducto.eliminarProducto(nombreProductoEliminar);
                                                    break;
                                                case 4:
                                                    JOptionPane.showMessageDialog(null, "Volviendo al menú principal");
                                                    break;
                                                default:
                                                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                                            }
                                            break;

                                            case 5:
                                            registroProducto.mostrarProductos();
                                            break;
                                        case 6:
                                            JOptionPane.showMessageDialog((Component)null, "Volviendo al menu principal");
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog((Component)null, "Opci\u00f3n no v\u00e1lida. Int\u00e9ntelo de nuevo.");
                                    }
                                } catch (NumberFormatException var29) {
                                    JOptionPane.showMessageDialog((Component)null, "Error: Por favor, ingrese un valor num\u00e9rico.");
                                    opcionMenu = -1;
                                }
                            } while(opcionMenu != 5);
                        } else {
                            JOptionPane.showMessageDialog((Component)null, "Error: Proveedor no registrado");
                        }
                        break;
                    case 2:
                        while(true) {
                            try {
                                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("MEN\u00da\n1. Ver Productos\n2. Comprar Productos\n3. Salir\n"));
                                switch (opcionMenu) {
                                    case 1:
                                        registroProducto.mostrarProductos();
                                        break;
                                    case 2:
                                        try {
                                            nom = JOptionPane.showInputDialog("Ingrese nombre del producto: ");
                                            registroProducto.buscarProducto(nom);
                                        } catch (NumberFormatException var27) {
                                            JOptionPane.showMessageDialog((Component)null, "Error: Por favor, ingrese un valor num\u00e9rico.");
                                            opcionMenu = -1;
                                        }
                                        break;
                                    case 3:
                                        JOptionPane.showMessageDialog((Component)null, "Volviendo");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog((Component)null, "Error: Opci\u00f3n no v\u00e1lida. Por favor, elija 1, 2 o 3.");
                                }
                            } catch (NumberFormatException var28) {
                                JOptionPane.showMessageDialog((Component)null, "Error: Por favor, ingrese un valor num\u00e9rico.");
                                opcionMenu = -1;
                            }

                            if (opcionMenu == 3) {
                                continue label79;
                            }
                        }
                    case 3:
                        JOptionPane.showMessageDialog((Component)null, "Saliendo del programa. \u00a1Hasta luego!");
                        break;
                    default:
                        JOptionPane.showMessageDialog((Component)null, "Opci\u00f3n no v\u00e1lida. Int\u00e9ntelo de nuevo.");

                }

            } catch (NumberFormatException var30) {
                JOptionPane.showMessageDialog((Component)null, "Error al convertir la entrada a un n\u00famero. Aseg\u00farate de ingresar un n\u00famero v\u00e1lido.");
                opcionInicio = -1;
            }
        } while(opcionInicio != 3);

    }
}
