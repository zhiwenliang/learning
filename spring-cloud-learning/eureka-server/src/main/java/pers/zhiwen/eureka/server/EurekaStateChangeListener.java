package pers.zhiwen.eureka.server;

import com.netflix.appinfo.InstanceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateChangeListener {
    private final Logger log = LoggerFactory.getLogger(getClass());

    /**
     * service down
     *
     * @param event
     */
    @EventListener
    public void list(EurekaInstanceCanceledEvent event) {
        log.info("{} \t {} service is down.", event.getServerId(), event.getAppName());
    }

    /**
     * register service
     *
     * @param event
     */
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("{}:{} \t {} service is up.", instanceInfo.getIPAddr(), instanceInfo.getPort(), instanceInfo.getAppName());
    }

    /**
     * renew service
     *
     * @param event
     */
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        log.info("{} \t {} service is renewed.", event.getServerId(), event.getAppName());
    }


    /**
     * eureka server start
     * @param event
     */
    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        log.info("Eureka server is started.");
    }
}
