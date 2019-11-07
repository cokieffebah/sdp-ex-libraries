// turn off repo level Jenkinsfiles 
allow_scm_jenkinsfile = true

application_environments{
    Dev
    Test
    Prod
}

keywords{
    override = true
    master  =  /^[Mm]aster$/
    develop =  /^[Dd]evelop(ment|er|)$/
    hotfix  =  /^[Hh]ot[Ff]ix-/
    release =  /^[Rr]elease-(\d+.)*\d$/
    test    =  /^[Tt]est(ing|)$/
}

libraries{
    // allow applications to add additional libraries
    merge = true
    sdp{
        images{
            registry = "https://docker.pkg.github.com"
            repository = "boozallen/sdp-images"
            cred = "cokieffebah-github"
        }
    }
    aws{
        /*
            application repositories should specifier the 
            identifier key
        */
        merge = true
    }    
    github{
        source_type = "github"
    }
    sonarqube
    owasp_dep_check{
        merge = true
        cvss_threshold = "11"
    }
}

steps{
    merge = true
}
