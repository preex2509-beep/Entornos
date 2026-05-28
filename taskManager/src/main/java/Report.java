public class Report {

    public void printReport(TaskManager tm) {
        System.out.println("----- INFORME -----");

        Task[] tareas = tm.getTasks();
        int totalTareas = tareas.length;

        System.out.println("Tareas totales: " + totalTareas);
        System.out.println("Tareas completadas: " + tm.getCompletedContador());
        System.out.println("Tareas pendientes: " + tm.getPendingContador());
        System.out.println("Prioridad alta: " + tm.getHighprioridadContador());
        System.out.println("Prioridad media: " + tm.getMediumPrioridadContador());
        System.out.println("Prioridad baja: " + tm.getLowPrioridadContador());

        if (totalTareas > 0) {
            int porcentaje = (tm.getCompletedContador() * 100) / totalTareas;
            System.out.println("Porcentaje completado: " + porcentaje + "%");
        } else {
            System.out.println("Porcentaje completado: 0%");
        }

        System.out.println();
        System.out.println("DETALLE");

        for (Task tarea : tareas) {
            if (tarea.getHecho()) {
                System.out.println("[OK] " + tarea.getTitulo() + " - " + tarea.getUsuario());
            } else {
                System.out.println("[ ] " + tarea.getTitulo() + " - " + tarea.getUsuario());
            }
        }
    }
}