algoritmo "Altura"
var
   i, mai, men: inteiro
   altM, altF, contaM, contaF, mediaM, MediaF: real
   num: vetor[0..4] de inteiro
   alt: vetor[0..4] de real
   sex: vetor[0..4] de caractere

inicio

   para i de 0 ate 4 faca
      escreva(" O Codigo da Pessoa ?: ")
      leia(num[i])
      escreva(" A tua altura ?: ")
      leia(alt[i])
      escreva(" O Sexo (M ou F) ?: ")
      leia(sex[i])
      sex[i] <- maiusc(sex[i])
      escreval()

     se alt[i] > alt[mai] entao
         mai <- i
      fimse
      se alt[i] < alt[men] entao
         men <- i
      fimse
      se sex[i] = "F" entao
         altF <- alt[i]  + i
         contaF <- contaF + 1
      senao
         altM <- alt[i]  + i
         contaM <- contaM + 1
      fimse

    fimpara

    //escreval(" conta altura Masc: ", altM, " -  conta altura Femi ",altF)
    //escreval(" contador Masc: ", contaM, " -  contadorFemino ",contaF)
    mediaF <- altF / contaF
    mediaM <- altM / contaM
    //escreva("mediaM ", mediaM, "  -  MediaF ",mediaF)
    escreval()
    escreval(" O maior altura do grupo ?: ", num[mai]," com ",alt[mai]," metros")
    escreval()
    escreval(" O menor altura do grupo ?: ", num[men]," com ",alt[men]," metros")
    escreval()

    escreval(" A m?dia das altura das mulheres s?o ", mediaF:2:2)
    escreval()
    escreval(" A m?dia das altura dos homens s?o ", mediaM:2:2)

fimAlgoritmo

