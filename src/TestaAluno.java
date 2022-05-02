
public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.nome = "Isac";
		aluno.rg = "32089455-6";
		aluno.dataDeNascimento = "02/06/2005";
		System.out.println(aluno.nome + " " + aluno.rg + " " + aluno.dataDeNascimento);
	}
}
