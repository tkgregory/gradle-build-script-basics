[![CI](https://github.com/tkgregory/gradle-build-script-basics/actions/workflows/gradle.yml/badge.svg)](https://github.com/tkgregory/gradle-build-script-basics/actions/workflows/gradle.yml)

Demonstrates use of basic Gradle build script concepts.

Check out the YouTube video for full details. 👇<br/>
[<img src="Gradle build script basics thumbnail.png" width="500"/>](https://youtu.be/-PgdjodNf7I)
## Running

Creates ASCII art from the provided single word. Also adds 
a randomly chosen hilarious exclamation.

```bash
./gradlew run --args <single-word>
```

For example:

```bash
$ ./gradlew run --args Gradle

> Task :run
   ____               _ _        _  _   _            _ 
  / ___|_ __ __ _  __| | | ___  | || | | |___      _| |
 | |  _| '__/ _` |/ _` | |/ _ \ | || |_| __\ \ /\ / / |
 | |_| | | | (_| | (_| | |  __/ |__   _| |_ \ V  V /|_|
  \____|_|  \__,_|\__,_|_|\___|    |_|  \__| \_/\_/ (_)



BUILD SUCCESSFUL in 1s
2 actionable tasks: 1 executed, 1 up-to-date
```

## Code

* [SimpleASCIIArtGenerator.java](src/main/java/com/tomgregory/SimpleASCIIArtGenerator.java) is used in the 1st part of the tutorial.
* [ASCIIArtGenerator.java](src/main/java/com/tomgregory/ASCIIArtGenerator.java) is used in the 2nd part of the tutorial.

