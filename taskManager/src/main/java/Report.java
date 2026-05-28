public class Report {

    public void printReport(TaskManager tm) {
        System.out.println("----- INFORME -----");
        System.out.println("Tareas totales: " + tm.getContador());
        System.out.println("Tareas completadas: " + tm.getCompletedCount());
        System.out.println("Tareas pendientes: " + tm.getPendingCount());
        System.out.println("Prioridad alta: " + tm.getHighPriorityCount());
        System.out.println("Prioridad media: " + tm.getMediumPriorityCount());
        System.out.println("Prioridad baja: " + tm.getLowPriorityCount());

        if (tm.getContador() > 0) {
            int porcentaje = (tm.getCompletedCount() * 100) / tm.getContador();
            System.out.println("Porcentaje completado: " + porcentaje + "%");
        } else {
            System.out.println("Porcentaje completado: 0%");
        }

        Task[] tareas = tm.getTasks();
        System.out.println();
        System.out.println("DETALLE");
        for (int i = 0; i < tm.getContador(); i++) {
            if (tareas[i].getHecho()) {
                System.out.println("[OK] " + tareas[i].getTitulo() + " - " + tareas[i].getUsuario());
            } else {
                System.out.println("[ ] " + tareas[i].getTitulo() + " - " + tareas[i].getUsuario());
            }
        }
    }
}