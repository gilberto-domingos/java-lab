# Design-Patterns

------------------------------------------------- CRIACIONAL ---------------------------------------------------

Factory Method Pattern - Padrão de Método de Fábrica

O Factory Method Pattern permite que as subclasses escolham o tipo de objetos a serem criados.

Ele promove o acoplamento leve , eliminando a necessidade de vincular classes específicas do aplicativo ao código. Isso significa que o código interage somente com a interface resultante ou classe abstrata, de modo que funcionará com quaisquer classes que implementem essa interface ou que estenda essa classe abstrata.

Uso do Padrão de Projeto de Fábrica :

Quando uma classe não sabe quais sub-classes serão necessárias para criar
Quando uma classe deseja que suas subclasses especifiquem os objetos a serem criados.
Quando as classes pais escolhem a criação de objetos para suas subclasses.

------------------------------------------------------------------------------------------------------

Abstract Factory Pattern - Padrão de Fábrica Abstrato

O Abstract Factory Pattern diz que basta definir uma interface ou classe abstrata para criar famílias de objetos relacionados (ou dependentes), mas sem especificar suas subclasses concretas. Isso significa que o Abstract Factory permite que uma classe retorne uma fábrica de classes. Portanto, esta é a razão de o Abstract Factory Pattern estar um nível acima do Factory Pattern.

Uso de Abstract Factory Pattern :

Quando o sistema precisa ser independente de como seus objetos são criados, compostos e representados.
Quando a família de objetos relacionados precisa ser usada em conjunto, essa restrição precisa ser aplicada.
Quando você deseja fornecer uma biblioteca de objetos que não mostra implementações e apenas revela interfaces.
Quando o sistema precisa ser configurado com um de uma família de vários objetos.

-------------------------------------------------------------------------------------------------------

Builder Design Pattern - Padrão Builder

Uso de Builder Pattern : é um padrão bem conhecido no mundo Java. É especialmente útil quando você precisa criar um objeto
com muitas opções possíveis de configuração.
O Builder Pattern diz que "construir um objeto complexo a partir de objetos simples usando uma abordagem passo a passo"
É usado principalmente quando o objeto não pode ser criado em uma única etapa, como na desserialização de um objeto complexo.

Vantagem :

Ele fornece uma separação clara entre a construção e a representação de um objeto.
Ele fornece melhor controle sobre o processo de construção.
Suporta alterar a representação interna dos objetos.

----------------------------------------------------------------------------------------------------------------

------------------------------------------------- ESTRUTURAL ---------------------------------------------------

Adapter Pattern - Padrão Adaptador

"Converte a interface de uma classe em outra interface que um cliente deseja". Também é conhecido como Wrapper.

Fornecer a interface de acordo com os requisitos do cliente ao usar os serviços de uma classe com uma interface diferente.

exemplos: 
um sistema que gera tudo xml compartilhar agora com json padrão diferente, 
um sistema gateway de pagamento integrar com outro sistema que faz as mesmas operações com formas diferentes tipo legado, api etc...


Vantagem : 

Ele permite que dois ou mais objetos anteriormente incompatíveis interajam.
Ele permite a reutilização da funcionalidade existente.

Uso do adapter :

Quando um objeto precisa utilizar uma classe existente com uma interface incompatível.
Quando você deseja criar uma classe reutilizável que coopere com classes que não possuem interfaces compatíveis.
Quando você deseja criar uma classe reutilizável que coopera com classes que não têm interfaces compatíveis


----------------------------------------------------------------------------------------------------------------


Bridge Design Pattern - Padrão de Design de Ponte

Um Bridge Pattern diz que basta "desacoplar a abstração funcional da implementação para que as duas possam variar independentemente".

O padrão de ponte também é conhecido como alça ou corpo.

Vantagem:
Ele permite a separação da implementação da interface.
Além disso, melhora a extensibilidade.
Ele permite ocultar os detalhes de implementação do cliente.

Uso da ponte:
Quando você não quer uma ligação permanente entre a abstração funcional e sua implementação.
Quando a abstração funcional e sua implementação precisam ser estendidas usando subclasses.
É usado principalmente nos locais onde as mudanças são feitas na implementação não afetam os clientes.

exemplo : 
Imagine que você precisar fazer uma live e necessita ser transmita para 3 plataformas diferentes com Youtube, TwitchTV e Facebook.


------------------------------------------------------------------------------------------------------------------

------------------------------------------------- COMPORTAMENTAL ---------------------------------------------------

Chain Of Responsibility Design Pattern - Cadeia de Responsabilidade Design Patterns

Na cadeia de responsabilidade, o remetente envia uma solicitação a uma cadeia de objetos. A solicitação pode ser tratada por qualquer objeto da cadeia.

Um padrão de cadeia de responsabilidade diz que apenas "evite acoplar o remetente de uma solicitação ao seu receptor, dando a vários objetos a chance de lidar com a solicitação". Por exemplo, um caixa eletrônico usa o Chain of Responsibility Pattern no processo de doação de dinheiro.

Em outras palavras, podemos dizer que normalmente cada receptor contém a referência de outro receptor. Se um objeto não pode lidar com a solicitação, ele passa o mesmo para o próximo receptor e assim por diante.

Vantagem :

Reduz o acoplamento.
Ele adiciona flexibilidade ao atribuir responsabilidades aos objetos.
Ele permite que um conjunto de classes atue como uma. 
Eventos produzidos em uma classe podem ser enviados para outras classes manipuladoras com a ajuda de composição.

Quando usado :

É usado quando mais de um objeto pode manipular uma solicitação e o manipulador é desconhecido.
Quando o grupo de objetos que pode atender a solicitação deve ser especificado de forma dinâmica.















































