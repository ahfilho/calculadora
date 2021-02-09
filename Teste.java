import java.util.Scanner;
public class Teste {

    private static Scanner sc = new Scanner(System.in);
	
	private static Operacoes op = new Operacoes();
	
	public static void main(String[] args) {
	menu();	
	}
	private static void menu() {
System.out.println(" 1 - SOMA");
System.out.println(" 2 - SUBTRAI");
System.out.println(" 3 - MULTIPLICA");
System.out.println(" 4 - DIVIDE");
System.out.println(" 5 - MÉDIA");

	int op = sc.nextInt();
	switch(op) {
	case(1):
		soma();
	break;
	case(2):
		subtracao();
		break;
	case(3):
		multiplica();
		break;
	case(4):
		divide();
		break;
	case (5):
		media();
	}

	}

	private static void soma(){
System.out.println("SOMA");
Scanner s = new Scanner(System.in);


op.soma(s.nextInt(),s.nextInt());

System.out.println("\n ADIÇÃO ----::: "+op.getResultadoSoma()+"\n");
	menu();
	}
	
	private static void subtracao(){
		System.out.println("SUBTRAI");
		Scanner scan = new Scanner(System.in);


		op.subtrai(scan.nextInt(),scan.nextInt());

		System.out.println("\n SUBTRAÇÃO ----::: "+op.getResultadoSubtrai()+"\n");
			menu();
			}
	public static void multiplica() {
		System.out.println("MULTIPLICACAO");
		Scanner scaner = new Scanner(System.in);
		op.multiplica(scaner.nextInt(),scaner.nextInt());
		System.out.println("\n MULTIPLICAÇÃO ----:::"+op.getResultadoMulti()+"\n");
		menu();

	}
	public static void divide() {
		System.out.println("DIVISÃO");
		Scanner scc = new Scanner(System.in);
	op.divide(+scc.nextInt(),scc.nextInt());
	System.out.println("\n DIVISÃO ----:::" + op.getResultadoDivide()+"\n");
	menu();
	}
	public static void media() {
		System.out.println("CALCULA MÉDIA");
		Scanner m1 = new Scanner(System.in);
		Scanner m2 = new Scanner(System.in);
		Scanner m3 = new Scanner(System.in);

		op.media(m1.nextDouble(), m2.nextDouble(), m3.nextDouble());
		int divisao = 2;
		System.out.println("\n MÉDIA ----:::"+ op.getResultadoMedia() / divisao +"\n");
		menu();
	}
	}


