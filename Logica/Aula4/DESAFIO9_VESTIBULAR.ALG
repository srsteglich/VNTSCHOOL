Algoritmo "Vestibular"

Var
   nVagas, nMasc, nFemi, totCand: inteiro
   porcFem, candVagas, maiorVagas: real
   codCurso, maiorCurso, continua: caracter

Inicio

      continua <- "S"
      maiorVagas <- 0
      totCand <- 0
      
      enquanto continua = "S" faca
         escreva(" O codigo do curso: ")
         leia(codCurso)
         escreva(" O n? de vagas: ")
         leia(nVagas)
         escreva(" O n? Masculinos: ")
         leia(nMasc)
         escreva(" O n? Feminino: ")
         leia(nFemi)
         
         totCand <- nMasc + nFemi
         candVagas <- (nMasc + nFemi) / nVagas
         porcFem <- (nFemi / totCand) *100
      
         se (maiorVagas < candVagas) entao
            maiorVagas <- candVagas
            maiorcurso <- codCurso
         fimse
         
         escreval(" Candidatos por vagas ?: " ,candVagas:2:2)
         escreval(" Codigo ",codCurso," teve ",porcFem:2:2," % das mulheres")
         escreval("________________________________________________________")
         escreval(" ")
         escreva(" Continua outro curso(s/n)?: ")
         leia(continua)
         continua <- maiusc(continua)
         escreval("________________________________________________________")
         escreval(" ")
         
      fimenquanto

         escreval(" ")
         escreval(" Curso ",maiorcurso," ? maior numero de cadidatos por vagas ? ",maiorVagas)
         escreval(" Total de Candidatos ? ",totCand)

Fimalgoritmo