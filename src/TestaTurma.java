import java.lang.ref.Reference;

public class TestaTurma {
	public static void main(String[] args) {
		Turma turmap = new Turma();
		turmap.periodo = "1°";
		
		Turma turmas = new Turma();
		turmas.serie = "B";
		System.out.println(turmap.periodo + turmas.serie);
	}
}
