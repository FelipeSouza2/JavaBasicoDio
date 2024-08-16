import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.print("Primeiro parametro: ");
            int parametroUm = terminal.nextInt();
            System.out.printf("Segundo parametro: ");
            int parametroDois = terminal.nextInt();

            try{
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception){
                System.out.println("O segundo parametro deve ser maior que o primeiro");
            }
        
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois< parametroUm){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int c=0; c<= contagem; c++){
                System.out.println(c);
            }
        }
        
    }
}
