package br.com;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValoresTest {

	Valores valores;

	@BeforeEach
	public void iniciar() {
		valores = new Valores();
	}

	@AfterEach
	public void finalizar() {
		valores = null;
	}

	@Test
	public void testInserir() {
		assertTrue(valores.inserir(1));
	}

	@Test
	public void testFalhaInserir() {
		adicionarValores(10);
		assertFalse(valores.inserir(1));
	}

	@Test
	public void testDeletar() {
		adicionarValores(10);
		assertEquals(10, valores.deletar(9));
	}

	@Test
	public void testDeletarComArrayVazio() {
		assertEquals(-1, valores.deletar(0));
	}

	@Test
	public void testDeletarComIndiceNegativo() {
		adicionarValores(10);
		assertEquals(-1, valores.deletar(-1));
	}

	@Test
	public void testSize() {
		adicionarValores(5);
		assertEquals(5, valores.size());
	}

	private void adicionarValores(int quantidade) {
		for (int i = 1; i <= quantidade; i++) {
			valores.inserir(i);
		}
	}

}
