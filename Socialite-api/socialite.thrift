include "facebook.thrift"
include "linkedIn.thrift"
include "quora.thrift"
include "twitter.thrift"
include "youtube.thrift"

/**
 * Structure representing basic user Socialite account information.
 */
struct SocialiteResponse {

    /**
     * The unique identifier for the socialite account.
     */
     1: required string id;

    /**
     * The facebook basic information of the user.
     */
     2: optional facebook.FacebookResponse facebookResponse;

    /**
     * The facebook basic information of the user.
     */
     3: optional linkedIn.LinkedInResponse linkedInResponse;

    /**
     * The facebook basic information of the user.
     */
     4: optional quora.QuoraResponse quoraResponse;

    /**
     * The facebook basic information of the user.
     */
     5: optional twitter.TwitterResponse twitterResponse;

    /**
     * The facebook basic information of the user.
     */
     6: optional youtube.YoutubeResponse youtubeResponse;

}

/**
 * Criteria defining the socialite response to retrieve.
 */
struct SocialiteCriteria {

    /**
     * The unique identifier of the person to retrieve the socialite account information.
     */
     1: required string personId;

}