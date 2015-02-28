package socialite.service;

import socialite.*;
import socialite.objects.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 * Resource layer for the rest service.
 *
 * @author Yashraj R. Sontakke
 */
@Path("/socialite")
@Produces(MediaType.APPLICATION_JSON)
public final class SocialiteResource {


    @GET
    @Path("facebook")
    public FacebookResponse getFaceBookData(@QueryParam("personId") final Long personId) {

        final FacebookResponse facebookResponse = new FacebookResponse();
        facebookResponse.setId("Yashraj");
        facebookResponse.setProfilePicturesCount(100);
        facebookResponse.setCoverPicturesCount(200);
        facebookResponse.setLikesCount(300);
        facebookResponse.setCommentsCount(400);
        facebookResponse.setSharesCount(personId);
        return facebookResponse;
    }

    @GET
    @Path("linkedIn")
    public LinkedInResponse getLinkedInData(@QueryParam("personId") final Long personId) {

        final LinkedInResponse linkedInResponse = new LinkedInResponse();
        linkedInResponse.setId("Yashraj");
        linkedInResponse.setCurrentTitle("Software Engineer");
        linkedInResponse.setCurrentJob("ABC Company");
        linkedInResponse.setPreviousTitle("Software Engineer");
        linkedInResponse.setPreviousJob("XYZ Company");
        linkedInResponse.setSkillsCount(200);
        linkedInResponse.setConnectionsCount(400);
        return linkedInResponse;
    }

    @GET
    @Path("quora")
    public QuoraResponse getQuoraData(@QueryParam("personId") final Long personId) {

        final QuoraResponse quoraResponse = new QuoraResponse();
        quoraResponse.setId("Yashraj");
        quoraResponse.setQuestionsCount(100);
        quoraResponse.setAnswersCount(200);
        quoraResponse.setUpVotesCount(300);
        quoraResponse.setDownVotesCount(400);
        quoraResponse.setWantsAnswersCount(400);
        return quoraResponse;
    }

    @GET
    @Path("socialite")
    public SocialiteResponse getSocialiteResponseData(@QueryParam("personId") final Long personId) {

        final SocialiteResponse socialiteResponse = new SocialiteResponse();

        final FacebookResponse facebookResponse = getFaceBookData(1234L);
        final LinkedInResponse linkedInResponse = getLinkedInData(1234L);
        final QuoraResponse quoraResponse = getQuoraData(1234L);
        final TwitterResponse twitterResponse = getTwitterData(1234L);
        final YoutubeResponse youtubeResponse = getYoutubeData(1234L);

        socialiteResponse.setId("Yashraj");
        socialiteResponse.setFacebookResponse(facebookResponse);
        socialiteResponse.setLinkedInResponse(linkedInResponse);
        socialiteResponse.setQuoraResponse(quoraResponse);
        socialiteResponse.setTwitterResponse(twitterResponse);
        socialiteResponse.setYoutubeResponse(youtubeResponse);
        return socialiteResponse;
    }

    @GET
    @Path("twitter")
    public TwitterResponse getTwitterData(@QueryParam("personId") final Long personId) {

        final TwitterResponse twitterResponse = new TwitterResponse();
        twitterResponse.setId("Yashraj");
        twitterResponse.setTweetsCount(100);
        twitterResponse.setLikesCount(200);
        twitterResponse.setReTweetCount(300);
        twitterResponse.setFavoritesCount(400);
        return twitterResponse;
    }

    @GET
    @Path("youtube")
    public YoutubeResponse getYoutubeData(@QueryParam("personId") final Long personId) {

        final YoutubeResponse youtubeResponse = new YoutubeResponse();
        youtubeResponse.setId("Yashraj");
        youtubeResponse.setVideosCount(100);
        youtubeResponse.setSubscriptionCount(200);
        youtubeResponse.setLikesCount(300);
        youtubeResponse.setCommentsCount(400);
        return youtubeResponse;
    }
}
