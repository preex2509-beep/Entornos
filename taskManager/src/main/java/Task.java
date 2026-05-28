public class Task {
    private String titulo;
    private String usuario;
    private Prioridad prioridad;
    private boolean hecho;

    public Task(String t, String u, Prioridad p) { 
        titulo = t;
        usuario = u;
        prioridad = p;
        hecho = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public boolean getHecho() {
        return hecho;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setUsuario(String u) {
        usuario = u;
    }

    public void setPrioridad(Prioridad p) { // 👈 CAMBIADO: Recibe Prioridad
        prioridad = p;
    }

    public void setHecho(boolean d) {
        hecho = d;
    }

    public String toString() {
        String s = "";
        s = s + "Tarea: " + titulo + " | ";
        s = s + "Usuario: " + usuario + " | ";
        s = s + "Prioridad: " + prioridad + " | "; // 👈 Mostrará LOW, MEDIUM o HIGH
        s = s + "Estado: ";
        if (hecho) {
            s = s + "HECHA";
        } else {
            s = s + "PENDIENTE";
        }
        return s;
    }
}