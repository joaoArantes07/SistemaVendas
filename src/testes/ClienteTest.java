package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigos.Cliente;

class ClienteTest {

	@Test
	void testComprar_itens() {
		
		codigos.Cliente Cliente = new Cliente("Teste",123456789,"teste@gmail.com","123",5000);
		double resultado = Cliente.comprar_itens(1000,1) ;
		double esperado = 4050;
		assertTrue(resultado == esperado);

	}
	@Test
	void testComprar_itens2() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",5000);
		double resultado = Cliente.comprar_itens(1000,2);
		double esperado = 3790;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testComprar_itens3() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",5000);
		double resultado = Cliente.comprar_itens(1000,3);
		double esperado = 3272;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testComprar_itens4() {
		
		codigos.Cliente Cliente = new Cliente("Teste",123456789,"teste@gmail.com","123",3000);
		double resultado = Cliente.comprar_itens(1000,1) ;
		double esperado = 2050;
		assertTrue(resultado == esperado);
		
	}
	

	@Test
	void testAdicionar_fundos() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		double resultado = Cliente.adicionar_fundos(100);
		double esperado = 100;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testAdicionar_fundos2() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		double resultado = Cliente.adicionar_fundos(200);
		double esperado = 200;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testAdicionar_fundos3() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		double resultado = Cliente.adicionar_fundos(300);
		double esperado = 300;
		assertTrue(resultado == esperado);
	}
	@Test
	void testAdicionar_fundos4() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		double resultado = Cliente.adicionar_fundos(400);
		double esperado = 400;
		assertTrue(resultado == esperado);
	}

	@Test
	void testAdicionar_fundos5() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		double resultado = Cliente.adicionar_fundos(500);
		double esperado = 500;
		assertTrue(resultado == esperado);
	}
	@Test
	void testLogar_sistema() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		boolean resultado = Cliente.logar_sistema("test@gmail.com","123");
		boolean esperado = false;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testLogar_sistema2() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		boolean resultado = Cliente.logar_sistema("teste@gmail.com","123");
		boolean esperado = true;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testLogar_sistema3() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		boolean resultado = Cliente.logar_sistema("teste@gmail.com","1234");
		boolean esperado = false;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testLogar_sistema4() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		boolean resultado = Cliente.logar_sistema("test@gmail.com","12345");
		boolean esperado = false;
		assertTrue(resultado == esperado);
	}
	
	@Test
	void testLogar_sistema5() {
		codigos.Cliente Cliente = new Cliente ("Teste",123456789,"teste@gmail.com","123",0);
		boolean resultado = Cliente.logar_sistema("teste@gmail.com","123456");
		boolean esperado = false;
		assertTrue(resultado == esperado);
	}
	
}

