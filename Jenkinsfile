pipeline {
    agent any

    environment{
        ENVIRONMENT_VAR = "SEBASTIAN LOPEZ MAZO"
    }
  
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                // Compile the Java application
                bat 'javac Main.java'
            }
        }

        stage('Execute') {
            steps {
                // Run the Java application with environment variable parameter
                bat 'java Main ${ENVIRONMENT_VAR}'
            }
        }
    }
}
