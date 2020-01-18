
public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(1111, 11111);
		cc.deposita(101.0);
		cc.saca(101.0);
		
		System.out.println(cc.getSaldo());
	}
}
