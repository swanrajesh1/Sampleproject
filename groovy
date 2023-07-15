pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the GitHub repository
                git 'https://github.com/swanrajesh1/Sampleproject.git'
            }
        }

        stage('Build') {
            steps {
                // Perform build steps here
                sh 'echo "Building the project..."'
            }
        }

        stage('Test') {
            steps {
                // Perform test steps here
                sh 'echo "Running tests..."'
            }
        }

        stage('Deploy') {
            steps {
                // Perform deployment steps here
                sh 'echo "Deploying the project..."'
            }
        }
    }
}
