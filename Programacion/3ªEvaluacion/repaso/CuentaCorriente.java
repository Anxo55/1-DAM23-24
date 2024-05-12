package repaso;

public class CuentaCorriente extends Cuenta{
    
    private float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        // this.sobregiro = sobregiro;
    }

    // metodos propios

    public void retirar(float cantidad) {
        if (cantidad > this.getSaldo()) {
            // queda en descubierto llamado aqui sobregiro
            sobregiro += cantidad-this.getSaldo();
            // usa el metodo de cuenta para dejar la cuenta a cero
            super.retirar(getSaldo());            
        }else{
            super.retirar(cantidad);
        }
    }

    public void consignar(float cantidad) {
        if (sobregiro>0) {
            if (cantidad>sobregiro) {
                // hago un ingreso
                super.consignar(-sobregiro);
                // y ya no debo
                sobregiro = 0;
            }else{
                sobregiro -= cantidad;
                // this.setNumeroConsignaciones(getNumeroConsignaciones()+1);
                // debo contar un ingresos o consignacion mas
                super.consignar(0);
            }
        }else{
            // no debo nada por tanto ingreso y punto
            super.consignar(cantidad);
        }
    }
    // public void extractoMensual() {
    //     super.extractoMensual();
    // }

    // como no modifico el extracto no voy a sobreescribir el metodo
    // uso el que heredo


    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente [sobregiro=" + sobregiro + "]";
    }

}
