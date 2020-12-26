def call(String dockerImage) {
  script {
    // docker.build "${dockerImage}"
    docker.build("${dockerImage}", "-f ${dockerfile} ./dockerfiles")
  }
}