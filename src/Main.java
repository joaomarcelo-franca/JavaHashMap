import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Criando o hashmap de String e Inteiros
        HashMap<String, Integer> mapaMatricula = new HashMap<>();

//        Adicionando dados no hashmap com o metodo put
        mapaMatricula.put("Joao", 1);
        mapaMatricula.put("Augusto", 2);
        mapaMatricula.put("Maurity", 3);
        mapaMatricula.put("Gustavo", 4);
        mapaMatricula.put("Joao Miguel", 5);

//        Usando o metodo get pegamos os valor(Int) pela chave (String)
        System.out.println("A Matricula do Augusto é: " + mapaMatricula.get("Augusto"));

//          Pegando os nomes e matriculas
        for (String nome :
                mapaMatricula.keySet()) {
            int matricula = mapaMatricula.get(nome);
            System.out.println(nome + " tem Matricula " + matricula);
        }

//        Removendo um elemento do hashmap
        mapaMatricula.remove("Gustavo");

    }
}