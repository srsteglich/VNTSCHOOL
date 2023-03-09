Algoritmo "DOACAO"

Var
   opc :inteiro
   valor: real
Inicio
     escreval("Seleciona a opação para Doar")
     escreval("[1] para doar R$ 10 ")
     escreval("[2] para doar R$ 25 ")
     escreval("[3] para doar R$ 50 ")
     escreval("[4] para doar outros valores ")
     escreval("[5] para cancelar ")
     leia(opc)
     escolha opc
             caso 1
                  escreval("Valor da doação R$ 10")
                  escreva("Obrigado pela doação")
             caso 2
                  escreval("Valor da doação R$ 25")
                  escreva("Obrigado pela doação")
             caso 3
                  escreval("Valor da doação R$ 50")
                  escreva("Muito Obrigado pela doação")
             caso 4
                  escreval("Qual o valor para doar?")
                  leia(valor)
                  escreval("Valor da doação R$ ", valor)
                  escreva("Muito Obrigado pela doação")

             caso 5
                  escreval ("Solicitação cancelada!")
     fimescolha
Fimalgoritmo