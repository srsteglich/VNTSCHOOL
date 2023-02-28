Algoritmo "Produtos"

Var
   preco, aumento, precoaumento, imposto : real
   categoria : inteiro
   situacao: caractere

Inicio
// Pag 1 - Informações do Produto
   escreval("------------------------------------")
   escreva("Digite o valor do produto ")
   leia(preco)
   escreva("Digite a categoria (1–limpeza  2–alimentação  3–vestuário ")
   leia(categoria)
   escreva("Digite a situação (R–precisa refrigerar  N–não precisa refrigerar) ")
   leia(situacao)
   situacao <- maiusc(situacao)
   //escreval(situacao)

// Pag 2 - Preco com aumento
   escreval("------------------------------------")
   se (preco <= 25) entao
     se (categoria = 1) entao
           //escreva ("estou na linha 18")
           aumento <- preco * 0.05
     senao
          se (categoria = 2) entao
             aumento <- preco * 0.08
          senao
             aumento <- preco * 0.10
          fimse
     fimse
   senao
      se (categoria = 1) entao
            //escreva ("estou na linha 29")
            aumento <- preco * 0.12
      senao
          se (categoria = 2) entao
             aumento <- preco * 0.15
          senao
             aumento <- preco * 0.18
          fimse
      fimse
   fimse
   //   escreval ("Preco " ,preco)
   //   escreval ("Aumento ", aumento)
   precoaumento <- preco + aumento
   escreval ("Valor foi aumentado R$ ", precoaumento)

// Pag 3 - Preco com desconto
   escreval("------------------------------------")
   se (categoria = 2) e (situacao = "R") entao
      imposto <- precoaumento * 0.05
      // escreval("estou na linha 48 com 2-r")
      precoaumento <- precoaumento - imposto
      escreval("O Imposto é de R$ " ,imposto)
      escreval("E o valor descontado foi R$ ", precoaumento)
   senao
      imposto <- precoaumento * 0.08
      // escreva("linha 54 sem 2-r")
      precoaumento <- precoaumento - imposto
      escreval("O Imposto é de R$ " ,imposto)
      escreval("E o valor descontado foi R$ ", precoaumento)
   fimse

// Pag 4 - Classificação
    escreval("------------------------------------")
    se (precoaumento <= 50) entao
       escreval("Tá Barato...")
    senao
         se (precoaumento > 50) e (precoaumento <= 120) entao
            escreval("Tá Normal...")
         senao
            escreval("Tá Caro...")
         fimse
    fimse
     escreva("------------------------------------")
   
Fimalgoritmo