package tres.resueltos;

// 65 - 90 mayusculas
// 97-122 minusculas

public class Letras {

    private char letra;

    Letras(char letra) {
        this.letra = ponMayuscula(letra);
    }

    public char ponMayuscula(char letra) {
        if(letra >= 97 && letra <= 122) {
            letra = (char ) (letra - 32);
                return letra;
        }
        return letra;

    }

    public char getLetra() {
        return letra;
    }

    public void setLetra() {
        this.letra=ponMayuscula(letra);
    }

    @Override
    public String toString() {
        return "Letras [letra=" + letra + "]";
    }

}
