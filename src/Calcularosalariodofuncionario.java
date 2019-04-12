
public class Calcularosalariodofuncionario {

   private String nome;
   private int salario;
   private String cargo;
    
   public int calcular_salario(String cargo, int salario){
       switch (cargo){
           
           case "DESENVOLVEDOR":
           if(salario >= 3.000){
               salario = (int) (salario - (0.2 * salario));
               return salario;
           }else{
               salario = (int) (salario - (0.1 * salario));
               return salario;
           }
           case "DBA":
                   if(salario >= 2.000){
                       salario = (int) (salario - (0.25 * salario));
                       return salario;
                       
                   }else {
                       salario = (int) (salario - (0.15 * salario));
                       return salario;
                   }
           case "TESTADOR":
               if(salario >= 2.000){
                   salario = (int) (salario - (0.25 * salario));
                   return salario;
               }else{
                   salario = (int) (salario - (0.15 * salario));
                   return salario;
               }
           case "GERENTE":
               if(salario >= 5.000){
                   salario = (int) (salario - (0.3 * salario));
                   return salario;
               }else{
                   salario = (int) (salario - (0.2 * salario));
                   return salario;
               }
       }
        return salario;
   }
}
   