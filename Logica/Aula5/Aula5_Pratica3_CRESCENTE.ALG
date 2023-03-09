Algoritmo "Crescente"

Var
   a, b, c, d, ordem: inteiro

procedimento ordem(a, b, c, d: inteiro)

inicio
      //  a - b - c - d
      //  a - b - d - c
      //  a - c - b - d
      //  a - c - d - b
      //  a - d - b - c
      //  a - d - c - b
      
// Preferencia A
        se (a > b) e (b > c) e (c > d) entao
           escreva(" A ordem dos nº: ", d, c, b, a)
        senao
          se (a > b) e (b > d) e (d > c) entao
             escreva(" A ordem dos nº: ", c, d, b, a)
          senao
             se (a > c) e (c > b) e (b > d) entao
               escreva(" A ordem dos nº: ", d, b, c, a)
             senao
               se (a > c) e (c > d) e (d > b) entao
                 escreva(" A ordem dos nº: ", b, d, c, a)
               senao
                 se (a > d) e (d > b) e (b > c) entao
                   escreva(" A ordem dos nº: ", c, b, d, a)
                 senao
                   se (a > d) e (d > c) e (c > b) entao
                     escreva(" A ordem dos nº: ", b, c, d, a)
                   senao
// Preferencia B
                     se (b > a) e (a > c) e (c > d) entao
                       escreva(" A ordem dos nº: ", d, c, a, b)
                     senao
                       se (b > a) e (a > d) e (d > c) entao
                         escreva(" A ordem dos nº: ", c, d, a, b)
                       senao
                         se (b > c) e (c > a) e (a > d) entao
                           escreva(" A ordem dos nº: ", d, a, c, b)
                         senao
                           se (b > c) e (c > d) e (d > a) entao
                             escreva(" A ordem dos nº: ", a, d, c, b)
                           senao
                             se (b > d) e (d > a) e (a > c) entao
                               escreva(" A ordem dos nº: ", c, a, d, b)
                             senao
                               se (b > d) e (d > c) e (c > a) entao
                                 escreva(" A ordem dos nº: ", a, c, d, b)
                               senao
// Preferencia C
                                 se (c > a) e (a > b) e (b > d) entao
                                   escreva(" A ordem dos nº: ", d, b, a, c)
                                 senao
                                   se (c > a) e (a > d) e (d > b) entao
                                     escreva(" A ordem dos nº: ", b, d, a, c)
                                   senao
                                     se (c > b) e (b > a) e (a > d) entao
                                       escreva(" A ordem dos nº: ", d, a, b, c)
                                     senao
                                       se (c > b) e (b > d) e (d > a) entao
                                         escreva(" A ordem dos nº: ", a, d, b, c)
                                       senao
                                         se (c > d) e (d > a) e (a > b) entao
                                           escreva(" A ordem dos nº: ", b, a, d, c)
                                         senao
                                           se (c > d) e (d > b) e (b > a) entao
                                             escreva(" A ordem dos nº: ", a, b, d, c)
                                           senao
// Preferencia D
                                             se (d > a) e (a > b) e (b > c) entao
                                               escreva(" A ordem dos nº: ", c, b, a, d)
                                             senao
                                               se (d > a) e (a > c) e (c > b) entao
                                                escreva(" A ordem dos nº: ", b, c, a, d)
                                               senao
                                                  se (d > b) e (b > a) e (a > c) entao
                                                    escreva(" A ordem dos nº: ", c, a, b, d)
                                                  senao
                                                    se (d > b) e (b > c) e (c > a) entao
                                                      escreva(" A ordem dos nº: ", a, c, b, d)
                                                    senao
                                                      se (d > c) e (c > a) e (a > b) entao
                                                        escreva(" A ordem dos nº: ", b, a, c, d)
                                                      senao
                                                        se (d > c) e (c > b) e (b > a) entao
                                                          escreva(" A ordem dos nº: ", a, b, c, d)
                                                        //senao
                                                        fimse
                                                      fimse
                                                    fimse
                                                  fimse
                                               fimse
                                             fimse
                                           fimse
                                         fimse
                                       fimse
                                     fimse
                                   fimse
                                 fimse
                               fimse
                             fimse
                           fimse
                         fimse
                       fimse
                     fimse
                   fimse
                 fimse
               fimse
             fimse
          fimse
        fimse
        escreval()
        escreval("----------------------------------")
fimprocedimento

Inicio
      escreval("----------------------------------")
      escreva("Digite numero1: ")
      leia(a)
      escreva("Digite numero2: ")
      leia(b)
      escreva("Digite numero3: ")
      leia(c)
      escreva("Digite numero4: ")
      leia(d)
      escreval("----------------------------------")
      ordem(a, b, c, d)
Fimalgoritmo