def call(String dockerImage, String dockerfile) {
  script {
    // docker.build "${dockerImage}"
    docker.build("${dockerImage}", "-f ${dockerfile} ./dockerfiles/")
    // docker.build("db", "-f docker/db/Dockerfile .")
  }
}