/**
 * Structure representing basic user LinkedIn account information.
 */
struct socialite.objects.LinkedInResponse {

    /**
     * The unique identifier for the linkedIn account.
     */
     1: required string id;

    /**
     * Current job title of the user.
     */
     2: optional string currentTitle;

    /**
     * Current company the user works for.
     */
     3: optional string currentJob;

    /**
     * Previous job title of the user.
     */
     4: optional string previousTitle;

    /**
     * Previous company the user works for.
     */
     5: optional string previousJob;

    /**
     * Count of number of skills user has.
     */
     6: optional i64 skillsCount;

    /**
     * Count of number of connections user has.
     */
     7: optional i64 connectionsCount;

}

/**
 * Criteria defining the linkedIn response to retrieve.
 */
struct socialite.objects.LinkedInCriteria {

    /**
     * The unique identifier of the person to retrieve the linkedIn account information.
     */
     1: required string personId;

}