package Controller;

public class OperacoesController {
	public void vetoriar(int [] x) {
		
		for (int z : x ) {
			System.out.print(z);
			if (z % 2 == 0 ) {
				if(z % 10 ==0){
					System.out.println(" é par e multiplo de 10" );
				}
			}else {
				System.out.println(" é impar");
			}

		}
	}
}
