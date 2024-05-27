package curso.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class PrimeiraClasse {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
        String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento");
        String registroGeral = JOptionPane.showInputDialog("Qual o Rg do Aluno?");
        String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da Mãe?");
        String nomePai = JOptionPane.showInputDialog("Qual o nome da Pai?");
        String dataMatricula = JOptionPane.showInputDialog("Qual data da matricula?");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
        String serieMatriculada = JOptionPane.showInputDialog("Qual a serie Matriculada?");


        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatriculada);

        for (int pos = 1; pos <= 4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome disciplina?" +pos+ " ?");
            String notaDisciplina = JOptionPane.showInputDialog("Informe a nota" +pos+ " ?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

        if (escolha == 0) {
            String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 0, 1, 2 ou 3");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);

        }

        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado());






    }
}
