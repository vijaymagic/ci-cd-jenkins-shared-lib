def call() {
    sh """
        echo "Testing the docker built image"
        sleep 60
    """
}
