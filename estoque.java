
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class estoque {

    public static void main(String[] args) {
//        variáveis
        float estoqueMinimo, estoqueMaximo, vendaMediaDiaria;
        int mes1, mes2, mes3, tempoReposicao, loteReposicao, estoqueAtual;
//        abertura do teclado
        Scanner teclado = new Scanner(System.in);
//        print
        System.out.println("Digite as vendas do primeiro mês");
        mes1 = teclado.nextInt();
        System.out.println("Digite as vendas do segundo mês");
        mes2 = teclado.nextInt();
        System.out.println("Digite as vendas do terceiro mês");
        mes3 = teclado.nextInt();

//calculo da venda media diaria
        vendaMediaDiaria = ((mes1 + mes2 + mes3) / 3) / 25;
//print do calculo da venda media diaria
        System.out.println("A venda média diária foi de: " + vendaMediaDiaria);
//calculo dos estoques
        System.out.println("Digite o tempo de reposição");
        tempoReposicao = teclado.nextInt();
        System.out.println("Digite o lote de reposição");
        loteReposicao = teclado.nextInt();
        System.out.println("Digite as vendas do primeiro mês");
        estoqueMinimo = vendaMediaDiaria * tempoReposicao;
        estoqueMaximo = estoqueMinimo + loteReposicao;
//print do resultado dos estoques
        System.out.println("O valor do estoque mínimo é de:  " + estoqueMinimo);
        System.out.println("O valor do estoque máximo é de:  " + estoqueMaximo);

//tomada de decisão para saber se vai precisar fazer pedidos na intenção de repor o estoque
        System.out.println("Digite o estoque atual dos produtos");
        estoqueAtual = teclado.nextInt();
        
        if (estoqueAtual < estoqueMinimo) {
            System.out.println("Há uma necessidade repor o estoque!");
        }else{
            System.out.println("Não há necessidade repor o estoque, está sobrecarregado!");
        }
teclado.close();
    }

}
