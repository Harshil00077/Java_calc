pipeline {
    agent any

    tools {
        maven 'Maven'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Harshil00077/Java_calc']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t harshil00077/temp-integration .'
                }
            }
        }
        stage('Push docker image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'temp1', variable: 'temp1')]) {
                    sh 'docker login -u harshil00077 -p ${temp1}'
    // some block
}
                    sh 'docker push harshil00077/temp-integration'

                }
            }
        }
        stage('Stop and Remove Existing Container') {
                    steps {
                        script {
                            // Stop and remove existing container if it exists
                            sh 'docker rm -f calc || true'
                        }
                    }
                }

        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                     )
                }
            }
        }
    }
}
