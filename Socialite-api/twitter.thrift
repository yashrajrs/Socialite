/**
 * Structure representing basic user Twitter account information.
 */
struct socialite.TwitterResponse1 {

    /**
     * The unique identifier for the twitter account.
     */
     1: required string id;

    /**
     * Count of number of tweets made by the user.
     */
     2: optional i64 tweetsCount;

    /**
     * Count of number of tweets likes by the user.
     */
     3: optional i64 likesCount;

    /**
     * Count of number of re-tweets made by the user.
     */
     4: optional i64 reTweetCount;

    /**
     * Count of number of favorites made by the user.
     */
     5: optional i64 favoritesCount;

}

/**
 * Criteria defining the twitter response to retrieve.
 */
struct socialite.objects.TwitterCriteria {

    /**
     * The unique identifier of the person to retrieve the twitter account information.
     */
     1: required string personId;

}