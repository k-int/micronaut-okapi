

# Publishing Build Artefacts

## Publish to local Maven repository

run

    gradle publishToMavenLocal

And you should find the version under ~/.m2/repository/com/k_int/mn/okapi/micronaut-okapi/

## Publish to Remote Maven
edit ~/.gradle/gradle.properties and add

    kintMavenUser=
    kintMavenPassword=

and run 

    gradle publish

To push the jar to the public maven repo
