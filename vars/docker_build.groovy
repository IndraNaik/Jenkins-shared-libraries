def call(String ImageName, String ImageTag, String DockerHubUser){
  sh "sudo docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}
