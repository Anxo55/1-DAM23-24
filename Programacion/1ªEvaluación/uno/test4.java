package uno;

public class test4 {

    public static void main(String[] args) {
        
        int m=2, n=5;
        boolean res;

        res =m > n && m >= n;//res=false
        System.out.println(res);

        res =!(m < n || m != n);//res=false // != significa distinto //al tener el (!) al principio cambia el resultado por eso es false
        // y no true
        System.out.println(res);

    }
    
}
