import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        Funcionario funcionario = new Funcionario(
                "09012424145",
                "Alberto",
                23,
                1983.50,
                "Deusenvolvedor",
                new ArrayList<String>(List.of("CSS", "HTML5", "Javascript")));

        gravador(funcionario);
        leitor(funcionario.getCpf());
    }

    private static void gravador(Funcionario funcionario) throws IOException {
        Gson gson = new Gson();
        FileWriter arquivo = new FileWriter("src/" + funcionario.getCpf() + ".txt");
        PrintWriter gravador = new PrintWriter(arquivo);

        gravador.println(gson.toJson(funcionario));
        arquivo.close();
    }

    private static void leitor(String cpf) {
        Gson gson = new Gson();
        try {
            FileReader arquivo = new FileReader("src/" + cpf + ".txt");
            BufferedReader ler = new BufferedReader(arquivo);

            String json = ler.readLine();
            Funcionario funcionario = gson.fromJson(json, Funcionario.class);
            System.out.println(funcionario.getNome());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
