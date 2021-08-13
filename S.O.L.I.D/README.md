# S.O.L.I.D


"S" -  Single Responsibility Principle 

Simples entendimento não há necessidade de código.

Princípio da Responsabilidade Única - exemplo : não poluir uma classe com vários médodos que não tenham a ver com o seu assunto principal... 
... tipo uma classe Deus que faz de tudo, organize, mais limpo...

----------------------------------------------------------------------------------------------------

"O" - Open/close principle :

Primeiro vamos violar o princípio o aberto/fechado depois vamos refatorar o código. 

Princípio Aberto/Fechado - "Aberto para extensão , fechado para modificação" , porque alterar códigos existentes é perigoso a afetar heranças.
Vantagens : Minimiza custo da aplicação, ter cada vez mais classes menores e objetivas, mais faceis de ser extensiveis, melhor manutenção,
minimiza risco de bugs regressiveis se motivos e em classes derivadas, e também  reforça outro princípio como o de singularidade.
Formas de usar : Herança, Interface, ou até com padrões de projeto como factory por exemplo ajuda a isolar a lógica das classes, e com strategys com composição

