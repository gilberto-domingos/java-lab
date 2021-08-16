# Design-Patterns

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





































