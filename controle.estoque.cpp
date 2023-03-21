#include <stdio.h>

main(){
float estoqueMinimo, estoqueMaximo, vendaMediaDiaria;
int mes1, mes2, mes3, tempoReposicao, loteReposicao, estoqueAtual;
char produto, necessidadeSim, necessidadeNao;


printf("Digite o primeiro mes\n");
scanf("%i", &mes1);
printf("Digite o segundo mes\n");
scanf("%i", &mes2);
printf("Digite o terceiro mes\n");
scanf("%i", &mes3);

//media diaria
vendaMediaDiaria = ((mes1+mes2+mes3)/3)/25;
printf("A venda media dos produtos sao de: %f\n", vendaMediaDiaria);

// estoques

printf("Digite o tempo de reposicao");
scanf("%i", &tempoReposicao);
printf("Digite o lote de reposicao");
scanf("%i", &loteReposicao);
estoqueMinimo = vendaMediaDiaria*tempoReposicao;
estoqueMaximo = estoqueMinimo+loteReposicao;

printf("O valor do estoque minimo é de: %f\n", estoqueMinimo);
printf("O valor do estoque maximo é de: %f\n", estoqueMaximo);

//tomada de decisão
printf("Digite seu estoque atual");
scanf("%i", &estoqueAtual);

if(estoqueAtual < estoqueMinimo){
printf("Precisa comprar para repor o estoque");
}else{
	printf("Estoque sobrecarregado");
}
return 0;
}

