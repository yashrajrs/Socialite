package socialite.service;


import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;


/**
 * Rest service.
 *
 * @author Yashraj R. Sontakke
 */
public final class SocialiteService extends Service<SocialiteConfiguration> {
    public static void main(String[] args) throws Exception {
        new SocialiteService().run(args);
    }

    @Override
    public void initialize(Bootstrap bootstrap) {
        bootstrap.setName("socialite-rest");
    }

    @Override
    public void run(SocialiteConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new SocialiteResource());
    }
}
