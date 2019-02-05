void call(String img, Closure body){
  
  config.throw ?: { error "SDP sdp.throw == true and defined in Pipeline Config" } ()
}
