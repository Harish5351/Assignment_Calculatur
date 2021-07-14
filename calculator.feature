Feature: BMI Calculator

  Scenario Outline: Calculate result with different data
    Given I Launched browser
    When I Open Url <url>
    And I Entered age as <age> select button <gender> height as <height> weight as <weight> there
    When I click on Calculate
    Then I got result
    And Close Browser
    Examples:
      | url                                              | age  | gender  | height | weight |
      | "https://www.calculator.net/bmi-calculator.html" | "20" | "csex1" | "180"  | "60"   |
      | "https://www.calculator.net/bmi-calculator.html" | "35" | "csex2" | "160"  | "55"   |
      | "https://www.calculator.net/bmi-calculator.html" | "50" | "csex1" | "175"  | "65"   |
      | "https://www.calculator.net/bmi-calculator.html" | "45" | "csex2" | "150"  | "52"   |



