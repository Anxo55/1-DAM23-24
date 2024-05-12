package repaso;

public class CuentaDeAhorros extends Cuenta{

    

public CuentaDeAhorros(float saldo, float tasaAnual, boolean activa) {
        super(saldo, tasaAnual);
        this.activa = activa;
    }

private boolean activa;


//metodo SIMILAR a un metodo set
public boolean isActiva() {
    if(this.getSaldo()>10000) {
        return true;
    }else{
        return false;
    }

}

public void setActiva(boolean activa) {
    this.activa = activa;
}



// metodos de ejercicio

@Override
public void consignar(float cantidad) {
    if (activa) 
        super.consignar(cantidad);
    else
        System.out.println("Cuenta NO activa");
}

@Override
public void retirar(float cantidad) {
    if (activa) {
        super.retirar(cantidad);
    }else{
        System.out.println("Cuenta NO activa");
    }
}

@Override
public void extractoMensual() {
    if(this.getNumeroRetiros()>4) {
        this.comisionMensual = (this.getNumeroRetiros()-4)*1000;
        // si no usas el super no usuaria el de la clase que hereda.
        super.extractoMensual();
        // debemos comprabar si todavia el saldo es o no mayor que 10000.
        activa = isActiva();
    }
}

@Override
public String toString() {
    return super.toString() + "CuentaDeAhorros [activa=" + activa + "]";
}


    
}
