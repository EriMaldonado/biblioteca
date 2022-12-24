package biblioteca;


public class Prestamo {
    private date fechaPrestamo;
    private date fechaDevolucion;
    private boolean  atrasado;

    public Prestamo(date fechaPrestamo, date fechaDevolucion, boolean atrasado) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.atrasado = atrasado;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", atrasado=" + atrasado + '}';
    }

    public date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }
    
    private static class date {
        public date() {
        }
    }

    
}
