$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/AutomationPracticeTests.feature");
formatter.feature({
  "name": "Automation Practice Tests",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@runalltestcases"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on automation practice site",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_am_on_automation_practice_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Send a message using contact us form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@runalltestcases"
    },
    {
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "name": "I navigate to contact us form",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.i_navigate_to_contact_us_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter details and hit submit",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.i_enter_details_and_hit_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirmation that the message has been delivered to customer service team",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.i_confirmation_that_the_message_has_been_delivered_to_customer_service_team()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Create an account using already registered email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "I click sign in on homepage",
  "keyword": "And "
});
formatter.step({
  "name": "I try and register with an already registered \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should an error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "test@test.com"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on automation practice site",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_am_on_automation_practice_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create an account using already registered email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@runalltestcases"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "I click sign in on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iClickSignInOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I try and register with an already registered \"test@test.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iTryAndRegisterWithAnAlreadyRegistered(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iShouldAnErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add and remove a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC003"
    }
  ]
});
formatter.step({
  "name": "I search for \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I add it to cart",
  "keyword": "And "
});
formatter.step({
  "name": "I click remove from cart",
  "keyword": "When "
});
formatter.step({
  "name": "the product should be removed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "T-Shirts"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on automation practice site",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.i_am_on_automation_practice_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add and remove a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@runalltestcases"
    },
    {
      "name": "@TC003"
    }
  ]
});
formatter.step({
  "name": "I search for \"T-Shirts\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add it to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAddItToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click remove from cart",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iClickRemoveFromCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product should be removed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.theProductShouldBeRemoved()"
});
formatter.result({
  "status": "passed"
});
});