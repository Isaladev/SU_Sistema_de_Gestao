# SU_-Sistema_de_Gestao
Este projeto tem como objetivo desenvolver uma aplicação de gestão voltada para pequenos negócios do segmento alimentício, com foco na organização de produtos, controle de custos e acompanhamento financeiro.
A proposta é construir uma ferramenta que centralize informações importantes da operação, permitindo que o empreendedor tenha maior controle sobre seus produtos, preços e resultados.

🚀 Objetivo do projeto

A aplicação está sendo desenvolvida para evoluir de um cadastro de produtos para um sistema de gestão capaz de auxiliar na tomada de decisões estratégicas do negócio.

A partir do cadastro do cardápio e da estruturação das informações de custos e preços, a proposta é futuramente possibilitar:

Cadastro e gerenciamento de produtos: descrição, unidade de medida e preço unitário.

Controle de custos: organização dos valores investidos na aquisição de insumos e produtos.

Cálculo do total investido: acompanhamento do capital destinado à composição do estoque e à produção.

Formação de preços: apoio à definição de valores de venda.

Análise de margem de lucro: comparação entre custos e preços de venda para compreender a rentabilidade dos produtos.

Relatórios gerenciais: visualização de informações que auxiliem no planejamento e na gestão financeira.

🛠️ Tecnologias utilizadas

Java 21

Spring Boot

Spring Data JPA

Hibernate

MySQL

Lombok

📌 Desenvolvimento atual

Nesta primeira etapa, foi implementada a estrutura inicial do módulo de produtos, contemplando:

Entidade ProdutosEntity;

Camada ProdutosRepository para acesso aos dados;

Camada ProdutosService para aplicação das regras de negócio;

Camada ProdutosController para disponibilização dos endpoints REST;

Operações CRUD: cadastro, consulta, atualização e exclusão de produtos;

Integração com banco de dados MySQL.

💡 Visão futura

A intenção é expandir a aplicação de forma modular, conectando o cadastro de produtos a outros recursos, como estoque, fornecedores, compras, vendas e fluxo de caixa.

Com essas informações integradas, o sistema poderá transformar dados operacionais em indicadores financeiros, como total investido, custos, faturamento e margem de lucro, oferecendo uma visão mais clara da saúde financeira do negócio.

Este projeto está em desenvolvimento contínuo, com foco na aplicação prática de conceitos de desenvolvimento backend, arquitetura em camadas, persistência de dados e construção de soluções para problemas reais.
