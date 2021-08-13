#  Workwers-Microservices

Observação :

Este projeto teve como objetivo esclarecimento de arquitetura projeto em microserviços, roteamento de portas, comunicação entre os modulos dos microserviços, terminando com a segurança token OAuth2,  por isso não há tratamento e excessões

----------------------------------------------------------------------------------------------------------------

 Workwers-Microservices


Sistema com Microserviços - Trabalhadores, Renda diária, Dias trabalhados e Folha de pagamentos


1 - Crição e implementação do projeto hr-worker 

2 - Criação implementação projeto hr-payroll, payroll não é persistência, apenas instancia pagamentos e ou regras de negócios, serviço registrado como componente para poder ser injetado em outras classes
            
3 - Feign client - Simples escrever clientes de webservice, pois basta escrever a interface com o serviço sem se preocupar em escrever aspectos de comunicação entre projetos integrado com ferramentas do Spring Cloud 

4 - Balanceamento de carga com Ribbon 
    
5 - Eureka Server - registros dos microserviços e suas instancias

6 - Eureka Client - portas fixas, Portas aleatórias 
      
7 -  Hystrix para tolerância a falhas, resposta alternativas, para falhas, timeout, serviços caídos etc... fallbackMethod

8 - hr-api-gateway-zuul, é um API Gateway que negocia com todas as requisições e realiza todo tipo de operação com elas inclusive roteamento dinâmico já com balanceamento de carga (no lado do servidor), para isto ele utiliza o Ribbon para procurar todas as instâncias dos serviços disponíveis no Service Discovery (Eureka Server).

9 - Zuul Timeout - Mesmo se o Hystrix e o Ribbon configurado em um microservice , se o zuul não tiver seu timeout configurado, para ele será um problema de timeout, e se o timeout estiver configurando somente no Zuul o Hystrix vai chamar o método alternativo fallbackMethod no microserviço específico.
          
10 - Usuario - user microservice -  User, Role, associação muitos para muitos <br>
Carga inicial da base de dados (seeding)        

11 -Atenticação e Autorização  - OAuth2  <br> 
User Feign Client para comunicar o OAuth2 com o User<br>


          
