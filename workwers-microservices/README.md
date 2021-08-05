# workwers-microservices


Sistema com Microserviços - Trabalhadores, Renda diária, Dias trabalhados e Folha de pagamentos


1 - Crição e implementação do projeto hr-worker 

2 - Criação implementação projeto hr-payroll, payroll não é persistência, apenas instancia pagamentos e ou regras de negócios, serviço registrado como componente para poder ser injetado em outras classes
            
3 - Feign client - faz com que seja simples escrever clientes de webservice, pois basta escrever a interface com o serviço sem se preocupar em escrever aspectos de comunicação entre projetos integrado com ferramentas do Spring Cloud 

4 - Balanceamento de carga com Ribbon 
    
5 - Eureka Server - registros dos microserviços e suas instancias

6 - Eureka Client - portas fixas, Portas aleatórias 
      
7 -  Hystrix para tolerância a falhas, resposta alternativas, para falhas, timeout, serviços caídos etc... fallbackMethod

8 - hr-api-gateway-zuul, é um API Gateway que negocia com todas as requisições e realiza todo tipo de operação com elas inclusive roteamento dinâmico já com balanceamento de carga (no lado do servidor), para isto ele utiliza o Netflix Ribbon para procurar todas as instâncias dos serviços disponíveis no Service Discovery (Netflix Eureka Server).

9 - Zuul Timeout - Mesmo se o Hystrix e o Ribbon configurado em um microservice , se o zuul não tiver seu timeout configurado, para ele será um problema de timeout, e se o timeout estiver configurando somente no Zuul o Hystrix vai chamar o método alternativo fallbackMethod no microserviço específico.
          
10 - Usuario - user microservice -  User, Role, associação muitos para muitos <br>
Carga inicial da base de dados (seeding)        

11 -Atenticação e Autorização  - OAuth2,  <br>
deixando o spring security por último para não ficar bloqueando os testes na implementação.

12 - Docker - a fazer após o término autenticação <br>
  
 Container de hr-eureka-server, Container de hr-worker, Container de hr-user, Container de hr-payroll, Container de hr-oauth, Container de hr-api-gateway-zuul
          
