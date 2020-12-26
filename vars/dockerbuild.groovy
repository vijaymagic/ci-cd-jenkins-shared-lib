def call(String dockerImage, String dockerfile) {
  script {
    // docker.build "${dockerImage}"
    docker.build("-f ./dockerfiles/${dockerfile}", "${dockerImage}")
  }
}