# CI Concepts Practice with Java and Jenkins (TAE Jenkins)

This project serves as a practice ground for understanding Continuous Integration (CI) concepts using Java and Jenkins. The project involves creating a Java application that prints a message containing an environment variable. This README provides comprehensive instructions on setting up the project, cloning the repository, and implementing the CI process using Jenkins.

## Repository Content

The repository contains the following essential files:

1. **Main.java**: This Java source code file houses a simple program that prints a message containing an environment variable using the `System.getenv("variableName")` method.

2. **Jenkinsfile**: This file defines the Jenkins pipeline for the CI process. It outlines stages to fetch the code from the repository, compile the Java application, and execute it.

## Clone and Setup Instructions

Follow these steps to clone the repository and set up the project:

1. **Clone the Repository**:
   - Open your terminal or command prompt.
   - Navigate to the directory where you wish to clone the repository.
   - Execute the following command to clone the repository:

     ```bash
     git clone <repository_url>
     ```

2. **Navigate to the Project Directory**:
   - Change your working directory to the cloned repository:

     ```bash
     cd CIConceptsPracticeTAEJenkins
     ```

3. **Compile and Run the Java Application**:
   - Compile the Java application using the following command:

     ```bash
     javac Main.java
     ```

   - Run the Java application:

     ```bash
     java Main
     ```

   The application will display a message containing the value of the environment variable.

## Setting Up Jenkins Pipeline

To create a Jenkins pipeline for continuous integration, follow these steps:

1. **Access Jenkins**:
   - Open your web browser and navigate to the Jenkins dashboard (usually at `http://localhost:8080`).

2. **Create a New Pipeline**:
   - Click on "New Item" to initiate the creation of a new pipeline.
   - Opt for "Pipeline" and assign it a name (e.g., "Java-CI-Pipeline").

3. **Configure Pipeline Settings**:
   - In the "Pipeline" section, select "Pipeline script from SCM" as the definition.
   - Choose "Git" as the SCM and input your GitHub repository URL.
   - Set the script path to the location of your `Jenkinsfile` (e.g., `Jenkinsfile`).

4. **Save and Run**:
   - Save the pipeline configuration and click "Build Now" to initiate the CI process.

## Running the CI Process

Once the Jenkins pipeline is established, it will automatically trigger the CI process whenever changes are committed to the main branch of your GitHub repository. The pipeline will undertake the following steps:

1. Retrieve the code from the repository.
2. Compile the Java application.
3. Execute the Java application, thereby displaying the message containing the environment variable.

Monitor the Jenkins console output to track the progression and outcome of the pipeline run.
