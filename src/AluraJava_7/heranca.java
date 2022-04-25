package AluraJava_7;

public class heranca {


    String nome (){
        return "Matheus";
    }
    
}


class herancaFilha extends heranca{

    int idade(int idade){
        return idade;
    }

}


class herancaNeta extends herancaFilha{

}


class herancaTeste{
    public static void main(String [] args){

        herancaNeta h = new herancaNeta();

      
       System.out.println(h.nome());
       System.out.println(h.idade(20));

        
       





    }
}