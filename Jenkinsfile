pipeline {
    agent any
    
    stages {
        stage('Hola Mundo') {
            steps {
                // compilar el codigo
                echo 'Hola Mundo'
            }
        }
        stage('SonarQube analysis') {
            steps {
                // Analizar el codigo con SonarQube
                withSonarQubeEnv('SonarQube Server') {
                    bat 'mvn sonar:sonar'
                }
            }
        }
    }
}
