
pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3.9.14'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/tanya296/ci-cd-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t ci-cd-pipeline:1.0 .'
            }
        }
    }
}
