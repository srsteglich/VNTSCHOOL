Algoritmo "Primos"

Var
  num, i, contar: inteiro


Inicio

   escreva("Digite um número: ")
   leia(num)
   escreval("------------------------------------")

   se (num =1) entao
      escreval("O numero" ,num, " não é primo")
   senao
      escreval("Dividores do numero",num , " são: ")
      se (num <= 10) entao
         para i de 1 ate num faca
            se (num % i = 0) entao
               escreva(" ", i)
               contar <- contar + 1
            fimse
            i <- i +1
         fimpara
      senao
         para i de 1 ate 10 faca
            se (num % i = 0) entao
               escreva(" ", i)
               contar <- contar + 1
            fimse
            i <- i +1
         fimpara
         contar <- contar + 1
         escreva(num)
      fimse
      escreval(" ")
      escreval("------------------------------------")
      se (contar = 2) entao
        escreval("O numero",num, " --> É primo")
      senao
        escreval("O numero",num, " --> Não é primo")
      fimse
      escreval("------------------------------------")
   fimse

Fimalgoritmo