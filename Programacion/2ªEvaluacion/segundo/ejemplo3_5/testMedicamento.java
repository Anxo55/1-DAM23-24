package segundo.ejemplo3_5;

public class testMedicamento {

    public static void main(String[] args) {

        Medicamento magico = new Medicamento("mana", "godInc", "oral");

        /*ClasePrincipal objetoExterno = new ClasePrincipal();
        * ClaseInterna objetoInterna = ClasePrincipal.new ClaseInterna();    
        */ 

        Medicamento.Posologia posh = magico.new Posologia();

        magico.setPosologia(posh);

        System.out.println(magico);

        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "Oral");

        Medicamento.Posologia posologia= medicamento.new Posologia("Adultos y mayores de 16 años", 500, "& horas", "No lo debe tomar con el estomago vacio");

        medicamento.setPosologia(posologia);
        System.out.println(medicamento);
        
        System.out.println(medicamento.posologia.toString());
        
        
    }
    
}
