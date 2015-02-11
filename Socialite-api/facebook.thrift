/**
 * Structure representing basic user Facebook account information.
 */
struct FacebookResponse {

    /**
     * The unique identifier for the facebook account.
     */
     1: required string id;

    /**
     * Count of number of profile pictures of the user.
     */
     2: optional i64 profilePicturesCount;

    /**
     * Count of number of cover pictures of the user.
     */
     3: optional i64 coverPicturesCount;

    /**
     * Count of number of likes made by the user.
     */
     4: optional i64 likesCount;

    /**
     * Count of number of comments made by the user.
     */
     5: optional i64 commentsCount;

    /**
     * Count of number of shares made by the user.
     */
     6: optional i64 sharesCount;

}

/**
 * Criteria defining the facebook response to retrieve.
 */
struct FacebookCriteria {

    /**
     * The unique identifier of the person to retrieve the facebook account information.
     */
     1: required string personId;

}