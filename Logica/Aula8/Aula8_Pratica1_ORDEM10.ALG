Algoritmo "Ordem10"

Var
    v: vetor[1..10] de inteiro
    i, j, aux: inteiro

Inicio
    para i de 1 ate 10 faca
         escreva(" Digite o ", i," o número: ")
         leia(v[i])
    fimpara
    escreval("")
    
    para i de 2 ate 10 faca
       aux <- v[i]
       j <- i - 1
       enquanto aux < v[j] faca
          v[j+1] <- v[j]
          j <- j - 1
          se j = 0 entao
             interrompa
          fimse
       fimenquanto
       v[j+1] <- aux
    fimpara

    escreval("")
    para i de 1 ate 10 faca
         escreva(" ",v[i])
    fimpara

Fimalgoritmo