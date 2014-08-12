Simple maven project
---------------------
This was generated as maven archetype

```
mvn archetype:generate -DgroupId=cz.chalda.maven -DartifactId=maven-test -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=fales
```
There is one class to compile and one class with simple test. There is a properties file in resource folder that is taken in consideration during test phase.

To run compilation and test you can use

```
mvn compile
mvn test
```

or just ```mvn test``` as the test pre-phase is compilation by default.
