Algoritmo "CrescDescresc"

Var
    ordem: vetor[1..8] de inteiro
    i, j, aux: inteiro

Inicio

    para i de 1 ate 8 faca
         escreva(" Digite o",i," o número: ")
         leia(ordem[i])
    fimpara
    escreval()
    escreval("     Vetor  Digitado   ")
    para i de 1 ate 8 faca
         escreva(" ",ordem[i])
    fimpara
    escreval("")
    
    para i de 1 ate 8 faca
         para j de i+1 ate 8 faca
              se ordem[i] > ordem[j] entao
                 aux <- ordem[i]
                 ordem[i] <- ordem[j]
                 ordem[j] <- aux
              fimse
         fimpara
    fimpara
    escreval("")
    
    escreval("     Vetor Ordem Crescente ")
    para i de 1 ate 8 faca
         escreva(" ",ordem[i])
    fimpara
    escreval(" ")
    escreval(" ")
    escreval("     Vetor Ordem Descrescente ")
    para i de 8 ate 1  passo -1 faca
         escreva(" ",ordem[i])
    fimpara
    escreval("")
    
Fimalgoritmo