public class Principal {

	public static void main(String[] args) {
		Carro car = new Carro();
		car.setValorLicenciado(new ValorLicenciadoVM());
		car.verValor();
	}

}
