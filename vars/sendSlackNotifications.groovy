def call (String buildStatus, String channel){
    def color = buildStatus == 'SUCCESS' ? 'good' : (buildStatus == 'UNSTABLE' ? 'warning' : 'danger')
    def message = "*${buildStatus}*: Job `${env.JOB_NAME}` - Build #${env.BUILD_NUMBER} \n" +
                  "Details: ${env.BUILD_URL}console"
    }