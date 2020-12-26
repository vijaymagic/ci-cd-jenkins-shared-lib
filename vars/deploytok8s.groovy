
def call(String dockerImage, String app, String service) {
    sh """
        ansible-playbook deploy_k8s.yml --extra-vars \"image_id=${dockerImage} app_name=${app} service_name=${service}\"
    """
}