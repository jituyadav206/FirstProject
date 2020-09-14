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
Jitendra''', cc: 'jitu.yadav206@gmail.com', from: '', replyTo: '', subject: 'Jenkins Job', to: 'jitu.yadav206@gmail.com'
  }
}
