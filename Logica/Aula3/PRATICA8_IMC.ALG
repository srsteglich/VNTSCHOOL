Algoritmo "IMC"

Var

   IMC, peso, altura: real


Inicio
      escreval("Digite o teu peso: ")
      leia(peso)
      escreval("Digite o teu altura: ")
      leia(altura)
      IMC <- peso / (altura*altura)

      se (IMC <16) entao
         escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Magreza Grave")
      senao
           se (IMC <=16) e (IMC <17) entao
              escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Magreza Moderada")
           senao
              se (IMC <=17) e (IMC <18.5) entao
                 escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Magreza Leve")
              senao
                   se (IMC <=18.5) e (IMC <25) entao
                      escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Saud?vel")
                   senao
                        se (IMC <=25) e (IMC <30) entao
                           escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Sobrepeso")
                        senao
                             se (IMC <=30) e (IMC <35) entao
                                escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Obesidade Grau II")
                             senao
                                  se (IMC <=35) e (IMC <40) entao
                                     escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Obesidade Grau II")
                                  senao
                                     escreva(" O seu IMC foi ",IMC:4:2, " situa??o ? Obesidade Grau III")
                                  fimse
                             fimse
                        fimse
                   fimse
               fimse
           fimse
      fimse

      
Fimalgoritmo