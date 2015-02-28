/**
 * Structure representing basic user Quora account information.
 */
struct socialite.objects.QuoraResponse {

    /**
     * The unique identifier for the quora account.
     */
     1: required string id;

    /**
     * Count of number of questions asked by the user.
     */
     2: optional i64 questionsCount;

    /**
     * Count of number of questions answered by the user.
     */
     3: optional i64 answersCount;

    /**
     * Count of number of answers up voted by the user.
     */
     4: optional i64 upVotesCount;

    /**
     * Count of number of answers down voted by the user.
     */
     5: optional i64 downVotesCount;

    /**
     * Count of number of wants answers requested by the user.
     */
     6: optional i64 wantsAnswersCount;

}

/**
 * Criteria defining the quora response to retrieve.
 */
struct socialite.objects.QuoraCriteria {

    /**
     * The unique identifier of the person to retrieve the quora account information.
     */
     1: required string personId;

}