
[//]: # (<!-- PROJECT LOGO -->)

[//]: # (<br />)

[//]: # (<p align="center">)

[//]: # (  <a href="https://www.kyosk.app/">)

[//]: # (    <img src="https://karuru-new.kyosk.app/applib/assets/kyosk-logo-blue.svg" alt="Kyosk Digital Services" width="80" height="80">)

[//]: # (  </a>)

<h3 align="center">Spring Boot Temporal Sample Project</h3>
  <p align="center">
    This projects provides a testbed for learning temporal and the services incorporated on the framework.
It is a work in progress!
    <br />
    <br />
    <a href="https://karuru-new.kyosk.app/applib/#/">Kyosk App Library</a>
    ·
    <a href="https://karuru.kyosk.dev/admin-portal/home">Kyosk Portal Staging</a>
    ·
    <a href="https://karuru-new.kyosk.app/admin-portal/home">Kyosk Portal Production</a>
</p>

### Setup

Use this guide to setup the project in your local environment

### Before you start

You will need to have the following

1. Docker
2. Docker desktop
3. An IDE
4. Git

### Gcloud Login

Login to Gcloud via the Gcloud Command Line Interface tool (CLI). To install the CLI
https://cloud.google.com/sdk/docs/install-sdk
Once you have it installed and setup for your specific OS. Login to Google cloud.

```bash
gcloud init
```

Or

```bash
gcloud auth login
```

The CLI tool will guide you on the login steps, follow till the end

### Setup the Repo

The backend single repo is available on https://github.com/muraya/spring-boot-temporal-sample.git
Clone it to your local environment.

```bash
git clone https://github.com/muraya/spring-boot-temporal-sample.git
```

The minimum requirements for running the repo are:

1. Java 17
2. Mongo DB
3. Temporal/Temporalite
4. Gradle

### Install Gradle dependencies

Once the repo is cloned you can do a gradle install or refresh gradle dependencies.

```bash
gradle build
```

### Install External Tools

The following external tools are needed to run the repo locally

1. Temporal Workflow Management tool
2. Mongo DB

Recommended installation method is through Docker

1. Temporal: https://docs.temporal.io/self-hosted-guide/setup#docker--docker-compose
2. Docker: https://mongodb.com/docs/manual/tutorial/install-mongodb-community-with-docker/

Then run the containers on your local docker.
The other external tool needed is mongo, which should be installed locally.

### Setup ENV Variables

Setup the following environment variables to your configuration/properties files
https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html

For GRPC
```bash
GRPC_SERVER_PORT=#
```

For Kafka
```bash
BOOTSTRAP_SERVERS=#
SASL_JAAS_CONFIG=#
SCHEMA_REGISTRY_BASIC_AUTH_USER_INFO=#
SCHEMA_REGISTRY_URL=#
SPRING_DATASOURCE_URL=#
SPRING_KAFKA_PROPERTIES_SECURITY_PROTOCOL=#
```

### Build and Run

### Postman Collection
The project utilizes GraphQl for connecting endpoints. 
The postman collection file is appended to the projects <b> postman </b> folder where the file can be imported into postman.
> For any issues while importing the collection feel free to mail the developer for assistance.

### Deployment


### Monitoring


### Testing

The projects services are tested using Junit 5 and Mockito. The tests are run on the gradle build.
For temporal related tests we have test containers in place that provided an test environment to run the 
workflows.