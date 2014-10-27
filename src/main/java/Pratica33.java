import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz transp = orig.getTransposta();
        System.out.println("Matriz original: " + orig);
        System.out.println("Matriz transposta: " + transp);
        Matriz A = new Matriz(2,2);
        Matriz B = new Matriz(2,2);
        double[][] a = A.getMatriz();
        a[0][0] = 0.0;
        a[0][1] = 1.0;
        a[1][0] = 2.0;
        a[1][1] = 3.0;
        double[][] b = B.getMatriz();
        b[0][0] = 0.0;
        b[0][1] = 0.2;
        b[1][0] = 0.4;
        b[1][1] = 0.6;
        System.out.println("Matriz A: " + A);
        System.out.println("Matriz B: " + B);
        System.out.println("A + B: " + A.soma(B));
        System.out.println("A x B: " + A.prod(B));
    }
       
}
