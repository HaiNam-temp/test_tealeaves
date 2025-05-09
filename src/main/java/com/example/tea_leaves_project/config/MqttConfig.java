package com.example.tea_leaves_project.config;

import com.example.tea_leaves_project.dto.QRScannerData;
import com.example.tea_leaves_project.entity.Warehouse;
import com.example.tea_leaves_project.service.WarehouseService;
import com.example.tea_leaves_project.util.MapperUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Data
@Configuration
@ConfigurationProperties(prefix = "mqtt")
public class MqttConfig {
//    @Autowired
//    WarehouseService warehouseService;
//    @Value("${mqtt.broker}")
//    private String broker;
//
//    @Value("${mqtt.username}")
//    private String username;
//
//    @Value("${mqtt.password}")
//    private String password;
//
//    @Value("${mqtt.clean-session:true}")
//    private boolean cleanSession;
//
//    @Value("${mqtt.client-id}")
//    private String clientId;
//
//    @Value("${mqtt.qr-topic}")
//    private String qrTopic;
//
//    @Bean
//    public MessageChannel mqttInputChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public MessageChannel mqttOutboundChannel() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public MqttPahoClientFactory mqttPahoClientFactory(){
//        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
//        MqttConnectOptions options = new MqttConnectOptions();
//        options.setCleanSession(cleanSession);
//        options.setConnectionTimeout(30);
//        options.setKeepAliveInterval(60);
//        options.setAutomaticReconnect(true);
//        options.setServerURIs(new String[]{broker});
//        options.setUserName(username);
//        options.setPassword(password.toCharArray());
//        factory.setConnectionOptions(options);
//        return factory;
//    }
//
//    @Bean
//    public MessageProducer inbound() {
//        MqttPahoMessageDrivenChannelAdapter adapter =
//                new MqttPahoMessageDrivenChannelAdapter(clientId, mqttPahoClientFactory(), "esp32/data", "esp32_1/data");
//        adapter.setCompletionTimeout(20000);
//        adapter.setConverter(new DefaultPahoMessageConverter());
//        adapter.setQos(1);
//        adapter.setOutputChannel(mqttInputChannel());
//        return adapter;
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel = "mqttOutboundChannel")
//    public MessageHandler outbound() {
//        MqttPahoMessageHandler messageHandler =
//                new MqttPahoMessageHandler(clientId + "_outbound", mqttPahoClientFactory());
//        messageHandler.setAsync(true);
//        messageHandler.setDefaultTopic(qrTopic);
//        messageHandler.setDefaultQos(1);
//        return messageHandler;
//    }
//
//    // hàm subscribe topic qrcode từ mqtt
//    @Bean
//    @ServiceActivator(inputChannel = "mqttInputChannel")
//    public MessageHandler handler() {
//        return message -> {
//            String topic = (String) message.getHeaders().get(MqttHeaders.RECEIVED_TOPIC);
//            String payload = (String) message.getPayload();
//            log.info("Received topic: {}, and payload: {}", topic, payload);
//            QRScannerData data = MapperUtil.parseJson(payload, QRScannerData.class);
//            warehouseService.scanQrCode(topic,data);
//        };
//    }

}
