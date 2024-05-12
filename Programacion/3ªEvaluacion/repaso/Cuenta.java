package repaso;

public class Cuenta {

/*
	 * Dearrollar un programa que modele una cuenta bancaria que tiene los
	 * siguientes atributos, que deben de acceso protegido: - Saldo, de tipo float -
	 * Número de consignaciones con valor inicial cero, de tipo int - Tasa anual
	 * (porcentaje, de tipo float - Comision mensual con valor inicial cero, de tipo
	 * float
	 */

	/*
	 * La clase cuenta tiene un constructor que inicializa los atributos saldo y
	 * tasa anual con valores pasados como parametros.
	 * 
	 * La clase cuenta tiene los siguinets metodos: consignar una cantidad de dinero
	 * de la cuenta actualizando tu saldo, retrar una cantidad de dinero en la
	 * cuenta actualizando tu saldo, el valor a retirar no deve superar el saldo,
	 * calcular el interes mensual de la cuenta y actualiza el saldo
	 * correspondiente, extracto mensual: actualiza el saldo rstandole la comision
	 * mensual y calculando el interes mensual correspondiente (invoca el método
	 * anterior)
	 * 
	 */

     private float saldo;
     private int numeroConsignaciones = 0;
     private int numeroRetiros = 0;
     private float tasaAnual; // en porcentaje
     
     /* Atributo que define la comision mensual */
     protected float comisionMensual = 0;

     public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
     }
     
     
 
     public void consignar(float cantidad) {
         saldo += cantidad;
         numeroConsignaciones++;
     }
     
     public void retirar(float cantidad) {
         float nuevoSaldo = saldo - cantidad;
         
         if(nuevoSaldo >= 0) {
             saldo -= cantidad;
             numeroRetiros++;
         }else {
             System.out.println("La cantidad a retirar excede el saldo actual");
         }
         
     
     }
     public void calcularInteres() {
         float tasaMensual = tasaAnual / 12;
         
         float interesMensual = saldo * tasaMensual;
         saldo += interesMensual;
         }
     
     public void extractoMensual() {
         saldo -= comisionMensual;
         calcularInteres();
     }
     
 
 
     public float getSaldo() {
         return saldo;
     }
 
     public void setSaldo(float saldo) {
         this.saldo = saldo;
     }
 
     public int getNumeroConsignaciones() {
         return numeroConsignaciones;
     }
 
     public void setNumeroConsignaciones(int numeroConsignaciones) {
         this.numeroConsignaciones = numeroConsignaciones;
     }
 
     public int getNumeroRetiros() {
         return numeroRetiros;
     }
 
     public void setNumeroRetiros(int numeroRetiros) {
         this.numeroRetiros = numeroRetiros;
     }
 
     public float getTasa_anual() {
         return tasaAnual;
     }
 
     public void setTasa_anual(float tasa_anual) {
         this.tasaAnual = tasa_anual;
     }
 
     public float getComisionMensual() {
         return comisionMensual;
     }
 
     public void setComisionMensual(float comisionMensual) {
         this.comisionMensual = comisionMensual;
     }
     @Override
     public String toString() {
         return "Cuenta [saldo=" + saldo + ", numeroConsignaciones=" + numeroConsignaciones + ", numeroRetiros="
                 + numeroRetiros + ", tasa_anual=" + tasaAnual + ", comision=" + comisionMensual + "]";
     }
     
 }
