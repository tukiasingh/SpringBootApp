pipeline {
    agent any

    stages {
        stage('Get the Code from Jenkins') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/tukiasingh/SpringBootApp.git'
            }
        }

        stage('Maven Clean') {
            steps {
                //clean the target
                echo "Cleaning target directory"
                // Run Maven on a Unix agent.
                sh "./mvnw clean"
            }
        }

        stage('Maven Compile') {
            steps {
                //compile the code
                echo "Compiling the code"
                // Run Maven on a Unix agent.
                sh "./mvnw compile"
            }
        }
        stage('Maven Test') {
            steps {
                //test the code
                echo "Running Junits"
                // Run Maven on a Unix agent.
                sh "./mvnw test"
            }
        }

        stage('Maven Package') {
            steps {
                //test the code
                echo "Creating Artifacts"
                // Run Maven on a Unix agent.
                sh "./mvnw package"
            }
        }

        stage('Run the Application') {
            steps {
                //test the code
                echo "Running Application"
                // Run Maven on a Unix agent.
                sh "java -jar target/SpringBootApp-0.0.1-SNAPSHOT.jar"
            }
        }
    }
}
