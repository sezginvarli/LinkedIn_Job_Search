@Signin
@LinkedIn_Search
Feature: Linkedin Job Search

  Background: Go to LinkedIn Home Page
    Scenario: Linkedin Job Search
      Given user enters username
      When user enters password
      And user clicks JobSearch
      And user enters jobName
      And user enters job location



