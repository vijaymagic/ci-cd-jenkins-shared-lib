def call(String dockerImage, String dockerfile) {
  script {
    docker.build("${dockerImage}", "-f  ./dockerfiles/${dockerfile} .")
  }
}