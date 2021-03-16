package Atividade3;

import com.thoughtworks.xstream.XStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        XStream xstream = new XStream();
        String xmlGerado = xstream.toXML(funcionario);

        FileWriter arquivo = new FileWriter("src/" + funcionario.getCpf() + ".txt");
        PrintWriter gravador = new PrintWriter(arquivo);

        gravador.println(xmlGerado);
        arquivo.close();
    }

    private static void leitor(String cpf) {
        try {
            XStream xstream = new XStream();
            xstream.alias("funcionario", Funcionario.class);
            xstream.useAttributeFor(Funcionario.class, "cargo");

            FileReader arquivo = new FileReader("src/" + cpf + ".txt");
            BufferedReader ler = new BufferedReader(arquivo);

            String xml = ler.lines().collect(Collectors.joining());
            Funcionario f = (Funcionario) xstream.fromXML(xml);
            System.out.println(f.getHabilidades());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
