package com.view;

import java.util.List;

import com.Utils.TerminalUtils;
import com.controller.MesaController;
import com.model.entities.Mesa;

public class MesaView {
    private MesaController mesaController;

    public MesaView() {
        this.mesaController = new MesaController();
    }

    public void mostrar() {
        int opcion;

        do {
            TerminalUtils.output("=== Menú mesas ===");
            TerminalUtils.output("1. Registrar Mesa");
            TerminalUtils.output("2. Mostrar Mesas");
            TerminalUtils.output("3. Eliminar Mesa");
            TerminalUtils.output("4. Actualizar Mesa");
            TerminalUtils.output("0. Volver");
            TerminalUtils.output("Selecciona una opción:");
            opcion = TerminalUtils.inputInt();

            switch (opcion) {
                case 1:
                    TerminalUtils.output("Número de personas:");
                    int numPersonas = TerminalUtils.inputInt();
                    TerminalUtils.output("ID de menú (0 si no tiene):");
                    int idMenu = TerminalUtils.inputInt();
                    mesaController.crearMesa(numPersonas, idMenu == 0 ? null : idMenu);
                    break;

                case 2:
                    List<Mesa> mesas = mesaController.obtenerMesa();
                    for (Mesa m : mesas) {
                        TerminalUtils.output(m.toString());
                    }
                    break;

                case 3:
                    TerminalUtils.output("ID mesa a eliminar:");
                    int idEliminar = TerminalUtils.inputInt();
                    mesaController.eliminarMesa(idEliminar);
                    break;

                case 4:
                    TerminalUtils.output("ID mesa a actualizar:");
                    int idActualizar = TerminalUtils.inputInt();
                    TerminalUtils.output("Nuevo número de personas:");
                    int nuevasPersonas = TerminalUtils.inputInt();
                    TerminalUtils.output("Nuevo ID menú (0 si no tiene):");
                    int nuevoMenu = TerminalUtils.inputInt();
                    mesaController.actualizarMesa(idActualizar, nuevasPersonas, nuevoMenu == 0 ? null : nuevoMenu);
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
