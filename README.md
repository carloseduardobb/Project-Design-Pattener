# Project-Design-Patterns
Trabalho Design-Patterns

O Projeto foi desenvolvido em cima do trabalho de análise e desenvolvimento de sistemas.

Descrição do trabalho: Criar um cenário e implementar 3 design patterns estudados em sala.
OBS: Deve haver um arquivo readme.md com a explicação sucinta de quais design patterns foram implementados e porque eles foram úteis no cenário escolhido.

Descrição do Cenário

Criamos um cenário de um jogo que pode ter um personagem de diferente classes Guerreiro, Mago e Arqueiro cada classe com os seus atributos vida, mana velocidade de ataque entre outros. Somente uma instância do personagem pode estar ativa no momento do jogo esse personagem pode passar por diversos perrengues é com isso sofrer redução de velocidade de ataque é movimento o jogo contém também um power up que quando consumido pelo personagem ele ganha muita velocidade de movimento e de ataque.
Explicação dos Patterns escolhidos para o uso

Descrição dos Patterns utilizados

1 Escolhemos o singleton para garantir que somente uma instância do personagem estaria em execução no momento do jogo.

2 Escolhemos o strategy para definir qual classe estaria em execução no exato momento utilizamos ele pois o personagem pode alterar de classe a qualquer momento durante o jogo

3 Utilizamos por último o state por causa que o personagem pode ter suas ações alteradas dependendo do estado em que ele se encontra por exemplo quando o personagem consome um power up as ações dele muda.

Pattern extra que poderia ter ajudado na implementação

O observe e um pattern que percebemos que teria um grande auxílio durante a implementação pois o personagem tem methods que eram entrarTerrenoRuim, entrarTerrenoBom, com isso o pattern observer poderia ajudar observando o terreno em que o personagem está quando ele alterar o terreno avisa o personagem e o personagem altera o estado.

