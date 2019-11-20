pipelineJob('build-pipeline-job') { 

  // This is the repo that contains the Jenkinsfile you want to use to define your pipeline \switched
  def repo = 'https://github.com/markdev8/special-topics-labs-ci'  // \changed to my repo
  //def repo = '/home/beachm4/special-topics-labs/special-topics-labs-ci'  // \for local attempt

  description("Your App Pipeline") 
  keepDependencies(false) 

  properties{ 
    githubProjectUrl (repo) 
    rebuild { 
      autoRebuild(false) 
    } 
  } 

  definition { 
    cpsScm { 
      scm { 
        git { 
          remote { url(repo) } 
          branches('changes-for-lab') // \switched from 'master' as this is the branch I'm working on
          scriptPath('Jenkinsfile') // The location of the Jenkinsfile that defines the pipeline job within the repo
          extensions { }  // required as otherwise it may try to tag the repo, which you may not want 
        } 
      } 
    } 
  }
}
