node{
stage('SCM Checkout'){
git 'https://github.com/jituyadav206/FirstProject'
}
stage('Compile-Package'){
sh 'mvn package'
}
  stage('Email Notification'){
   mail bcc: '', body: '''Hi,Welcome to Jenkins Email alert

Regards,
Jitendra''', cc: 'jitulovesmom@gmail.com', from: '', replyTo: '', subject: 'Jenkins Job', to: 'jitulovesmom@gmail.com'
  }
  
  stage('Slack Notification'){
    slackSend baseUrl: 'https://hooks.slack.com/services/',
      channel: '#jenkins-pipeline-demo',
      color: 'good', 
      message: 'Welcome to jenkins slack',
      tokenCredentialId: 'slack-demo'
  }
}
