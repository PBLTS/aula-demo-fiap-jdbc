package repo;



import data.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BuscarAluno {


    public static void main(String[] args) {
        String alunos = null; //variavel para receber os dados
        try {
            //abrindo uma conexão
            Connection conexao = ConnectionFactory.createConnection();
            //criar o SQL para extrai dados do banco
            String sql = "select * from aluno";
            //criando comando...
            PreparedStatement cmd = conexao.prepareStatement(sql);
            //executando o comando...
            ResultSet resultado = cmd.executeQuery(); //resultado recebe o os dados da consulta


            alunos = "<< Alunos encontrados >>\n";
            while(resultado.next()){ //percorre todos os dados do retorno da consulta
                alunos += "ID -> " + resultado.getInt("id") //add cada item na string manuscritos
                        + " - Titulo -> " + resultado.getString("nome")
                        + " - Autor -> " + resultado.getString("email")
                        + "\n";
            }

            System.out.println(alunos);

            conexao.close(); //fecha a conexão

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
