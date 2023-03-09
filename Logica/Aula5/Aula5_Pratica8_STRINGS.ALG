Algoritmo "Strings"

Var
   palavra, seq, conv, data, dia, mes, ano: caractere
   conta, posicao: inteiro

funcao conv (muda, sequen, date: caractere) :caractere

inicio

      conta <- compr(muda)
      escreval(" A palavra tem ",conta," caracteres.")
      posicao <- Pos(sequen,muda)
      escreva(" O caractere enconta na posição: ",posicao)
      
      dia <- copia(date;1;2)
      mes <- copia(date;4;2)
      ano <- copia(date;7;4)
      escreval()
      escreval(" Dia: ",dia, " Mês: ",mes," Ano: ",ano)

fimfuncao

Inicio

      escreva(" Digite uma palavra: ")
      leia(palavra)
      escreva(" Digite uma letra ou sequencia de caracteres: ")
      leia(seq)

      escreva(" Digite a data formato dd/mm/aaaa: ")
      leia(data)
      escreval()
      conv <- conv(palavra, seq, data)

Fimalgoritmo