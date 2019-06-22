//ReadMe
//Para essa classe funcionar você precisa implementar "serializable", é só escrever
//implements Serializable, no classe Pessoa
//O metodo "Gravar" vai receber o objeto do tipo "Pessoa" que você quer salvar
//E o nome do arquivo que você quer salvar,(NÃO ESQUECER DE COLOCAR .txt)
//E o "Ler" vai pedir o nome do arquivo (Não esquecer do .txt) e retornar um objeto
//Isso quer dizer que na hora de implementar ele você cria um novo objeto e
//iguala ele com a função "Ler", que o objeto que você criou vai receber os atributos do
// objeto do arquivo 


package teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LerGravar {
    
    
    
    public void Gravar(Pessoa p,String arqNome){
    try{
     
         FileOutputStream arquivo = new FileOutputStream(arqNome);
         ObjectOutputStream objeto = new ObjectOutputStream(arquivo);
         objeto.writeObject(p);
         objeto.flush();
         System.out.println("Objeto Gravado :D");
         
     }
     
     catch(Exception e){
         System.out.println("Erro, não foi possivel gravar :/");
     
     }
    }
    
    public Pessoa Ler (String n){
    
    try{
     
         FileInputStream arquivo = new FileInputStream(n);
         ObjectInputStream objeto = new ObjectInputStream(arquivo);
         Pessoa p1 = (Pessoa)objeto.readObject();
         System.out.println("Objeto foi lido :D");
         return p1;       
         
     }
     
     catch(Exception e){
         System.out.println("Erro, arquivo não encontrado :/");
         return null;
     }      
    
    
    }
    
    
    
    
}
