# Socialite
Combines basic person data from various social sites such as Twitter, Facebook, LinkedIn, Quora and Youtube.

To start the service run the following command from the parent directory:-

java -jar Socialite/target/Socialite-1.0-SNAPSHOT.jar server Socialite/src/resources/socialite-rest-conf.yaml


#Work currently in progress


# Currently we have implemented 6 mock rest services, each taking person id as an argument.

1.) Facebook Service:-

URL:- 
http://localhost:2727/socialite/facebook?personId=333

Returns :-

FacebookResponse

Sample output:-
{"id":"Yashraj","profilePicturesCount":100,"coverPicturesCount":200,"likesCount":300,"commentsCount":400,"sharesCount":333,"setId":true,"setProfilePicturesCount":true,"setCoverPicturesCount":true,"setLikesCount":true,"setCommentsCount":true,"setSharesCount":true}


2.) LinkedIn Service:-

URL :- 
http://localhost:2727/socialite/linkedIn?personId=333

Returns :-
LinkedInResponse

Sample output:-
{"id":"Yashraj","currentTitle":"Software Engineer","currentJob":"ABC Company","previousTitle":"Software Engineer","previousJob":"XYZ Company","skillsCount":200,"connectionsCount":400,"setId":true,"setCurrentTitle":true,"setCurrentJob":true,"setPreviousTitle":true,"setPreviousJob":true,"setSkillsCount":true,"setConnectionsCount":true}

3.) Quora Service:-

URL :- 
http://localhost:2727/socialite/quora?personId=333

Returns :-
QuoraResponse

Sample output:-
{"id":"Yashraj","currentTitle":"Software Engineer","currentJob":"ABC Company","previousTitle":"Software Engineer","previousJob":"XYZ Company","skillsCount":200,"connectionsCount":400,"setId":true,"setCurrentTitle":true,"setCurrentJob":true,"setPreviousTitle":true,"setPreviousJob":true,"setSkillsCount":true,"setConnectionsCount":true}

4.) Socialite Service:-

URL :- 
http://localhost:2727/socialite/socialite?personId=333

Returns :-
SocialiteResponse

Sample output:-
{"id":"Yashraj","facebookResponse":{"id":"Yashraj","profilePicturesCount":100,"coverPicturesCount":200,"likesCount":300,"commentsCount":400,"sharesCount":1234,"setId":true,"setProfilePicturesCount":true,"setCoverPicturesCount":true,"setLikesCount":true,"setCommentsCount":true,"setSharesCount":true},"linkedInResponse":{"id":"Yashraj","currentTitle":"Software Engineer","currentJob":"ABC Company","previousTitle":"Software Engineer","previousJob":"XYZ Company","skillsCount":200,"connectionsCount":400,"setId":true,"setCurrentTitle":true,"setCurrentJob":true,"setPreviousTitle":true,"setPreviousJob":true,"setSkillsCount":true,"setConnectionsCount":true},"quoraResponse":{"id":"Yashraj","questionsCount":100,"answersCount":200,"upVotesCount":300,"downVotesCount":400,"wantsAnswersCount":400,"setId":true,"setQuestionsCount":true,"setAnswersCount":true,"setUpVotesCount":true,"setDownVotesCount":true,"setWantsAnswersCount":true},"twitterResponse":{"id":"Yashraj","tweetsCount":100,"likesCount":200,"reTweetCount":300,"favoritesCount":400,"setId":true,"setLikesCount":true,"setTweetsCount":true,"setReTweetCount":true,"setFavoritesCount":true},"youtubeResponse":{"id":"Yashraj","videosCount":100,"subscriptionCount":200,"likesCount":300,"commentsCount":400,"setId":true,"setLikesCount":true,"setCommentsCount":true,"setVideosCount":true,"setSubscriptionCount":true},"setId":true,"setFacebookResponse":true,"setLinkedInResponse":true,"setQuoraResponse":true,"setTwitterResponse":true,"setYoutubeResponse":true}

5.) Twitter Service:-

URL :- 
http://localhost:2727/socialite/twitter?personId=333

Returns :-
TwitterResponse

Sample output:-
{"id":"Yashraj","tweetsCount":100,"likesCount":200,"reTweetCount":300,"favoritesCount":400,"setId":true,"setLikesCount":true,"setTweetsCount":true,"setReTweetCount":true,"setFavoritesCount":true}


6.) Youtube Service:-

URL :- 
http://localhost:2727/socialite/youtube?personId=333

Returns :-
YoutubeResponse

Sample output:-
{"id":"Yashraj","videosCount":100,"subscriptionCount":200,"likesCount":300,"commentsCount":400,"setId":true,"setLikesCount":true,"setCommentsCount":true,"setVideosCount":true,"setSubscriptionCount":true}
