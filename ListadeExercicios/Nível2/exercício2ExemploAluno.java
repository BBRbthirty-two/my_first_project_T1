	class exercicio2ALN2 {
		public static void main (String[] args) {

		int nota = 100;
		int frequência = 60;
		boolean A = nota >= 50;
		boolean B = frequência >= 75;

		boolean cond1, cond2, cond3;

		cond1 = A && B; 
		cond2 = !A || !B;
		cond3 = !A;


		System.out.println ("O aluno será aprovado se tiver Nota e Frequencia:  "	+ cond1);
		System.out.println ("O aluno reprovará se: "	+ cond2);
		System.out.println ("Inverso de A: " + cond3);





	}
}