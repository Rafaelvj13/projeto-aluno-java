package curso.executavel;

import cursojava.classes.Aluno;

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

        String disciplia1 = JOptionPane.showInputDialog("informe a disciplina 1:");
        String nota1 = JOptionPane.showInputDialog("digite a nota 1 ");

        String disciplia2 = JOptionPane.showInputDialog("informe a disciplina 2:");
        String nota2 = JOptionPane.showInputDialog("digite a nota 2 ");

        String disciplia3 = JOptionPane.showInputDialog("informe a disciplina 3:");
        String nota3 = JOptionPane.showInputDialog("digite a nota 3 ");

        String disciplia4 = JOptionPane.showInputDialog("informe a disciplina 4:");
        String nota4 = JOptionPane.showInputDialog("digite a nota 4 ");


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

        aluno1.setDisciplina1(disciplia1);
        aluno1.setNota1(Double.parseDouble(nota1));

        aluno1.setDisciplina2(disciplia2);
        aluno1.setNota2(Double.parseDouble(nota2));

        aluno1.setDisciplina3(disciplia3);
        aluno1.setNota3(Double.parseDouble(nota3));

        aluno1.setDisciplina4(disciplia4);
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado());






    }
}
