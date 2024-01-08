package co.wali.desisoft._tuto;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class AppPropertiesData {

    private String apiSid;
    private String acSic;
    private String authToken;


}
