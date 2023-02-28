Algoritmo "AumentoSalarios"


Var
   nome: caractere
   salAtual, salNovo, cento: real


Inicio

      escreval("Digite o nome do funcionario: ")
      leia(nome)
      escreval("Digite o salario: ")
      leia(salAtual)
      escreval("Digite o porcentual: ")
      leia(cento)

         salNovo <- (salAtual * cento/100)
         salNovo <- salNovo + salAtual
         escreva("Salario Novo é ", salNovo)

Fimalgoritmo