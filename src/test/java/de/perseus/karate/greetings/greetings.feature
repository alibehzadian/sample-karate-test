Feature: Testing a REST API with Karate
Scenario: Testing greetings endpoint
    Given url 'http://localhost:8080/greetings'
    When method GET
    Then status 200
    And match $ == "Hello World!"