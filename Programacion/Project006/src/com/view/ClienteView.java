package com.view;

import com.Utils.TerminalUtils;
import com.controller.ClienteController;
import com.model.entities.Cliente;

import java.util.List;

public class ClienteView {
    private ClienteController clienteController;

    public ClienteView() {
        this.clienteController = new ClienteController();
    }

    public void mostrar() {
        int opcion;

        do {
            TerminalUtils.output("=== Menú Cliente ===");
            TerminalUtils.output("1. Registrar Cliente");
            TerminalUtils.output("2. Mostrar Clientes");
            TerminalUtils.output("3. Eliminar Cliente");
            TerminalUtils.output("4. Actualizar Cliente");
            TerminalUtils.output("0. Volver");
            TerminalUtils.output("Selecciona una opción:");
            opcion = TerminalUtils.inputInt();

            switch (opcion) {
                case 1:
                    TerminalUtils.output("Nombre:");
                    String nombre = TerminalUtils.inputText();
                    TerminalUtils.output("Teléfono:");
                    int telefono = TerminalUtils.inputInt();
                    TerminalUtils.output("ID de la Mesa (o 0 para sin mesa):");
                    int idMesa = TerminalUtils.inputInt();
                    clienteController.crearCliente(nombre, telefono, idMesa == 0 ? null : idMesa);
                    break;
                case 2:
                    List<Cliente> clientes = clienteController.obtenerClientes();
                    for (Cliente c : clientes) {
                        TerminalUtils.output(c.toString());
                    }
                    break;
                case 3:
                    TerminalUtils.output("ID del cliente a eliminar:");
                    int idEliminar = TerminalUtils.inputInt();
                    clienteController.eliminarCliente(idEliminar);
                    break;
                case 4:
                    TerminalUtils.output("ID del cliente a actualizar:");
                    int idActualizar = TerminalUtils.inputInt();
                    TerminalUtils.output("Nuevo nombre:");
                    String nuevoNombre = TerminalUtils.inputText();
                    TerminalUtils.output("Nuevo teléfono:");
                    int nuevoTelefono = TerminalUtils.inputInt();
                    TerminalUtils.output("Nuevo ID de mesa (o 0 para dejar sin mesa):");
                    int nuevaMesa = TerminalUtils.inputInt();
                    clienteController.actualizarCliente(idActualizar, nuevoNombre, nuevoTelefono, nuevaMesa == 0 ? null : nuevaMesa);
                    break;
                case 0:
                    TerminalUtils.output("Volviendo al menú principal...");
                    break;
                default:
                    TerminalUtils.output("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
