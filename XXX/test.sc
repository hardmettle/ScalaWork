import scala.util.parsing.json._
object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val jsonStr = """{"created_at":"Sat Feb 08 08:30:24 +0000 2014","id":432068884200714240,"id_str":"432068884200714240","text":"y a dormirrrr se ha dicho ue","source":"\u003ca href=\"http:\/\/twitter.com\/download\/android\" rel=\"nofollow\"\u003eTwitter for Android\u003c\/a\u003e","truncated":false,"in_reply_to_status_id":null,"in_reply_to_status_id_str":null,"in_reply_to_user_id":null,"in_reply_to_user_id_str":null,"in_reply_to_screen_name":null,"user":{"id":946582484,"id_str":"946582484","name":"Smiler \u2665\u0627\u0627\u2665 ","screen_name":"YaamilaP","location":"Everything's gonna be alright","url":"http:\/\/Facebook.com\/YamiilaSoledad","description":"November 23, 1992 Baptist Hospital Nashville, Tennessee. \u2661 @MileyCyrus #SMILER #Bangerz \u2661 \u221e \u2022","protected":false,"followers_count":1019,"friends_count":994,"listed_count":0,"created_at":"Tue Nov 13 21:52:39 +0000 2012","favourites_count":1463,"utc_offset":-7200,"time_zone":"Brasilia","geo_enabled":true,"verified":false,"statuses_count":25704,"lang":"es","contributors_enabled":false,"is_translator":false,"is_translation_enabled":false,"profile_background_color":"DDB3E6","profile_background_image_url":"http:\/\/pbs.twimg.com\/profile_background_images\/378800000179853625\/6Z7A3P3z.png","profile_background_image_url_https":"https:\/\/pbs.twimg.com\/profile_background_images\/378800000179853625\/6Z7A3P3z.png","profile_background_tile":true,"profile_image_url":"http:\/\/pbs.twimg.com\/profile_images\/428600403748331522\/tYOfQ-0H_normal.jpeg","profile_image_url_https":"https:\/\/pbs.twimg.com\/profile_images\/428600403748331522\/tYOfQ-0H_normal.jpeg","profile_banner_url":"https:\/\/pbs.twimg.com\/profile_banners\/946582484\/1388407428","profile_link_color":"A312EB","profile_sidebar_border_color":"000000","profile_sidebar_fill_color":"252429","profile_text_color":"666666","profile_use_background_image":true,"default_profile":false,"default_profile_image":false,"following":null,"follow_request_sent":null,"notifications":null},"geo":{"type":"Point","coordinates":[-34.5525043,-58.5932974]},"coordinates":{"type":"Point","coordinates":[-58.5932974,-34.5525043]},"place":null,"contributors":null,"retweet_count":0,"favorite_count":0,"entities":{"hashtags":[],"symbols":[],"urls":[],"user_mentions":[]},"favorited":false,"retweeted":false,"filter_level":"medium","lang":"es"}"""
                                                  //> jsonStr  : String = {"created_at":"Sat Feb 08 08:30:24 +0000 2014","id":432
                                                  //| 068884200714240,"id_str":"432068884200714240","text":"y a dormirrrr se ha d
                                                  //| icho ue","source":"<a href=\"http:\/\/twitter.com\/download\/android\" rel=
                                                  //| \"nofollow\">Twitter for Android<\/a>","truncated":false,"in_reply_to_statu
                                                  //| s_id":null,"in_reply_to_status_id_str":null,"in_reply_to_user_id":null,"in_
                                                  //| reply_to_user_id_str":null,"in_reply_to_screen_name":null,"user":{"id":9465
                                                  //| 82484,"id_str":"946582484","name":"Smiler ???? ","screen_name":"YaamilaP","
                                                  //| location":"Everything's gonna be alright","url":"http:\/\/Facebook.com\/Yam
                                                  //| iilaSoledad","description":"November 23, 1992 Baptist Hospital Nashville, T
                                                  //| ennessee. ? @MileyCyrus #SMILER #Bangerz ? ? •","protected":false,"follower
                                                  //| s_count":1019,"friends_count":994,"listed_count":0,"created_at":"Tue Nov 13
                                                  //|  21:52:39 +0000 2012","favourites_count":1463,"utc_offset":-7200,"time_zone
                                                  //| ":"Brasilia","geo_enabl
                                                  //| Output exceeds cutoff limit.
    val res = JSON.parseFull(jsonStr);            //> res  : Option[Any] = Some(Map(coordinates -> Map(type -> Point, coordinates
                                                  //|  -> List(-58.5932974, -34.5525043)), retweeted -> false, source -> <a href=
                                                  //| "http://twitter.com/download/android" rel="nofollow">Twitter for Android</a
                                                  //| >, entities -> Map(hashtags -> List(), symbols -> List(), urls -> List(), u
                                                  //| ser_mentions -> List()), favorite_count -> 0.0, in_reply_to_status_id_str -
                                                  //| > null, geo -> Map(type -> Point, coordinates -> List(-34.5525043, -58.5932
                                                  //| 974)), id_str -> 432068884200714240, in_reply_to_user_id -> null, truncated
                                                  //|  -> false, text -> y a dormirrrr se ha dicho ue, retweet_count -> 0.0, id -
                                                  //| > 4.3206888420071424E17, in_reply_to_status_id -> null, filter_level -> med
                                                  //| ium, created_at -> Sat Feb 08 08:30:24 +0000 2014, place -> null, favorited
                                                  //|  -> false, lang -> es, contributors -> null, in_reply_to_screen_name -> nul
                                                  //| l, in_reply_to_user_id_str -> null, user -> Map(utc_offset -> -7200.0, name
                                                  //|  -> Smiler ???? , frien
                                                  //| Output exceeds cutoff limit.
    res match {
      case Some(e) => println(e)
      case None =>
    }                                             //> Map(coordinates -> Map(type -> Point, coordinates -> List(-58.5932974, -34.
                                                  //| 5525043)), retweeted -> false, source -> <a href="http://twitter.com/downlo
                                                  //| ad/android" rel="nofollow">Twitter for Android</a>, entities -> Map(hashtag
                                                  //| s -> List(), symbols -> List(), urls -> List(), user_mentions -> List()), f
                                                  //| avorite_count -> 0.0, in_reply_to_status_id_str -> null, geo -> Map(type ->
                                                  //|  Point, coordinates -> List(-34.5525043, -58.5932974)), id_str -> 432068884
                                                  //| 200714240, in_reply_to_user_id -> null, truncated -> false, text -> y a dor
                                                  //| mirrrr se ha dicho ue, retweet_count -> 0.0, id -> 4.3206888420071424E17, i
                                                  //| n_reply_to_status_id -> null, filter_level -> medium, created_at -> Sat Feb
                                                  //|  08 08:30:24 +0000 2014, place -> null, favorited -> false, lang -> es, con
                                                  //| tributors -> null, in_reply_to_screen_name -> null, in_reply_to_user_id_str
                                                  //|  -> null, user -> Map(utc_offset -> -7200.0, name -> Smiler ???? , friends_
                                                  //| count -> 994.0, screen_
                                                  //| Output exceeds cutoff limit.
  
}