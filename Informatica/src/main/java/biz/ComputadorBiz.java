package biz;

import entity.Computador;
import repositories.Mensagem;

public class ComputadorBiz {

    public Mensagem msg;

    public ComputadorBiz(){msg = new Mensagem();}

    public Boolean Validade(Computador Computador){

        Boolean result = true;

        if(Computador.getNome().isEmpty()){
            msg.mensagens.add("O nome não pode ser vazio");
            result = false;
        }

        if(Computador.getNome().isEmpty()){
            msg.mensagens.add("O nome não pode ser vazio");
            result = false;
        }

        if(Computador.getNome().isEmpty()){
            msg.mensagens.add("O nome não pode ser vazio");
            result = false;
        }

        if(Computador.getNome().isEmpty()){
            msg.mensagens.add("O nome não pode ser vazio");
            result = false;
        }

        if(Computador.getNome().isEmpty()){
            msg.mensagens.add("O nome não pode ser vazio");
            result = false;
        }

        if(Computador.getPreco().isNaN()){
            msg.mensagens.add("O campo não pode ser nulo");
            result = false;
        }
        return result;
    }
}
