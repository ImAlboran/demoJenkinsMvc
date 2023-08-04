pipeine{
    agent any

    stages {
        stage('Build Docker Image'){
            steps {
                script {
                    dockerimage - docker.build('demoJenkinsMvc:latest')

                }
            }
        }
    }
}