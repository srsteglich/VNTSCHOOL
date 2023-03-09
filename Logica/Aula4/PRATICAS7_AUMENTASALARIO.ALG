Algoritmo "AumentaSalario"

Var
    salario: real
    ano: inteiro

Inicio
    //a)
    salario <- 2000
    ano <- 2016
    
    para ano de 2016 ate 2022 faca
       // b)
       se (ano = 2017) entao
          salario <- salario + (salario * 0.015)
       senao
            se (ano >= 2018) entao
               salario <- salario + (salario * 0.030)
            fimse
       fimse
       escreval(" Ano: ",ano, " -  Salario: ",salario:9:2)

    fimpara
    



Fimalgoritmo