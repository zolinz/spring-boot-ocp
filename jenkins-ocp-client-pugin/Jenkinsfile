try {
    timeout(time: 20, unit: 'MINUTES') {
        node('nodejs') {
            stage('build') {
                openshift.withCluster() {
                    openshift.withProject("my-sb-app-02") {
                        echo "Using project: ${openshift.project()}"
                        echo "Using cluster: ${openshift.cluster()}"
                        def myBcs = openshift.selector('bc')
                        myBcs.withEach{
                            echo " BC names : ${it.name()}  "
                        }
                    }

                    openshift.withProject("my-sb-app") {
                        echo "Using project: ${openshift.project()}"
                        def myBcs = openshift.selector('bc')
                        myBcs.withEach{
                            echo " BC names : ${it.name()}  "
                        }
                    }
                }
            }
        }
    }
} catch (err) {
    echo "in catch block"
    echo "Caught: ${err}"
    currentBuild.result = 'FAILURE'
    throw err
}