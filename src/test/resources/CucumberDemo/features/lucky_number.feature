Feature: Finding the lucky number

  Scenario Outline : Get lucky number
    Given a random number is generated <randomNumber>
    When I check if the generated number is the lucky number
    Then I should be told "<expectedAnswer>"

    Examples:
      | randomNumber  | expectedAnswer |
      | 1             | Lose   |
      | 2             | Lose   |
      | 3             | Win    |