Algoritmo "Triangulo"

Var
   a, b, c: real

Inicio
    escreva("Digite a base do triangulo: ")
    leia(b)
    escreva("Digite um lado do triangulo: ")
    leia(a)
    escreva("Digite outro lado do triangulo: ")
    leia(c)
     escreval("--------------------------------")
     
    se (a=b) e (a=c) e (b=c) entao
       escreva("? um Triangulo Equil?tero")
    senao
        se (a<>b) e (a<>c) e (b<>c) entao
           escreva("? um Triangulo Escaleno")
        senao
           escreva("? um Triangulo Is?celes")
        fimse
    fimse

Fimalgoritmo