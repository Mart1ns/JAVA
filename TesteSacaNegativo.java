
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
	
	
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		
		conta.saldo = conta.saldo - 101;
		System.out.print(conta.saldo);
		
}
}