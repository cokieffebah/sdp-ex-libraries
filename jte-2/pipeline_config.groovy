application_environments{
    Dev
    Test
    Prod
}

jte{
  allow_scm_jenkinsfile = true 
}

keywords{
    override = true
    master  =  /^[Mm]aster$/
    develop =  /^[Dd]evelop(ment|er|)$/
    hotfix  =  /^[Hh]ot[Ff]ix-/
    release =  /^[Rr]elease-(\d+.)*\d$/
    test    =  /^[Tt]est(ing|)$/
}

@merge libraries{
    
    sdp{
        images{
            registry = "https://docker.pkg.github.com"
            repository = "boozallen/sdp-images"
            cred = "cokieffebah"
        }
    }
    
    git{
        gitlab
    }
    owasp_dep_check{
        merge = true
        cvss_threshold = "11"
    }
}
