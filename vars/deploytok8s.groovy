
def call(String dockerImage, String app, String service) {
    sh """
        ansible-playbook ansible-k8s-deployment.yml --extra-vars \"image_id=${dockerImage} app_name=${app} service_name=${service}\"
    """
}