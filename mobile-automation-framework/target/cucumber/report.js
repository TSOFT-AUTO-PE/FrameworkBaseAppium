$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APP_TSOFT.feature");
formatter.feature({
  "line": 1,
  "name": "FLUJOS APP DEMO TSOFT",
  "description": "",
  "id": "flujos-app-demo-tsoft",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Nuevo Registro",
  "description": "",
  "id": "flujos-app-demo-tsoft;nuevo-registro",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TSOFT_1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "se ingresa a la APP DEMO TSOFT",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "se ingresa a la opción Registrarse",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "se ingresan los datos, nombre \"\u003ccaso_prueba\u003e\", id \"\u003ccaso_prueba\u003e\", contraseñas \"\u003ccaso_prueba\u003e\" \"\u003ccaso_prueba\u003e\" y se aceptan los términos",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da clic en el botón Registrarse y se valida mensaje",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "flujos-app-demo-tsoft;nuevo-registro;",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 12,
      "id": "flujos-app-demo-tsoft;nuevo-registro;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 13,
      "id": "flujos-app-demo-tsoft;nuevo-registro;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 44271339752,
  "status": "passed"
});
formatter.before({
  "duration": 223627441,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Nuevo Registro",
  "description": "",
  "id": "flujos-app-demo-tsoft;nuevo-registro;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TSOFT_1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "se ingresa a la APP DEMO TSOFT",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "se ingresa a la opción Registrarse",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "se ingresan los datos, nombre \"1\", id \"1\", contraseñas \"1\" \"1\" y se aceptan los términos",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "se da clic en el botón Registrarse y se valida mensaje",
  "keyword": "Then "
});
formatter.match({
  "location": "steps_TSOFT.seIngresaALaAPPDEMOTSOFT()"
});
formatter.result({
  "duration": 2059849296,
  "status": "passed"
});
formatter.match({
  "location": "steps_TSOFT.seIngresaALaOpciónRegistrarse()"
});
formatter.result({
  "duration": 2072990360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 31
    },
    {
      "val": "1",
      "offset": 39
    },
    {
      "val": "1",
      "offset": 56
    },
    {
      "val": "1",
      "offset": 60
    }
  ],
  "location": "steps_TSOFT.seIngresanLosDatosNombreIdContraseñasYSeAceptanLosTérminos(String,String,String,String)"
});
formatter.result({
  "duration": 6533122215,
  "status": "passed"
});
formatter.match({
  "location": "steps_TSOFT.seDaClicEnElBotónRegistrarseYSeValidaMensaje()"
});
formatter.result({
  "duration": 4289021678,
  "error_message": "org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Could not proxy. Proxy error: Could not proxy command to remote server. Original error: 404 - undefined\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MS77F7I\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: io.appium.java_client.AppiumDriver\nCapabilities {appActivity: appinventor.ai_aalexriverar..., appPackage: appinventor.ai_aalexriverar..., databaseEnabled: false, desired: {appActivity: appinventor.ai_aalexriverar..., appPackage: appinventor.ai_aalexriverar..., deviceName: SM J320M, newCommandTimeout: 120, platformName: android, platformVersion: 5.1.1, udid: 42009d83a8a61400}, deviceApiLevel: 22, deviceManufacturer: samsung, deviceModel: SM-J320M, deviceName: 42009d83a8a61400, deviceScreenDensity: 320, deviceScreenSize: 720x1280, deviceUDID: 42009d83a8a61400, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, newCommandTimeout: 120, pixelRatio: 2, platform: LINUX, platformName: LINUX, platformVersion: 5.1.1, statBarHeight: 50, takesScreenshot: true, udid: 42009d83a8a61400, viewportRect: {height: 1230, left: 0, top: 50, width: 720}, warnings: {}, webStorageEnabled: false}\nSession ID: 6530bf56-a77c-4d32-8150-91ef2c5ad1bc\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:46)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat com.tsoft.bot.frontend.pageobject.APP_TSOFT.PageObject_TSOFT.Registrar_Validar(PageObject_TSOFT.java:133)\r\n\tat com.tsoft.bot.frontend.steps.APP_TSOFT.steps_TSOFT.seDaClicEnElBotónRegistrarseYSeValidaMensaje(steps_TSOFT.java:48)\r\n\tat ✽.Then se da clic en el botón Registrarse y se valida mensaje(APP_TSOFT.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1885763284,
  "status": "passed"
});
});