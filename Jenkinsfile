
node {
  stage('checkout sources') {
        // You should change this to be the appropriate thing \changed
        git url: 'https://github.com/markdev8/special-topics-labs-ci'
        //  git url: '/home/beachm4/special-topics-labs/special-topics-labs-ci'

  }

  try {

    stage('Build') {
        echo 'Hello WORLD'
        // you should build this repo with a maven build step here \snippet inserted
        withMaven (maven: 'maven3') {
            sh "mvn package"
        }
    }
  } finally {
    junit 'build/reports/**/*.xml'
  }

  //  you should add a test report here  \inserted an attempt above
}
