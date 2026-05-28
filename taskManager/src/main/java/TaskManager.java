import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String titulo, String usuario, Prioridad prioridad) {
        if (titulo != null && usuario != null && !titulo.equals("") && !usuario.equals("")) {
            if (prioridad != null) {
                tasks.add(new Task(titulo, usuario, prioridad));
                System.out.println("Tarea añadida");
            } else {
                System.out.println("Prioridad incorrecta");
            }
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    public void completarTask(String titulo) {
        for (Task task : tasks) {
            if (task.getTitulo().equals(titulo)) {
                task.setHecho(true);
                System.out.println("Tarea completada");
            }
        }
    }

    public void cambiarPrioridad(String titulo, Prioridad p) {
        for (Task task : tasks) {
            if (task.getTitulo().equals(titulo)) {
                if (p != null) {
                    task.setPrioridad(p);
                    System.out.println("Prioridad cambiada");
                } else {
                    System.out.println("Prioridad no valida");
                }
            }
        }
    }

    public void listarTasks() {
        System.out.println("LISTADO DE TAREAS");
        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }

    public void mostrarTasksByUsuario(String usuario) {
        System.out.println("TAREAS DE ".concat(usuario.toUpperCase()));
        for (Task task : tasks) {
            if (task.getUsuario().equals(usuario)) {
                System.out.println(task.toString());
            }
        }
    }


    public int getPendingContador() {
        return (int) tasks.stream().filter(task -> !task.getHecho()).count();
    }

    public int getCompletedContador() {
        return (int) tasks.stream().filter(Task::getHecho).count();
    }

    public int getHighprioridadContador() {
        return (int) tasks.stream().filter(task -> task.getPrioridad() == Prioridad.HIGH).count();
    }

    public int getMediumPrioridadContador() {
        return (int) tasks.stream().filter(task -> task.getPrioridad() == Prioridad.MEDIUM).count();
    }

    public int getLowPrioridadContador() {
        return (int) tasks.stream().filter(task -> task.getPrioridad() == Prioridad.LOW).count();
    }

    public int getContador() {
        return tasks.size(); // 👈 La lista ya sabe su tamaño, eliminamos la variable 'contador'
    }

    public Task[] getTasks() {
        return tasks.toArray(new Task[0]);
    }
}