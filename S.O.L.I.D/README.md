# S.O.L.I.D


"S" - Single Responsibility Principle - Princípio da responsabilidade Única :

   Simples entendimento não há necessidade de código.

Princípio da Responsabilidade Única - exemplo : não poluir uma classe com vários médodos que não tenham a ver com o seu assunto principal... 
... tipo uma classe Deus que faz de tudo, organize, mais limpo...

----------------------------------------------------------------------------------------------------

"O" - Open/close principle - Princípio aberto/fechado :

Primeiro vamos violar o princípio o aberto/fechado depois vamos refatorar o código. 

Princípio Aberto/Fechado - "Aberto para extensão , fechado para modificação" , porque alterar códigos existentes é perigoso a afetar heranças.
Vantagens : Minimiza custo da aplicação, ter cada vez mais classes menores e objetivas, mais faceis de ser extensiveis, melhor manutenção,
minimiza risco de bugs regressiveis se motivos e em classes derivadas, e também  reforça outro princípio como o de singularidade.
Formas de usar : Herança, Interface, ou até com padrões de projeto como factory por exemplo ajuda a isolar a lógica das classes, com strategys e composição

----------------------------------------------------------------------------------------------------

"L" - Liskov Substitution Principle - Princípio da Substituição de Liskov :

 As classes base devem ser substituíveis por suas classes derivadas. 

Vamos supor que o Banco Nubank tenha o cartão de Crédito e Débito, 2 operações, uma validar o cartão e outra coletar o pagamento, 
vamos imaginar que o Banco chega e diz que agora os clientes vão ter uma recompensa em saldo de pontos (Rewards) , então precisa sofrer alterações sem prejudicar o que já estava pronto, então aplicando substituição de Liskov... com a programação orientada a interface apliquei novas funcionalidades sem prejudicar o que já estava feito ... 

----------------------------------------------------------------------------------------------------

"I" - Interface Segregation Principle - Princípio da Segregação da Interface :

 Muitas interfaces específicas são melhores do que uma interface única. Este fala sobre interfaces infladas então melhor quebrar em inferfaces menores e específicas, o cliente não dever ser forçados a depender de métodos que eles não usam, uma vez bem aplicado ajuda o  Single Responsibility Principle e o Princípio da Substituição de Liskov, vantagem reduz acoplamento e dependência do código.
 
 Vamos praticar aproveitando as classas criada no Open/close principle vehicles, car, motorcyle...	trabalhando com prefixo atrás PSI nas classes.

----------------------------------------------------------------------------------------------------

"D" - Dependency Inversion Principle - Princípio da Inversão da Dependência :

 Dependa de uma abstração e não de uma implementação. Com este príncipio é possivel nós criarmos módulos que não estão ligados, por isso é mais fácil alterar 
 quando nós precisamos e para dar manutenção. Todo sistema é dividido em pelo menos dois tipos de módulos, módulos de alto nível(tem haver com regras de negócios,
 ojetivo da aplicação, o que ela faz) e módulos de baixo nível(tarefas internas, como auth, etc), então modulos de alto nível "não" devem depender dos módulos de baixo nível, "ambos" devem depender de "abstração" e abstrações não devem depender de detalhes.  
     Nesse estudo estão envolvidos todas classes e interfaces com prefixo no final do nome "PID". Vamos criar dua classes uma de alto nível e outra de baixo nível, primeiros vamos ligar elas de forma comum (errado), depois vamos refatorar com princípio da inversão da dependência.
     
      





























