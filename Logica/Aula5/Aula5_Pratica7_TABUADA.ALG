Algoritmo "Tabuada"

Var
   num1, conta, mult: inteiro

funcao mult (val1, contar: inteiro) :inteiro

inicio

      para contar de 1 ate 10 faca
            escreval(val1, " X ",contar," = ",val1 * contar)
      fimpara


fimfuncao

Inicio

      escreva(" Digite um numero de 1 à 10: ")
      leia(num1)
      se(num1 > 0) e (num1 <=10) entao
            mult <- mult(num1,conta)
      senao
           escreva("Não foi possivel executar esse valor")
      fimse

Fimalgoritmo