package somavetor;
import java.util.Scanner;
import java.util.InputMismatchException;

  public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dados[]= new int[10];
        //leitura
        for (int i = 0; i < dados.length; i++){
        System.out.println ("digite um valor para o índice " + i + ":");
        try{
         dados[i]=sc.nextInt();
         }catch (InputMismatchException e){
            sc.nextLine();
            i--;
            System.out.println ("permitido apenas valores numéricos ");
           //dados [i]= sc.nextInt();
            }
       }//soma dos elementos
       int soma=0;
       try{
       for (int i = 0; i < 15 ; i++)
        soma = soma + dados[i];
          }catch (ArrayIndexOutOfBoundsException e){
           System.out.println ("valor excede estimado");
       } 
       System.out.println (" a soma dos elemntos é :" + soma);
          sc.close();
    }
}
