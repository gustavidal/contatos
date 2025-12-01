package br.com.gustavo.contatos.model;

import java.util.UUID;

public class Contato {

    public String nome;
    public String telefone;
    public String email;
    public String id = UUID.randomUUID().toString(); // UUID -> Identificador único universal

    public String serializarContato(){
        String contatoSerializado = id + ";" + nome + ";" + email + ";" + telefone + "\n";
        return contatoSerializado;
    }
}
