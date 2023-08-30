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
                sh 'javac Main.java'
            }
        }

        stage('Execute') {
            steps {
                // Run the Java application with environment variable parameter
                sh 'java Main ${ENVIRONMENT_VAR}'
            }
        }
    }
}
