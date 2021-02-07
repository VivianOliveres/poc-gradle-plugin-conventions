# POC Gradle Plugin Conventions Local

This POC is to demonstrate the use of [convention plugins](https://docs.gradle.org/current/samples/sample_convention_plugins.html) 
into a sample scala project.

## Plugin conventions declaration

There is 3 convention plugins in the `buildSrc` folder:
 - [com.kensai.poc.scala-common-conventions](buildSrc/src/main/groovy/com.kensai.poc.scala-common-conventions.gradle): Add default scala conventions (compiler, scala version, [scalafmt](https://scalameta.org/scalafmt/))
 - [com.kensai.poc.scala-app-conventions](buildSrc/src/main/groovy/com.kensai.poc.scala-app-conventions.gradle): Add default dependencies ([cats](https://typelevel.org/cats/))
 - [com.kensai.poc.scoverage-conventions](buildSrc/src/main/groovy/com.kensai.poc.scoverage-conventions.gradle): Add [scoverage](https://github.com/scoverage/gradle-scoverage) in build

## App project

Then the app project can use them by importing them
```gradle
plugins {
    id 'com.kensai.poc.scala-app-conventions'
    id 'com.kensai.poc.scoverage-conventions'
}
```
