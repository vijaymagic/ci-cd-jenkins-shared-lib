def call(Map stageParams){
  checkout([$class: 'GitSCM', branches: [[name: stageParams.branch]], userRemoteConfigs: [[credentialsId: 'github_repo', url: stageParams.repoUrl]]])
}