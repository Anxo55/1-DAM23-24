package POO2;

import POO.Cuenta;

// Cuenta Bancaria: 
// Crea una clase CuentaBancaria que permita realizar operaciones como depósito, retiro y consulta de saldo.

public class CuentaBancaria {

//atributos creados por mi
private String propietario;
private int saldo;
private int edad;

//constructor por defecto

CuentaBancaria() {
    this.propietario = "Pepe";
    this.saldo = 1450;
    this.edad = 20;
}

CuentaBancaria(String propietario, int saldo, int edad) {
    this.propietario = propietario;
    this.saldo = saldo;
    this.edad = edad;
}

public String getPropietario() {
    return propietario;
}

public void setPropietario(String propietario) {
    this.propietario = propietario;
}

public int getSaldo() {
    return saldo;
}

public void setSaldo(int saldo) {
    this.saldo = saldo;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

// Crea una clase CuentaBancaria que permita realizar operaciones como depósito, retiro y consulta de saldo.

//metodo que desposita dinero
public int depositarDinero(int dineroDepositar) {
    // int saldo;
    saldo = saldo+dineroDepositar;
    return saldo;
}

//metodo que retira dinero
public int retirarDinero(int dineroRetirar) {
    // int saldo = 0;
    saldo = saldo - dineroRetirar;
    return saldo;
}

@Override
    public String toString() {
        return "CuentaBancaria [propietario=" + propietario + ", saldo=" + saldo + ", edad=" + edad + "]";
    }
    
}
