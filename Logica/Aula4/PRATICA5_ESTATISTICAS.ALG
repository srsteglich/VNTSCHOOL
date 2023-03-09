Algoritmo "Estatisticas"

Var
   nome, sexo, nomeAlto: caractere
   num, hom, mul: inteiro
   alt, peso, totalPeso, mediaPeso, porcHom, porcMul, maisAlta: real

Inicio

   para num de 1 ate 250 faca
        escreva("Numero: ")
        leia(num)
        escreva("Nome: ")
        leia(nome)
        escreva("Altura: ")
        leia(alt)
        escreva("Peso: ")
        leia(peso)
        escreva("Sexo: ")
        leia (sexo)
        sexo <- Maiusc(sexo)
        escreval("--------------------------------------")
        
// Sexo
       se (sexo = "M") entao
          hom <- hom + 1
       senao
          se (sexo = "F") entao
             mul <- mul + 1
          fimse
       fimse
// Peso
       totalPeso <- totalPeso + peso
// Mais Alta
        se (alt > maisAlta) entao
           maisAlta <- alt
           nomeAlto <- nome
        fimse
   fimpara
//Estatisticas
        mediaPeso <- totalPeso / 250
        porcHom <- hom / 250*100
        porcmul <- mul / 250*100
//Resultados
        escreva("  ")
        escreval("----------- Dados Estatisticos ---------------------------")
        escreval("  Homens: ",hom, "  Porcentual: ",porcHom:3:2, "%")
        escreval("  Mulheres: " ,mul, "  Porcentual: ",porcMul:3:2, "%")
        escreval("  Média Pesos das Pessoas: " ,mediaPeso:3:2)
        escreval("  Pessoa mais alto(a): " ,nomeAlto)

Fimalgoritmo