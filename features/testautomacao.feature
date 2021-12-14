Feature: Acessar a pagina principal e validar as facilidades

  Scenario: Acessar a pagina principal e validar as facilidades

    Given que seja acessado o site de criação "https://www.fleury.com.br/"
    When for clicado no link "Unidades" deve estar visivel
    And clicar no filtro facilidades