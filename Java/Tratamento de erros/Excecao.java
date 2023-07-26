public class Excecao {
    public static void main(String[] args){
        try{
            int vetor[]= new int[4];
        System.out.println("Antes da excecao");
        vetor[5] = 10;
        System.out.println("Esse texto nao sera impresso");
        } catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Erro ao acessar um indice do vetor que nao existe");
            
        }
        System.out.println("Esse texto sera exibido apos a exception");
    }
    
}
