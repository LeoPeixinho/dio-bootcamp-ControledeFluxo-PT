import java.util.Scanner;
public class Contador {
    public static void main(String[] args)  {
       Scanner sc = new Scanner (System.in);
       
       System.out.println("Digite o primeiro parâmetro: ");
       int parametroUm = sc.nextInt();
       System.out.println("Digite o segundo parâmetro: ");
       int parametroDois = sc.nextInt();
       sc.close();
       try{
        Contador contador = new Contador();
        contador.contar(parametroUm, parametroDois);
       } 
       catch (IllegalArgumentException e){
        System.out.println("O parâmetro dois precisa ser maior doque o parâmetro um");
        } 

    }
    public void contar (int parametroUm , int parametroDois) throws IllegalArgumentException{
        if (parametroUm > parametroDois ){
            throw new IllegalArgumentException ("O parâmetro dois deve ser maior doque o parâmetro um");
        }
        for(int x = parametroDois; x > parametroUm;x--){
            int operacao = x - parametroUm; 

            System.out.println("Imprimindo o número: " + operacao);
        } 

    }
}
