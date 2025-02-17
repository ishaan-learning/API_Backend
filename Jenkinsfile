pipeline{
    agent any
    tools {
        //install the maven version configured as 'm3' and add it to the path
        maven "M399"
    }
    stages {
        stage("Echo Version of Maven and git") {
            steps {
                echo "print maven version:"
                sh 'mvn -version'
                echo "print git version"
                sh 'git -v'
            }
        }
        stage('Cleanup Workspace') {
            steps {
                script {
                    if (fileExists('API_Backend')) {
                        echo "Removing existing API_Backend folder..."
                        sh 'rm -rf API_Backend'
                    }
                }
            }
        }

        stage("Obtain artifact/code from git") {
            steps {
                //echo "Downloading code from Git Repo:"
                //sh 'git clone https://github.com/ishaan-learning/API_Backend.git'
                echo "teating if clone worked fine: "
                sh 'ls -laRt'
                echo "priting current working directory"
                sh "pwd"
            }
        }
        stage("cleaning the maven package before re-packaging") {
            steps{
                echo "Performing mvn clean"
                echo "checking current directory"
                sh "pwd"
                sh "ls -lrt"
                echo "running mv clean now:"
                sh "mvn clean"
                echo " checking if target dir is removed"
                sh "ls -lrt"
            }
        }
        stage("maven package") {
            steps{
                echo "performing mvn build:"
                sh "mvn package"
                echo " checking if target dir is created"
                sh "ls -lRt"
            }
        }
        
        stage("maven unit test") {
            steps {
            echo "performing unit test"
            sh "mvn test"
                
            }
        }
        
    }
}
