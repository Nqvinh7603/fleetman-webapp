node {
   stage('Preparation') { 
      git 'https://github.com/Nqvinh7603/fleetman-webapp'
   }
   stage('Build') {
      sh "mvn -DskipTests clean package"
   }
   stage('Results') {
      archive 'target/*.war'
   }
   stage('Deploy') {      
      withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'awscredentials', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
         ansiblePlaybook credentialsId: 'SSH', installation: 'ansible', playbook: 'deploy.yaml', sudoUser: null      
      }     
   }
}
