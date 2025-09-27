# Simple Quarkus "Hello World" Application with Gradle and Docker support

## Running the application in dev mode

You can run your application in **dev** mode that enables live coding using:

```shell script
./gradlew --console=plain quarkusDev
```

You can run your application in **prod** mode that enables live coding using:

```shell script
./gradlew --console=plain quarkusRun
```

## [Semantic versioning](https://zoltanaltfatter.com/2020/04/10/semantic-versioning-with-jgitver/)

### Plugin [fr.brouillard.oss.gradle.jgitver](https://github.com/jgitver/gradle-jgitver-plugin)

```shell
./gradlew version
```

```shell
./gradlew version | grep Version | awk '{ print $2 }'
```

### Update version and add git tag

```shell
git tag 2025.09
```

## Run docker image

```shell
docker run --rm a002k/quarkus
```

```shell
docker run -d --name quarkus --rm a002k/quarkus
```

- ```-i``` Keep STDIN open even if not attached
- ```--rm``` Remove container after stop
- ```-d``` Detach mode, Run container in background and print container ID

and follow ```-f``` logs

```shell
docker logs -f quarkus
```

to stop

```shell
docker stop quarkus
```

## Run docker image as docker-compose

```shell
docker compose run -d --name quarkus --rm quarkus
```

and follow ```-f``` logs

```shell
docker compose logs -f quarkus
```

to stop

```shell
docker compose down
```

[![Github Action Badge](https://github.com/ak-git/Quarkus/actions/workflows/actions.yml/badge.svg)](https://github.com/ak-git/Quarkus/actions/workflows/actions.yml/badge.svg)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=coverage)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=bugs)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=ak-git_Quarkus&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=ak-git_Quarkus)
