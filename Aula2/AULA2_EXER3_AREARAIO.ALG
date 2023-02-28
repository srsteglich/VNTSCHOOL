Algoritmo "AreaRaio_Condicional"

Var
   area, raio: real


Inicio
      escreva("Digite o raio?")
      leia(raio)
      se (raio>0) entao
         area <- PI * (raio^2)
         escreva("A area é de ", area)
      senao
           escreva("Raio não pode zero ou negativo")
      fimse


Fimalgoritmo