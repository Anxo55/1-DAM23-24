package cartas;

import java.util.ArrayList;
import java.util.Objects;

public class CartaF implements Comparable<CartaF>{
    
	
        static final String[] tipopalo= {"corazones","diamantes","tréboles","picas"};
        static final String[] pos= {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Valet","Dame","Roi"};
        private String palo;
        private String valor;
        
        public static int dimeIndice(String s) {
            int v=-1;
            for (int i = 0; i < pos.length; i++) {
                if (s.equals(pos[i])) {
                    v=i;
                }
                
            }
            return v;
        }
        
        public static String[] darValores() {
            return pos;
        }
        
        public static ArrayList<CartaF> generarBaraja(){
            ArrayList<CartaF> baraja=new ArrayList<CartaF>();
            for (String v : pos) {
                for (String p : tipopalo) {
                    baraja.add(new CartaF(p,v));
                }
            }
            return baraja;
                    
            
        }
        
        CartaF(String palo,String valor){
            this.palo=palo;
            this.valor=valor;
        }
        
        CartaF(){
            this.palo=tipopalo[(int)(Math.random()*4)];
            this.valor=pos[(int)(Math.random()*10)];	
        }
    
        public String getPalo() {
            return palo;
        }
    
        public void setPalo(String palo) {
            this.palo = palo;
        }
    
        public String getValor() {
            return valor;
        }
    
        public void setValor(String valor) {
            this.valor = valor;
        }
    
        @Override
        public String toString() {
            return "Carta [palo=" + palo + ", valor=" + valor + "]";
        }
    
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            CartaF other = (CartaF) obj;
            return Objects.equals(palo, other.palo) && Objects.equals(valor, other.valor);
        }
        
        @Override
        public int compareTo(CartaF o) {
            // TODO Auto-generated method stub
            if(this.getPalo().equals(o.getPalo())) {
                return dimeIndice(this.getValor())-(dimeIndice(o.getValor()));
            }else {
                return this.getPalo().compareTo(o.getPalo());
            }
        }
        
        
        
    
    }
