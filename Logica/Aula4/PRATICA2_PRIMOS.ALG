Algoritmo "Primos"

Var
  num, i, contar: inteiro


Inicio

   escreva("Digite um n?mero: ")
   leia(num)
   escreval("------------------------------------")

   se (num =1) entao
      escreval("O numero" ,num, " n?o ? primo")
   senao
      escreval("Dividores do numero",num , " s?o: ")
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
        escreval("O numero",num, " --> ? primo")
      senao
        escreval("O numero",num, " --> N?o ? primo")
      fimse
      escreval("------------------------------------")
   fimse

Fimalgoritmo