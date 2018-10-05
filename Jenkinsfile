pipeline {
    agent any
    tools{
        jdk "java8"
    }
    stages {
        stage('Compilation') {
            steps {
                sh './gradlew clean compileJava'
            }
        }
        stage('Unit Test') {
            steps {
                sh './gradlew test jacocoTestReport'
            }
        }
        stage('Static Analysis') {
            steps {
                sh './gradlew check'
            }
        }
        stage('Artifact Generation') {
            steps {
                sh './gradlew assemble'
            }
        }
    }
    post{
        always{
            junit 'build/test-results/*.xml'

            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'build/reports/jacoco',
                reportFiles: 'index.html',
                reportName: 'Coverage Report'
            ]
            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'build/tests/test',
                reportFiles: 'index.html',
                reportName: 'Test Report'
            ]
            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'build/reports/checkstyle',
                reportFiles: 'main.html, test.html',
                reportName: 'CheckStyle Report'
            ]
            publishHTML target: [
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: true,
                reportDir: 'build/reports/findbugs',
                reportFiles: 'main.html',
                reportName: 'FindBugs Report'
            ]
        }
        success{
            archiveArtifacts artifacts: 'build/libs/*.jar'
        }

    }
}