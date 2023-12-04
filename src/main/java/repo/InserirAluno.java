package repo;

import data.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InserirAluno {

    public static void main(String[] args) {
        try {
            //abrindo uma conexão
            Connection conexao = ConnectionFactory.createConnection();

            //criar o SQL para inserir dados no banco
            String sql = "insert into aluno(id,nome, email) values (?,?,?)";

            //criando um comando para passar o sql
            PreparedStatement cmd = conexao.prepareStatement(sql);
            cmd.setInt(1, 1);
            cmd.setString(2, "Ale");
            cmd.setString(3, "ale@ale");

            //executa o comando
            cmd.execute();
            cmd.close();
            System.out.println("Incluido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
