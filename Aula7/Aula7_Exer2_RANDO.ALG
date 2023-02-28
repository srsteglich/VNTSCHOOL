algoritmo "Rando"
var
   i, mai, men, conta: inteiro
   num: vetor[0..50] de inteiro

inicio
   escreval(" Randômica ate 50 números")
   para i de 0 ate 9 faca
      num[i] <- randi(50) + 1
      escreva(" ", num[i])
      se num[i] > num[mai] entao
         mai <- i
      fimse
      se num[i] < num[men] entao
         men <- i
      fimse
      conta <- conta + num[i]
   fimpara
   
   escreval()
   escreval(" O maior dos numero é: ", num[mai])
   escreval()
   escreval(" O menor dos numero é: ", num[men])
   escreval()
   escreval(" A média dos numero é: ", conta/10:2:2)
fimAlgoritmo

