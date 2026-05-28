public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        // 👈 CAMBIADO: Pasamos los elementos de Priority directamente
        tm.addTask("hacer memoria", "ana", Prioridad.MEDIUM);
        tm.addTask("subir repositorio", "luis", Prioridad.LOW);
        tm.addTask("refactorizar codigo", "ana", Prioridad.HIGH);
        tm.addTask("hacer diagrama", "marta", Prioridad.MEDIUM);

        tm.completarTask("subir repositorio");
        tm.cambiarPrioridad("hacer memoria", Prioridad.HIGH); // 👈 CAMBIADO

        tm.listarTasks();
        System.out.println();
        tm.mostrarTasksByUsuario("ana");
        System.out.println();

        Report r = new Report();
        r.printReport(tm);

        System.out.println();
        System.out.print("Total tareas: ");
        System.out.println(tm.getContador());
    }
}