Algoritmo "SelectionSort2"

Var
    ordem: vetor[1..7] de inteiro
    c, esq, dir, aux: inteiro

Inicio
    para c de 1 ate 7 faca
         escreva(" Digite o ", c," o: ")
         aleatorio -200, 200
         leia(ordem[c])
         aleatorio off
    fimpara
    escreval("")
    para esq de 1 ate 7 faca
         para dir de esq+1 ate 7 faca
              se ordem[esq] > ordem[dir] entao
                 aux <- ordem[esq]
                 ordem[esq] <- ordem[dir]
                 ordem[dir] <- aux
              fimse
         fimpara
    fimpara
    escreval("")
    escreval(" A ordem ficou assim: ")
    para c de 1 ate 7 faca
         escreva(" ",ordem[c])
    fimpara

Fimalgoritmo