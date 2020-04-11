$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Valid user should be able to login",
  "description": "",
  "id": "login-functionality;valid-user-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDef.user_already_on_login_page()"
});
formatter.result({
  "duration": 13003367200,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.user_enter_valid_credentials()"
});
formatter.result({
  "duration": 138946201,
  "status": "passed"
});
formatter.match({
  "location": "LoginDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4332348399,
  "status": "passed"
});
});