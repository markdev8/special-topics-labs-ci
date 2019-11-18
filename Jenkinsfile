
node {
  stage('checkout sources') {
        // You should change this to be the appropriate thing \changed
        //git url: 'https://github.com/markdev8/special-topics-labs-ci'
                git url: './special-topics-labs/special-topics-labs-ci'

  }

  stage('Build') {
    // you should build this repo with a maven build step here \snippet inserted
        withMaven (maven: 'maven3') {
          sh "mvn package"
        }
    }

        try {
            stage('Test') {
                sh ''./gradlew check'
            }

        } finally {
            junit 'build/reports/**/*.xml'
        }

  }

//  you should add a test report here  \inserted an attempt above
//  node {
//    try {
//        stage('Test') {
//            sh ''./gradlew check'
//        }
//
//    } finally {
//        junit 'build/reports/**/*.xml'
//    }
//  }
//}
