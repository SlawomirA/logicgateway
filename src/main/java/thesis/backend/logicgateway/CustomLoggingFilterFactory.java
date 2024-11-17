package thesis.backend.logicgateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.GatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomLoggingFilterFactory implements GatewayFilterFactory<Object> {

    private final CustomLoggingFilter customLoggingFilter;

    public CustomLoggingFilterFactory(CustomLoggingFilter customLoggingFilter) {
        this.customLoggingFilter = customLoggingFilter;
    }

    @Override
    public GatewayFilter apply(Object config) {
        return customLoggingFilter; // Return the actual filter instance
    }

    @Override
    public Class<Object> getConfigClass() {
        return Object.class;
    }
}