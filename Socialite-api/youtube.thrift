/**
 * Structure representing basic user Youtube account information.
 */
struct socialite.objects.YoutubeResponse {

    /**
     * The unique identifier for the youtube account.
     */
     1: required string id;

    /**
     * Count of number of videos uploaded by the user.
     */
     2: optional i64 videosCount;

    /**
     * Count of number of channels subscribed by the user.
     */
     3: optional i64 subscriptionCount;

    /**
     * Count of number of likes made by the user.
     */
     4: optional i64 likesCount;

    /**
     * Count of number of comments made by the user.
     */
     5: optional i64 commentsCount;

}

/**
 * Criteria defining the youtube response to retrieve.
 */
struct socialite.objects.YoutubeCriteria {

    /**
     * The unique identifier of the person to retrieve the youtube account information.
     */
     1: required string personId;

}