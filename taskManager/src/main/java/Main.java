public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask("hacer memoria", "ana", 2);
        tm.addTask("subir repositorio", "luis", 1);
        tm.addTask("refactorizar codigo", "ana", 3);
        tm.addTask("hacer diagrama", "marta", 2);

        tm.completarTask("subir repositorio");
        tm.cambiarPrioridad("hacer memoria", 3);

        tm.listarTasks();
        System.out.println();
        tm.mostrarTasksByUser("ana");
        System.out.println();

        Report r = new Report();
        r.printReport(tm);

        System.out.println();
        System.out.println("Total tareas: " + tm.getContador());
    }
}