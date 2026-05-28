public class Report {

    public void printReport(TaskManager tm) {
        System.out.println("----- INFORME -----");
        Task[] tareas = tm.getTasks();
        System.out.println("Tareas totales: " + tareas.length);
        System.out.println("Tareas completadas: " + tm.getCompletedContador());
        System.out.println("Tareas pendientes: " + tm.getPendingContador());
        System.out.println("Prioridad alta: " + tm.getHighprioridadContador());
        System.out.println("Prioridad media: " + tm.getMediumPrioridadContador());
        System.out.println("Prioridad baja: " + tm.getLowPrioridadContador());

        if (tareas.length > 0) {
            int porcentaje = (tm.getCompletedContador() * 100) / tareas.length;
            System.out.println("Porcentaje completado: " + porcentaje + "%");
        } else {
            System.out.println("Porcentaje completado: 0%");
        }

        System.out.println();
        System.out.println("DETALLE");
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].getHecho()) {
                System.out.println("[OK] " + tareas[i].getTitulo() + " - " + tareas[i].getUsuario());
            } else {
                System.out.println("[ ] " + tareas[i].getTitulo() + " - " + tareas[i].getUsuario());
            }
        }
    }
}