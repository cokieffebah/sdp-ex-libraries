allow_scm_jenkinsfile = false

libraries{
  s3{
    bucket = 'com-okieffe-static'
    region = 'us-east-1'
    credentials = 'AwsBsdo'
  }
}

steps{
  merge = true 
}

keywords{
  merge = true
}
