include "facebook.thrift"
include "linkedIn.thrift"
include "quora.thrift"
include "twitter.thrift"
include "youtube.thrift"

/**
 * Structure representing basic user Socialite account information.
 */
struct socialite.objects.SocialiteResponse {

    /**
     * The unique identifier for the socialite account.
     */
     1: required string id;

    /**
     * The facebook basic information of the user.
     */
     2: optional facebook.socialite.objects.FacebookResponse facebookResponse;

    /**
     * The facebook basic information of the user.
     */
     3: optional linkedIn.socialite.objects.LinkedInResponse linkedInResponse;

    /**
     * The facebook basic information of the user.
     */
     4: optional quora.socialite.objects.QuoraResponse quoraResponse;

    /**
     * The facebook basic information of the user.
     */
     5: optional twitter.socialite.TwitterResponse1 twitterResponse;

    /**
     * The facebook basic information of the user.
     */
     6: optional youtube.socialite.objects.YoutubeResponse youtubeResponse;

}

/**
 * Criteria defining the socialite response to retrieve.
 */
struct socialite.objects.SocialiteCriteria {

    /**
     * The unique identifier of the person to retrieve the socialite account information.
     */
     1: required string personId;

}