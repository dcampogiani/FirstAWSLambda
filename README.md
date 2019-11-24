# First AWS Lambda

## Dependencies
 - [Kotlin](https://kotlinlang.org/) Language
 - [Gradlew Shadow Plugin](https://github.com/johnrengelman/shadow) to collapse all dependencies and project code into a single Jar file
 - [AWS Lambda Java Core](https://github.com/aws/aws-lambda-java-libs/tree/master/aws-lambda-java-core) to use [RequestHandler](https://github.com/aws/aws-lambda-java-libs/blob/master/aws-lambda-java-core/src/main/java/com/amazonaws/services/lambda/runtime/RequestHandler.java) interface
 - [Kotlin Test](https://kotlinlang.org/api/latest/kotlin.test/index.html) for unit testing

## Description
- App is the entry point, it's implementing RequestHandler, this way the method handleRequest will be invoked by AWS
- RequestHandler is using HandlerInput as input and HandlerOutput as output, both are dummy classes with a String inside
- Inside handleRequest there is our *"logic"*

[Here](https://github.com/dcampogiani/FirstAWSLambdaMicronaut) you can find the same lambda using [Micronaut](https://micronaut.io/)

