Algoritmo "ProfSalario"

Var
   nomeProf: vetor[0..4] de caractere
   salario: vetor[0..4] de inteiro

   i, maiorSal, quantHora, valorHAula : inteiro

Inicio
      escreva(" Digite o valor da Hora por Aula: ")
      leia(valorHAula)
      //escrevaL()
      para i de 0 ate 3 faca
         escreva(" Digite nome do Professor: ")
         leia(nomeProf[i])
         escreva(" Digite a quantidade horas: ")
         leia(quantHora)
         salario[i] <- quantHora * valorHAula
         se salario[i] > salario[maiorSal] entao
            maiorSal <- i
         fimse
      fimpara
      escrevaL()
      escreval("-----------Listas dos Professores e teu Salario------------")
      para i de 0 ate 4 faca
         escreval(" O Professor " ,nomeProf[i], " e o Salario R$",salario[i])
      fimpara
      escreval()
      escreval("_________________________________________________________________")
      escreval()
      escreval(" O Professor " ,nomeProf[i], " tem o teu Maior Salario R$",SALARIO[maiorSal])

Fimalgoritmo