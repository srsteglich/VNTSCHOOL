Algoritmo "4valores"

Var
   I: inteiro
   num1, num2, num3, Maior, Menor, Media: real


Inicio
      escreval("Digite 1 valor: ")
      leia(num1)
      escreval("Digite 2 valor: ")
      leia(num2)
      escreval("Digite 3 valor: ")
      leia(num3)
      escreval("Digite 1 em Ordem Crescente")
      escreval("Digite 2 em Ordem Descrescente")
      escreval("Digite 3 o Maior fiquem entres os Dois")
      leia(I)
      
      se ((num1>num2) e (num1>num3)) entao
         se num2 >num3 entao
            Maior <- num1
            Media <- num2
            Menor <- num3
         senao
            Maior <- num1
            Media <- num3
            Menor <- num2
         fimse
      senao
         se ((num2>num1) e (num2>num3)) entao
            se num1 >num3 entao
               Maior <- num2
               Media <- num1
               Menor <- num3
            senao
               Maior <- num2
               Media <- num3
               Menor <- num1
            fimse
         senao
           se ((num3>num1) e (num3>num1)) entao
            se num1 >num2 entao
               Maior <- num3
               Media <- num1
               Menor <- num2
            senao
               Maior <- num3
               Media <- num2
               Menor <- num1
            fimse
          fimse
        fimse
      fimse
      se I=1 entao
         escreval("Numeros em ordem crescente: ", Menor, Media, Maior)
      fimse
      se I=2 entao
         escreval("Numeros em ordem descrescente: ", Maior, Media, Menor)
      fimse
      se I=3 entao
         escreval("Numeros em que o maior fique entre os dois: ", Menor, Maior, Media)
      fimse
     

      
Fimalgoritmo