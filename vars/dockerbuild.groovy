def call(String dockerImage, String dockerfile) {
  script {
    // docker.build "${dockerImage}"
    sleep 120
    docker.build("${dockerImage}", "-f  ./dockerfiles/${dockerfile}")
  }
}