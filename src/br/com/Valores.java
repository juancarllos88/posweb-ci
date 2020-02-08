package br.com;

public class Valores implements ValoresIf {

	private int[] valores = new int[10];

	@Override
	public boolean inserir(int valor) {
		try {
			valores[size()] = valor;
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	@Override
	public int deletar(int indice) {
		if (isEmpty() || indice < 0 || indice > 10) {
			return -1;
		}
		int valorRemovido = valores[indice];
		valores[indice] = 0;
		return valorRemovido;
	}

	@Override
	public int size() {
		int count = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public boolean isEmpty() {
		int count = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == 0) {
				count++;
			}
		}
		return count == 10 ? true : false;
	}

}