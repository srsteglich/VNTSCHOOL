Algoritmo "Bhaskara "

Var
   a, b, c, delta, x1, x2 :real

funcao calcula_delta : real
var
   delta: real
   
inicio
      escreval(" ------------------------  estou dentro da função")
      delta <- (b*b) - 4*(a*c)
      retorne delta
fimfuncao

Inicio
      escreva(" Digite o valor do A: ")
      leia(a)
      escreva(" Digite o valor do B: ")
      leia(b)
      escreva(" Digite o valor do C: ")
      leia(c)
      escreval("-----------------------------------------")
      delta <- calcula_delta
      escreval(" O valor do Delta :" ,delta)
      se (delta <0) entao
         escreval(" Valor negativo, não possuim raizes reais.")
      senao
         se (delta = 0) entao
            x1 <- (-b + raizq(delta)) / 2 * a)
            escreval(" A Formula Bhaskara é " , x1, ".")
            escreval(" Possui um raiz.")
         senao
            x1 <- (-b + raizq(delta)) / 2 * a)
            x1 <- (-b - raizq(delta)) / 2 * a)
            escreval(" A Formula Bhaskara é " , x1, " e " ,x2, ".")
            escreval(" Possui dois raizes.")
         fimse
      fimse
Fimalgoritmo