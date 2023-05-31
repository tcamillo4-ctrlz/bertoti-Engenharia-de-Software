# Tiago Camillo

## Introdução

Olá, seja bem-vindo! Sou o Tiago Camillo, estudante de Banco de Dados pela FATEC São José dos Campos - Prof. Jessen Vidal.

Tenho 19 anos e trabalho como Analista de Negócios Júnior.

### Meus principais conhecimentos

#### Python

Python é a linguagem de programação que eu possuo maior domínio e conhecimento, e isso se dá por conta de minhas experiências de trabalho. Através delas, pude tanto construir e consumir APIs, como também desenvolvi outros serviços, conectando aplicações, desenvolvendo lógicas de sistemas e tratando dados. 

#### Java

Tenho utilizado a linguagem de programação Java durante todo o meu tempo de graduação. Ainda não desenvolvi com essa linguagem para o ambiente profissional, no entanto, durante esses anos de estudo, tenho desenvolvido diversas soluções em Java, o que me traz conhecimento sobre essa linguagem.

#### Projetos Integradores durante a graduação

Projeto Integrador tem o objetivo de solucionar um problema da realidade, trazido por alguma empresa em acordo com a entidade de ensino, utilizando os conhecimentos adquiridos durante a graduação.

Abaixo está listado o projeto desenvolvido no 3º Semestre da graduação, detalhando o problema, solução proposta (e entregue), e os aprendizados extraídos dele.

# Projeto 3: 2º Semestre de 2022 

### Reposiório do Projeto

[IACIT - Fluffy Fatec](https://github.com/fluffyfatec/Iacit)

### Parceiro Acadêmico

IACIT Soluções Tecnológicas

### Visão do Projeto

O desafio foi estipulado como desenvolver um sistema que permita realizar a importação dos dados meteorológicos, bem como armazená-los em uma base de dados, para posteriormente gerar os relatórios desejados por nossos clientes.

Como solução, a equipe desenvolveu um software web para a empresa, que possibilita a automatização desde o download, o processamento dos dados e a persistência dos dados no banco de dados de forma simplificada. Também é possível realizar a filtragem desses dados por temperatura, umidade, estações, vento, pressão atmosférica, radiação global e precipitação, além da diversa visualizações desses dados. E por último, foram desenvolvidos diferentes níveis de usuários juntamente com o painel administrativo possibilitando a exportação dos relatórios a partir dos dados.

### Tecnologias Adotadas na Solução

#### Java - Spring Boot

A linguagem Java foi utilizada em praticamente todo o back-end da aplicação. Junto com o framework Spring Boot, foram desenvolvidas, com a linguagem, diversas funcionalidades da aplicação, como a configuração da lógica para a utilização dos dados armazenados no banco de dados, o desenvolvimento de toda a API do sistema para que os dados possam ser consumidos pelo front-end, as funções de CRUD (Create, Read, Update, Delete) do usúario, e a segurança da aplicação via token.  

Para saber mais: [Java](https://www.java.com)

#### Python

A linguagem Python foi utilizada para a automatização do tratamento de dados da aplicação. Com ela, foi feito desde o download dos arquivos CSVs, originados do [Portal INMET](https://portal.inmet.gov.br), efetuando a descompactação dos arquivos, tratamento de todos os dados meteorológicos, e a inserção desses dados no banco de dados. Tudo de forma automatizada pela rotina de tarefas desenvolvidas na linguagem.

Para saber mais: [Python](https://www.python.org)

#### JavaScript

A linguagem JavaScript foi utilizada em grande parte do front-end da aplicação. Com ela foi efetuada a utilização dos dados enviados do back-end para o front-end, desenvolvendo gráficos, tabelas e outras formas de visualização de dados para o usuário. Além de ser utilizada para deixar as telas da aplicação de forma dinâmica, fazendo com que elas sejam responsivas com as ações tomadas pelo usuário e os dados atuais do banco de dados.

Para saber mais: [JavaScript](https://www.javascript.com)

#### PostgreSQL

O SGDB (Sistema Gerenciador de Banco de Dados) PostgreSQL foi utilizado para o armazenamento dos dados automatizados pelo Python. Com ele, foram feitas as criações de tabelas, views e triggers do banco de dados da aplicação, e era feito o gerenciamento dos dados.

Para saber mais: [PostgreSQL](https://www.postgresql.org)

### Contribuições Pessoais

Fui responsável pela programação do front-end da aplicação, que se consistia em consumir os dados gerados pelo back-end através de API e gerar uma interface para o usuário poder utilizar a aplicação.

Por estar focado nesta parte do projeto, fui encarregado, junto com a equipe de front-end, de estudar e desenvolver as telas da aplicação. Com isso, foram definidos os layouts de cada tela, desenvolvidos gráficos, tabelas e filtros dinâmicos, todos utilizando os dados consumidos do back-end.

O desenvolvimento das telas contou com a linguagem de marcação HTML, junto com a estilização em CSS. A parte lógica da aplicação contou com JavaScript, e em algumas situações, a técnica AJAX.

### Aprendizados Efetivos (Soft e Hard Skills)

Com o desenvolvimento desse projeto, pude ter a oportunidade de me desenvolver de várias formas, tanto no âmbito acadêmico, como também no profissional e pessoal. Devido a essa experiência, tive o aprendizado e o aperfeiçoamento em áreas como a colaboração/trabalho em equipe, comunicação entre os membros do grupo, a utilização do pensamento crítico, a capacidade de resolução de problemas e a gestão do tempo. Todas essas habilidades foram necessárias para que o grupo pudesse concluir o projeto de forma positiva e eficaz, entregando a solução do projeto. Essas "soft skills" são responsáveis por manter o grupo alinhado e trabalhando junto, cada um com a sua função específica, para que podessemos avançar nas etapas e nos desafios do projeto.

Juntos com elas, também se pode ressaltar algumas "hard skills" exigidas para esse projeto, como o conhecimento ligado ao desenvolvimento web, a gestão do banco de dados, configuração de segurança da aplicação, como também o desenvolvimento de usuário e interface do usuário, e a administração do sistema desenvolvido. Essas habilidades foram relevantes para a parte prática do projeto em si e, com a busca de materiais e trabalho em equipe, cada uma foi aperfeiçoada nesse tempo de desenvolvimento, resultando numa conclusão correta do sistema.