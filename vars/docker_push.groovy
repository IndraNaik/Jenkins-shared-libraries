def call(String ImageName, String ImageTag,  String dockerhubuser){
  withCredentials([usernamePassword(
                    credentialsId: 'dockerHubCred',
                    passwordVariable: 'dockerHubPass',
                    usernameVariable: 'dockerHubUser')]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
}
