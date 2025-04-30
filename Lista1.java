package br.ufba.poo;

import java.io.File;

/**
 * Primeira lista de exercícios de fixação
 */
public class Lista1 {

	/**
	 * Retorna a média aritmética entre dois números.
	 * 
	 * @param a primeiro número
	 * @param b segundo número
	 * @return a média aritmética entre <code>a</code> e <code>b</b>
	 */
	public static double media(double a, double b) {
		return (a+b)/2.0;
	}

	/**
	 * Retorna o maior dos elementos de um array.
	 * 
	 * @param elementos array de números inteiros
	 * @return o valor do maior elemento, ou <code>Integer.MIN_VALUE</code> caso o
	 *         array seja vazio
	 */
	public static int maior(int[] elementos) {
	if (elementos == null || elementos.length == 0) return Integer.MIN_VALUE;
	int maiorValor = elementos[0];
	for (int num : elementos) {
	if (num > maiorValor) maiorValor = num;
	}
	return maiorValor;
	}
	/**
	 * Retorna a primeira letra de um nome.
	 * 
	 * @param nome nome; pode ser <code>null</code>
	 * @return o primeiro caracter de um nome (em letra minúscula), ou espaço em
	 *         branco caso o nome seja <code>null</code> ou uma string vazia
	 */
	public static char primeiraLetra(String nome) {
		if(nome == null || nome.isEmpty()) {
			return ' ';
	}
	 return Character.toLowerCase(nome.charAt(0));
	}

	/**
	 * 
	 * @param nomeDoArquivo nome do arquivo; não pode ser nulo
	 * @return Indica se o nomeDoArquivo representa o nome de um arquivo PDF
	 */
public static boolean ehPdf(String nomeDoArquivo) {
    if (nomeDoArquivo == null || nomeDoArquivo.isEmpty()) {
        return false; // Retorna false se o nome do arquivo for nulo ou vazio
    }
    
    // Verifica se o nome termina com ".pdf", ignorando maiúsculas e minúsculas
    return nomeDoArquivo.toLowerCase().endsWith(".pdf");
}

	/**
	 * Dado um arquivo, torna-o executável. Se o arquivo não existir, não faz nada.
	 * 
	 * @param arquivo Arquivo
	 */
public static void tornaExecutavel(File arquivo) {
    // Verifica se o arquivo existe
    if (arquivo != null && arquivo.exists()) {
        // Torna o arquivo executável
        arquivo.setExecutable(true);
    }
}
	/**
	 * Verifica se a senha digitada está correta.
	 * 
	 * @param senhaCorreta  senha correta
	 * @param senhaDigitada senha digitada pelo usuário
	 * @return <code>true</code> se as duas senhas são iguais; <code>false</code>
	 *         caso contrário
	 */
public static boolean validaSenha(String senhaCorreta, String senhaDigitada) {
    if (senhaCorreta == null || senhaDigitada == null) {
        return false; // Retorna false se alguma das senhas for null
    }
    return senhaCorreta.equals(senhaDigitada); // Compara o conteúdo das senhas
}
}
