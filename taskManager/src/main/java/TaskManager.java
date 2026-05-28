public class TaskManager {

    private Task[] tasks = new Task[100];
    private int contador = 0;

    public void addTask(String titulo, String usuario, int prioridad) {
        if (titulo != null && usuario != null && !titulo.equals("") && !usuario.equals("")) {
            if (prioridad >= 1 && prioridad <= 3) {
                Task t = new Task(titulo, usuario, prioridad);
                tasks[contador] = t;
                contador++;
                System.out.println("Tarea añadida");
            } else {
                System.out.println("Prioridad incorrecta");
            }
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    public void completarTask(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getTitulo().equals(titulo)) {
                tasks[i].setHecho(true);
                System.out.println("Tarea completada");
            }
        }
    }

    public void cambiarPrioridad(String titulo, int p) {
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getTitulo().equals(titulo)) {
                if (p >= 1 && p <= 3) {
                    tasks[i].setPrioridad(p);
                    System.out.println("Prioridad cambiada");
                } else {
                    System.out.println("Prioridad no valida");
                }
            }
        }
    }

    public void listarTasks() {
        System.out.println("LISTADO DE TAREAS");
        for (int i = 0; i < contador; i++) {
            System.out.println(tasks[i].toString());
        }
    }

    public void mostrarTasksByUsuario(String usuario) {
        System.out.println("TAREAS DE " + usuario.toUpperCase());
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getUsuario().equals(usuario)) {
                System.out.println(tasks[i].toString());
            }
        }
    }

    public int getPendingContador() {
        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getHecho() == false) {
                x++;
            }
        }
        return x;
    }

    public int getCompletedContador() {
        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getHecho() == true) {
                x++;
            }
        }
        return x;
    }

    public int getHighprioridadContador() {
        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getPrioridad() == 3) {
                x++;
            }
        }
        return x;
    }

    public int getMediumPrioridadContador() {
        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getPrioridad() == 2) {
                x++;
            }
        }
        return x;
    }

    public int getLowPrioridadContador() {
        int x = 0;
        for (int i = 0; i < contador; i++) {
            if (tasks[i].getPrioridad() == 1) {
                x++;
            }
        }
        return x;
    }

    public int getContador() {
        return contador;
    }

    public Task[] getTasks() {
        return tasks;
    }
}