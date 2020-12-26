def call(String dockerImage) {
  echo "${dockerImage}"
  withCredentials([usernamePassword(credentialsId: '93cd8e2b-5091-4836-a593-d8a1da2411c6', usernameVariable: 'hubUsername', passwordVariable: 'hubPassword')]) {
        sh """
            docker login --username="${hubUsername}" --password="${hubPassword}"
            docker push "${dockerImage}"
        """
    }
}