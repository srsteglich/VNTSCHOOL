Algoritmo "Fatorial"

Var
   num, i, fator: inteiro

procedimento cam (num: inteiro)

inicio
      fator <- 1
      para i de 1 ate num  faca
            fator <-   fator * i
      fimpara
       escreval("O Fatorial de ",num, " ? ",fator)

fimprocedimento

Inicio
      escreval("---------Inicio do programa---------------")
      escreva("Digite um numero: ")
      leia(num)
      escreval("----------------------------------")
      se (num <=0) entao
        escreval("Numero ",num, " n?o ? possivel fazer opera??o")
      senao
        cam(num)
      fimse
Fimalgoritmo