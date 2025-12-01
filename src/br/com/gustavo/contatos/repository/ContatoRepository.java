package br.com.gustavo.contatos.repository;

import br.com.gustavo.contatos.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private Path arquivo = Paths.get("/Users/25203686/ds1t/contatos.csv");

    public void gravar(){
        try {
            Files.writeString(arquivo, contato.serializarContato(), StandardOpenOption.APPEND);
            System.out.println("Contato " + contato.nome + " gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void listarContatos(){
        try {
            List<String> contatos = Files.readAllLines(arquivo);

            int contador = 0;
            while(contador < contatos.size()){
                String[] linhaContato = contatos.get(contador).split(";");
                System.out.println("NOME: " + linhaContato[1]);
                System.out.println("E-MAIL: " + linhaContato[2]);
                System.out.println("TELEFONE: " + linhaContato[3]);
                System.out.println("-------------------------------");

//                System.out.println(contatos.get(contador));
                contador++;
            }
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }
}
