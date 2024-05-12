package segundo.ejemplo3_5;

public class Paquete {

    enum TipoEnvio {
        NACIONAL, INTERNACIONAL
    }

    enum TipoContenido {
        MERCANCIA, DOCUMENTO
    }

    Persona remitente;
    Persona destinatario;
    TipoEnvio tipoEnvio;
    TipoContenido tipoContenido;
    double peso;

    public Paquete(Persona remitente, Persona destinatario, TipoEnvio tipoEnvio, TipoContenido tipoContenido, double peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.tipoEnvio = tipoEnvio;
        this.tipoContenido = tipoContenido;
        this.peso = peso;
    }

    

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }



    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }



    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }



    public void setTipoContenido(TipoContenido tipoContenido) {
        this.tipoContenido = tipoContenido;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }

    



    @Override
    public String toString() {
        return "Paquete [remitente=" + remitente + ", destinatario=" + destinatario + ", tipoEnvio=" + tipoEnvio
                + ", tipoContenido=" + tipoContenido + ", peso=" + peso + "]";
    }


    class Persona{
        String nombre;
        String apellido;
        long id;   
        String direccion;
        long telefono;

        Persona(String nombre, String apellido, long id, String direccion, long telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.id = id;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        

        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", direccion=" + direccion
                    + ", telefono=" + telefono + "]";
        }

    }

    public double valorPaquete() {
        double valor = 0d;
        int unitario = 0;

        if (this.tipoEnvio == TipoEnvio.NACIONAL) {
            if(this.tipoContenido == TipoContenido.DOCUMENTO) {
                if(peso>2) 
                    unitario = 3000;
                else
                    unitario = 2000;
                }   

            if(this.tipoContenido == TipoContenido.MERCANCIA) {
                if(peso>5) 
                    unitario = 7000;
                else
                    unitario = 5000;

            }         
        }

        
        if (this.tipoEnvio == TipoEnvio.INTERNACIONAL) {
            if(this.tipoContenido == TipoContenido.DOCUMENTO) {
                if(peso>2) 
                    unitario = 15000;
                else
                    unitario = 10000;

            }   

            if(this.tipoContenido == TipoContenido.MERCANCIA) {
                if(peso>5) 
                    unitario = 20000;
                else
                    unitario = 12000;
                }         
        }

        return peso*unitario;
    }
    
}
