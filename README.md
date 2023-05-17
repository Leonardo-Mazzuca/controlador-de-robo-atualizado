# controlador-de-robo-atualizado

Este código é uma versão melhorada do anterior que eu havia postado sobre essa lição.
Eu fiz um sistema de coleta, onde se o robo passar numa certa área, ele recebe a opção
de abrir um baú, este que recebe uma array de strings, cada uma sorteada aleatóriamente
com vantagens, eu usei o método random para iterar pela array e escolher um dos "poderes".

Além disso, agora é possível digitar várias vezes uma distância para a linha em que o 
robo estiver, porém, a uma maneira de "perder", quando as coordenadas são varadas
com a distância.

Também é possível perder se a bateria acabar, eu coloquei um sistema de "azar".
Quando o robo passa numa certa área, ele pode ter uma desvantagem. Futuramente
pretendo melhorar ainda mais este mini projeto. Eu realmente fico feliz com o 
progresso que obtive fazendo ele do incio até agora!

Resumindo tudo:

O mini-game começa quando a variavél "bateria" é carregada, fazendo o loop
while começar, se a bateria zerar, ou se o robo chegar nas coordenadas
passadas nas condições, o jogo termina, mas da a opção do usuário jogar
denovo atravéz da variavél "resp" (nome genérico, eu sei...).

A partir do início, o robo pode sofrer várias ações no meio do trajeto,
como achar um baú com vantagens, ou ser atacado!


As variavéis booleanas são usadas para encerrar o jogo, quando uma
condição é verdadeira, por exemplo, a bateria zerada.
Este foi o método mais fácil e prático que pensei para fazer isso.
Eu espero que num futúro não tão distânte, eu possa colocar objetos
nesse código.

É de bom tom ressaltar para quem está lendo isso uma breve explicação do método "lenght".
Por mais que seja fácil de entender, é meio complicado de usar.
Este pode ser usado para pegar a indexação de uma array (0, 1, 2...), ou o total de caracteres
de uma string, enfim.
Ele é mais usado para pegar o número de elementos de uma lista, como feito no código.
Pode ser usado para falar uma condição, por exemplo:

Se for preciso fazer um programa que se armazena 10 números, porém essa lista precisa
ser menor que outra. Assim se pode passar condições por exemplo

for (lista1 = 0; lista1<= lista2.lenght; lista1++)

enfim, isso é só uma hipótese, a várias coisas legais para se fazer com este método.

Espero que tenha gostado! Divirta-se testando o código!
Este código pode ser modificado ou alterado por qualquer usuário, estou sempre aberto
a criticas e sujestões para melhorar meu estudo!

Como de costume, pare de ser frango(a)! E me siga!!!
