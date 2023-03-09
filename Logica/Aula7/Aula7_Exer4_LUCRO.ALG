Algoritmo "Lucro"

Var
   prod: vetor[0..100] de caractere
   i, conta: inteiro
   preccomp, precvend, totcomp, totvend,calcula, calcula2: real
   lucro, lucromen, lucromai, lucromed, lucrotot: real

Inicio
      escreva(" Quantos produtos: ")
      leia(conta)
      para i de 1 ate conta faca
            escreva(" Produto: ")
            leia(prod[i])
            escreva(" Preço da Compra: ")
            leia(preccomp)
            escreva(" Preço da Venda: ")
            leia(precvend)
            totcomp <- totcomp + preccomp
            totvend <- totvend + precvend
            lucro <- precvend - preccomp
            lucrotot <- lucrotot + lucro
            calcula <- (100 * lucro) / preccomp
            calcula2 <- (lucro/preccomp) * 100
            //escreval(" calcula2:", calcula2)
            //escreval(" teste do calculo: ", calcula)
            se (calcula < 10) entao
               lucromen <- lucromen + 1
            senao
               se (calcula >= 10) e (calcula <= 20) entao
                   lucromed <- lucromed + 1
               senao
                    se (calcula > 20) entao
                        lucromai <- lucromai + 1
                    fimse
               fimse
            fimse
            
      fimpara
      escreval()
      escreval(" Produto com menor de 10% de lucro ",lucromen)
      escreval(" Produto entre 10% e 20% ",lucromed)
      escreval(" Produto com maior de 20% ",lucromai)
      escreval()
      escreval(" Total da Compra ",totcomp)
      escreval(" Total da Venda ",totvend)
      escreval(" Lucro Total ",lucrotot)

Fimalgoritmo